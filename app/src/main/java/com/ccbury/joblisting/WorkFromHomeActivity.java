package com.ccbury.joblisting;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkFromHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.work_from_home);

        Button homeBack = findViewById(R.id.home);
        homeBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent activity2Intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(activity2Intent);
            }
        });

        Button gradJob = findViewById(R.id.job1);
        gradJob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent activity2Intent = new Intent(getApplicationContext(), GradJobActivity.class);
                startActivity(activity2Intent);
            }
        });

    }


}