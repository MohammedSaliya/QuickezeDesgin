package com.spiderindia.quickezedesgin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

public class LocationsetActivity extends AppCompatActivity {

    Button btn_current_location, btn_service_location;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locationset);


        btn_current_location = findViewById(R.id.btn_current_location);
        btn_current_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LocationsetActivity.this, RecommendedActivity.class));
            }

        });

    }

}
