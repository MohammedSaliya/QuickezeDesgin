package com.spiderindia.quickezedesgin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.spiderindia.quickezedesgin.Adapter.ServiceAdapter;
import com.spiderindia.quickezedesgin.Bean.AllServices;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyr on 18-Sep-18.
 */

public class AllServiceMainActivity extends AppCompatActivity {

    private List<AllServices> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ServiceAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allservices);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        mAdapter = new ServiceAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {

        AllServices allServices = new AllServices(R.drawable.electrician, "Electrician");
        movieList.add(allServices);

        allServices = new AllServices(R.drawable.electrician, "Plumper");
        movieList.add(allServices);

        allServices = new AllServices(R.drawable.electrician, "Carpenter");
        movieList.add(allServices);
        allServices = new AllServices(R.drawable.electrician, "Pest Control");
        movieList.add(allServices);
        allServices = new AllServices(R.drawable.electrician, "Home Deep Cleaning ");
        movieList.add(allServices);
        allServices = new AllServices(R.drawable.electrician, "Sofa Cleaning");
        movieList.add(allServices);
        allServices = new AllServices(R.drawable.electrician, "Ac Service");
        movieList.add(allServices);
        allServices = new AllServices(R.drawable.electrician, "Electrician");
        movieList.add(allServices);
    }
}


