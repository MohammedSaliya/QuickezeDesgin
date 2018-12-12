package com.spiderindia.quickezedesgin;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class RecommendedActivity extends AppCompatActivity {


    LinearLayout building_repair, home_cleaning, pro_managment, layout_amc, health_fitness, ring_wedding, key, tax_business;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended);


        building_repair = findViewById(R.id.building_repair);
        home_cleaning = findViewById(R.id.home_cleaning);
        pro_managment = findViewById(R.id.pro_managment);
        layout_amc = findViewById(R.id.layout_amc);
        health_fitness = findViewById(R.id.health_fitness);
        ring_wedding = findViewById(R.id.ring_wedding);
        key = findViewById(R.id.key);
        tax_business = findViewById(R.id.tax_business);


        building_repair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecommendedActivity.this, AlserActivity.class));

            }
        });
        home_cleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecommendedActivity.this, AlserActivity.class));

            }
        });
        pro_managment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecommendedActivity.this, AlserActivity.class));

            }
        });
        layout_amc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecommendedActivity.this, AlserActivity.class));

            }
        });
        health_fitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecommendedActivity.this, AlserActivity.class));

            }
        });
        ring_wedding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecommendedActivity.this, AlserActivity.class));

            }
        });

        key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecommendedActivity.this, AlserActivity.class));

            }
        });
        tax_business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecommendedActivity.this, AlserActivity.class));

            }
        });

    }
}

