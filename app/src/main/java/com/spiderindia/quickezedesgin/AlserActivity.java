package com.spiderindia.quickezedesgin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AlserActivity extends AppCompatActivity {

    ImageView back;

    LinearLayout electrician, plumper, carpenter, pest_control, home_deep_cleaning, sofa_cleaing, ac_service;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alser);

        electrician = findViewById(R.id.electrician);

        back = findViewById(R.id.back);


        plumper = findViewById(R.id.plumper);

        carpenter = findViewById(R.id.carpenter);

        pest_control = findViewById(R.id.pest_control);

        home_deep_cleaning = findViewById(R.id.home_deep_cleaning);

        sofa_cleaing = findViewById(R.id.sofa_cleaing);
        ac_service = findViewById(R.id.ac_service);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlserActivity.this, RecommendedActivity.class));

            }
        });


        electrician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlserActivity.this, PlumperServiceActivity.class));

            }
        });
        plumper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlserActivity.this, PlumperServiceActivity.class));

            }
        });
        carpenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlserActivity.this, PlumperServiceActivity.class));

            }
        });
        pest_control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlserActivity.this, PlumperServiceActivity.class));

            }
        });
        home_deep_cleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlserActivity.this, PlumperServiceActivity.class));

            }
        });
        sofa_cleaing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlserActivity.this, PlumperServiceActivity.class));

            }
        });
        ac_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlserActivity.this, PlumperServiceActivity.class));

            }
        });

    }

}