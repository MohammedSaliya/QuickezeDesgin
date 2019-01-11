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
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.spiderindia.quickezedesgin.AlserActivity;
import com.spiderindia.quickezedesgin.Bean.Dashboard.DashBoardModel;
import com.spiderindia.quickezedesgin.PrefManager;
import com.spiderindia.quickezedesgin.R;

public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.ViewHolder> {

    private static final String TAG = "AdapterClass";
    private Context context;
    DashBoardModel dashBoardModuel;


    public DashBoardAdapter(Context context, DashBoardModel dashBoardModel) {
        this.context = context;
        this.dashBoardModuel = dashBoardModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_dashboard_adapters, viewGroup, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder,final int i) {

        dashBoardModuel.getData().get(i).getId();


//        Picasso.get().load(module.getImage()).into(viewHolder.imageView);

        Glide
                .with(context)
                .load(dashBoardModuel.getData().get(i).getService_image())
                .into(viewHolder.imageView);


        viewHolder.textView.setText(dashBoardModuel.getData().get(i).getService_name());
        viewHolder.adapterid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(context, String.valueOf(dashBoardModuel.getData().get(i).getId()), Toast.LENGTH_SHORT).show();
                new PrefManager(context).saveid(String.valueOf(dashBoardModuel.getData().get(i).getId()));
                Intent intent = new Intent(context, AlserActivity.class);
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return dashBoardModuel.getData().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        LinearLayout adapterid;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.title);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            adapterid = (LinearLayout) itemView.findViewById(R.id.adapterid);
        }
    }
}

