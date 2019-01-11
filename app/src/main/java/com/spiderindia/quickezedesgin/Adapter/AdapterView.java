package com.spiderindia.quickezedesgin.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.spiderindia.quickezedesgin.AlserActivity;
import com.spiderindia.quickezedesgin.Bean.Service.ServiceData;
import com.spiderindia.quickezedesgin.Bean.Service.ServiceId;
import com.spiderindia.quickezedesgin.PlumperServiceActivity;
import com.spiderindia.quickezedesgin.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterView extends RecyclerView.Adapter<AdapterView.GetVIewHolder> {

    //    List<ServiceData> servicelist = new ArrayList<>();
    ServiceId serviceId;
    Context context;

    public AdapterView(Context context, ServiceId serviceId) {
        this.serviceId = serviceId;
        this.context = context;
    }


    @NonNull
    @Override
    public AdapterView.GetVIewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.service_view, viewGroup, false);
        return new GetVIewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GetVIewHolder getVIewHolder, final int i) {
        getVIewHolder.title_service.setText(serviceId.getData().get(i).getServiceCategoryName());

        Glide
                .with(context)
                .load(serviceId.getData().get(i).getServiceCategoryImage())
                .into(getVIewHolder.image_service);

        getVIewHolder.linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, PlumperServiceActivity.class);
                intent.putExtra("position", serviceId.getData().get(i).getId());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return serviceId.getData().size();
    }

    public class GetVIewHolder extends RecyclerView.ViewHolder {
        public ImageView image_service;
        public TextView title_service;
        LinearLayout linear;

        public GetVIewHolder(@NonNull View itemView) {
            super(itemView);

            image_service = itemView.findViewById(R.id.image_service);
            title_service = itemView.findViewById(R.id.title_service);
            linear = itemView.findViewById(R.id.linear);
        }

    }
}


