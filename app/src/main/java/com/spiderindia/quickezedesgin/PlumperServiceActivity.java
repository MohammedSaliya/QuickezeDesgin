package com.spiderindia.quickezedesgin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PlumperServiceActivity extends AppCompatActivity {

    Button btn_schedule_your_service;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plumper_service);


        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlumperServiceActivity.this, AlserActivity.class));

            }
        });

        btn_schedule_your_service = findViewById(R.id.btn_schedule_your_service);
        btn_schedule_your_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlumperServiceActivity.this, PlumperActivity.class));

            }
        });
    }
}
