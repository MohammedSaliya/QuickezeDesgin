package com.spiderindia.quickezedesgin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.spiderindia.quickezedesgin.APIClass.ApiClient;
import com.spiderindia.quickezedesgin.Adapter.AdapterView;
import com.spiderindia.quickezedesgin.Bean.Service.ServiceId;

import org.json.JSONException;
import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AlserActivity extends AppCompatActivity {

    ImageView back;
    RecyclerView recyclerview;
    ServiceId serviceId;
    AdapterView adapterView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alser);

        back = findViewById(R.id.back);

        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerview.setLayoutManager(layoutManager);
        Showdata();


        recyclerview.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerview, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent intent = new Intent(AlserActivity.this, PlumperServiceActivity.class);
                intent.putExtra("position", position);

                startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlserActivity.this, RecommendedActivity.class));

            }
        });


    }

    private void Showdata() {

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("service_id", "3");
        } catch (JSONException e) {
            e.printStackTrace();
        }


        final Call<ServiceId> serviceIdCall = ApiClient
                .getApiClient()
                .apiInterface()
                .GetAllServicecategories(jsonObject.toString());


        serviceIdCall.enqueue(new Callback<ServiceId>() {
            @Override
            public void onResponse(Call<ServiceId> call, Response<ServiceId> response) {

                serviceId = response.body();
                Toast.makeText(AlserActivity.this, serviceId.getMessage(), Toast.LENGTH_SHORT).show();

                adapterView = new AdapterView(AlserActivity.this, serviceId);


                recyclerview.setAdapter(adapterView);

            }


            @Override
            public void onFailure(Call<ServiceId> call, Throwable t) {
                Toast.makeText(AlserActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}

