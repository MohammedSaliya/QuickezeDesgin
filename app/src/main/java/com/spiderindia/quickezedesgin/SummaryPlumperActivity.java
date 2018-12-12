package com.spiderindia.quickezedesgin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SummaryPlumperActivity extends AppCompatActivity {

    Button btn_reschedule;
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_plumper_summary);


        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SummaryPlumperActivity.this, AddressPlumperActivity.class));


            }
        });

        btn_reschedule = findViewById(R.id.btn_reschedule);
        btn_reschedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SummaryPlumperActivity.this, fbGoogleActivity.class));

            }
        });
    }
}