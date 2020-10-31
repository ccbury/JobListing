package com.ccbury.joblisting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button workFromHome = findViewById(R.id.workFromHome);
        workFromHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                System.out.print("clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), WorkFromHomeActivity.class);
                startActivity(activity2Intent);
            }
        });
    }
}