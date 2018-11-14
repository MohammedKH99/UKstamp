package com.example.alhalim.ukstamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    private Button student,admin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        student=(Button)findViewById(R.id.stdbtn);
        admin=(Button)findViewById(R.id.admnbtn);

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent std=new Intent(MainPage.this,LoginPage.class);
                startActivity(std);
            }
        });
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent admin=new Intent(MainPage.this,AdminHome.class);
                startActivity(admin);
            }
        });
    }

}
