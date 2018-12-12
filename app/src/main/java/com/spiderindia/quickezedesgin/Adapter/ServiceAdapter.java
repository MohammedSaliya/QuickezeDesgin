package com.spiderindia.quickezedesgin.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.spiderindia.quickezedesgin.Bean.AllServices;
import com.spiderindia.quickezedesgin.R;

import java.util.List;

/**
 * Created by pyr on 18-Sep-18.
 */

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.MyViewHolder> {

    private List<AllServices> servicesList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView title;

        public MyViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_service);
            title = itemView.findViewById(R.id.title_service);

        }
    }

    public ServiceAdapter(List<AllServices> servicesList) {
        this.servicesList = servicesList;
    }

    @NonNull
    @Override
    public ServiceAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.allservice_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        AllServices allServices = servicesList.get(position);
        holder.image.setImageResource(allServices.getImage());
        holder.title.setText(allServices.getTitle());
    }

    @Override
    public int getItemCount() {
        return servicesList.size();
    }


}
