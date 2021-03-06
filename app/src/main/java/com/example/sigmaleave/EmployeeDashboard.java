package com.example.sigmaleave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmployeeDashboard extends AppCompatActivity {
    private Button btn,btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_dashboard);
        btn=findViewById(R.id.PROF);
        btn1=findViewById(R.id.vieww);
        btn2=findViewById(R.id.apply);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EmployeeDashboard.this,ApplyForLeave.class);
                startActivity(intent);

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EmployeeDashboard.this,RecyclerViewLeaves.class);
                startActivity(intent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EmployeeDashboard.this,UpdateProfile.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
