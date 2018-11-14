package com.example.alhalim.ukstamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentHome extends AppCompatActivity {
    private Button quiz,animation,cources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home);
        quiz=(Button)findViewById(R.id.btn2);
        cources=(Button)findViewById(R.id.btn3);
        animation=(Button)findViewById(R.id.btn4);

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quiz=new Intent(StudentHome.this,Sample_quiz.class);
                startActivity(quiz);
            }
        });

        cources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cource=new Intent(StudentHome.this,Available_cources.class);
                startActivity(cource);
            }
        });
        animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent animation1=new Intent(StudentHome.this,Animation_cources.class);
                startActivity(animation1);
            }
        });

    }
}
