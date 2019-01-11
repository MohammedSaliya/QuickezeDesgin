package com.spiderindia.quickezedesgin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.spiderindia.quickezedesgin.APIClass.ApiClient;
import com.spiderindia.quickezedesgin.Adapter.DashBoardAdapter;
import com.spiderindia.quickezedesgin.Bean.Dashboard.DashBoardModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecommendedActivity extends AppCompatActivity {


    LinearLayout building_repair;
    DashBoardModel dashBoardModel;
    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended);




        recyclerview = findViewById(R.id.recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerview.setLayoutManager(gridLayoutManager);


        Listdata();

    }

    private void Listdata() {


        final Call<DashBoardModel> dashBoardModuelCall = ApiClient
                .getApiClient()
                .apiInterface()
                .getServiceDashBoard();

        dashBoardModuelCall.enqueue(new Callback<DashBoardModel>() {
            @Override
            public void onResponse(Call<DashBoardModel> call, Response<DashBoardModel> response) {

                dashBoardModel = response.body();
                Toast.makeText(RecommendedActivity.this, response.message(), Toast.LENGTH_SHORT).show();
                DashBoardAdapter DashBoardAdapter = new DashBoardAdapter(RecommendedActivity.this, dashBoardModel);
                recyclerview.setAdapter(DashBoardAdapter);


            }

            @Override
            public void onFailure(Call<DashBoardModel> call, Throwable t) {
                Toast.makeText(RecommendedActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }


}



