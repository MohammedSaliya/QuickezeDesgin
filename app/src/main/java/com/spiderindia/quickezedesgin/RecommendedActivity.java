package com.spiderindia.quickezedesgin;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.spiderindia.quickezedesgin.APIClass.ApiClient;
import com.spiderindia.quickezedesgin.Adapter.RecommAdapter;
import com.spiderindia.quickezedesgin.Bean.Recomm.DashBoardModuel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecommendedActivity extends AppCompatActivity {


    LinearLayout building_repair, home_cleaning;

    RecyclerView recyclerview;
    DashBoardModuel dashBoardModuel;
    RecommAdapter recommAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended);


        building_repair = findViewById(R.id.building_repair);
        home_cleaning = findViewById(R.id.home_cleaning);


        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerview.setLayoutManager(layoutManager);



        recyclerview.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerview, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent intent = new Intent(RecommendedActivity.this, AlserActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        Listdata();

    }

    private void Listdata() {



        final Call<DashBoardModuel> dashBoardModuelCall = ApiClient
                .getApiClient()
                .apiInterface()
                .getService();

        dashBoardModuelCall.enqueue(new Callback<DashBoardModuel>() {
            @Override
            public void onResponse(Call<DashBoardModuel> call, Response<DashBoardModuel> response) {
                dashBoardModuel = response.body();

                    Toast.makeText(RecommendedActivity.this, response.message(), Toast.LENGTH_SHORT).show();
                    recommAdapter = new RecommAdapter(RecommendedActivity.this, dashBoardModuel);


                    recyclerview.setAdapter(recommAdapter);


            }

            @Override
            public void onFailure(Call<DashBoardModuel> call, Throwable t) {
                Toast.makeText(RecommendedActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }
    }



