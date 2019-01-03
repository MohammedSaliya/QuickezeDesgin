package com.spiderindia.quickezedesgin.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.spiderindia.quickezedesgin.Bean.Recomm.DashBoardModuel;
import com.spiderindia.quickezedesgin.R;

public class RecommAdapter extends RecyclerView.Adapter<RecommAdapter.GetVIewHolder> {

    DashBoardModuel dashBoardModuel;
    Context context;



    public RecommAdapter(Context context, DashBoardModuel dashBoardModuel) {
        this.context = context;
        this.dashBoardModuel = dashBoardModuel;

    }


    @NonNull
    @Override
    public RecommAdapter.GetVIewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_view, viewGroup, false);
        return new GetVIewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GetVIewHolder getVIewHolder, int i) {
        getVIewHolder.creamtext.setText(dashBoardModuel.getData().get(i).getService_name());
        getVIewHolder.homecleaingtext.setText(dashBoardModuel.getData().get(i).getService_name());



        Glide
                .with(context)
                .load(dashBoardModuel.getData().get(i).getService_image())
                .into(getVIewHolder.cream);
        Glide
                .with(context)
                .load(dashBoardModuel.getData().get(i).getService_image())
                .into(getVIewHolder.homecleaning);

    }


    @Override
    public int getItemCount() {
        return dashBoardModuel.getData().size();
    }

    public class GetVIewHolder extends RecyclerView.ViewHolder {
        public ImageView cream, homecleaning;
        public TextView creamtext, homecleaingtext;


        public GetVIewHolder(@NonNull View itemView) {
            super(itemView);

            cream = itemView.findViewById(R.id.cream);
            homecleaning = itemView.findViewById(R.id.homecleaning);

            creamtext = itemView.findViewById(R.id.creamtext);
            homecleaingtext = itemView.findViewById(R.id.homecleaingtext);

        }
    }
}
