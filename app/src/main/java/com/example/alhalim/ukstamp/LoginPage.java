package com.example.alhalim.ukstamp;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginPage extends AppCompatActivity {
    public DatabaseReference dataref;

    public Button mLogin;
    public TextInputEditText memail2;
    public TextInputEditText mpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        mLogin=(Button)findViewById(R.id.loginbtn);
        memail2=(TextInputEditText)findViewById(R.id.txt12);
        mpassword=(TextInputEditText)findViewById(R.id.txt22);

        dataref= FirebaseDatabase.getInstance().getReference().child("Users");

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = memail2.getText().toString();
                final String password = mpassword.getText().toString();
                dataref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        String email1 = dataSnapshot.child("Email").getValue().toString();
                        String pass1=dataSnapshot.child("password").getValue().toString();

                        if(email.equals(email1) && password.equals(pass1)){
                            Intent login=new Intent(LoginPage.this,MainPage.class);
                            startActivity(login);

                        }else
                            Toast.makeText(LoginPage.this, "Error not found", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

    }
}
