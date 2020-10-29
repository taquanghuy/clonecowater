package com.pigllet.clonecowater.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.pigllet.clonecowater.R;
import com.pigllet.clonecowater.ui.report.OnItemClickListenner;
import com.pigllet.clonecowater.ultis.home.Datum;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private List<Datum> datas;
    private Context context;
    OnItemClickListenner onItemClickListenner;


    public HomeAdapter(List<Datum> datas, Context context, OnItemClickListenner onItemClickListenner) {
        this.datas = datas;
        this.context = context;
        this.onItemClickListenner = onItemClickListenner;
    }

    public void updateData(List<Datum> data) {
        this.datas.clear();
        this.datas.addAll(data);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Datum datum = datas.get(position);
        holder.txtHome.setText(datum.getName());
        holder.clItemHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListenner.onItemClick(position);
            }
        });
    }


    @Override
    public int getItemCount() {
        return datas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtHome;
        ConstraintLayout clItemHome;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtHome = itemView.findViewById(R.id.txtHome);
            clItemHome = itemView.findViewById(R.id.clItemHome);

        }
    }
}
