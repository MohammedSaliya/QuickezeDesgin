package com.spiderindia.quickezedesgin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PlumperActivity extends AppCompatActivity {

    Button btn_plumber_next;

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plumper);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlumperActivity.this, PlumperServiceActivity.class));

            }
        });

        btn_plumber_next = findViewById(R.id.btn_plumber_next);
        btn_plumber_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlumperActivity.this, DateSelectActivity.class));

            }
        });

    }
}
