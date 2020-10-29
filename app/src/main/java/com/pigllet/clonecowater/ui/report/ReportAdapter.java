package com.pigllet.clonecowater.ui.report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.pigllet.clonecowater.R;
import com.pigllet.clonecowater.ultis.report.ReportResponse;

import java.util.ArrayList;
import java.util.List;

public class ReportAdapter extends RecyclerView.Adapter<ReportAdapter.ViewHolder> {
    private List<ReportResponse.Data.ReportActivity> activitiesResponseList;
    private Context context;
    private OnItemClickListenner callBack;


    public ReportAdapter(Context context, OnItemClickListenner callBack) {
        this.activitiesResponseList = new ArrayList<>();
        this.context = context;
        this.callBack = callBack;
    }

    public void updateData(List<ReportResponse.Data.ReportActivity> activityList){
        this.activitiesResponseList.clear();
        this.activitiesResponseList.addAll(activityList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_report, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ReportAdapter.ViewHolder holder, final int position) {
        ReportResponse.Data.ReportActivity listActivitiesResponse = activitiesResponseList.get(position);
        holder.txtItemReport.setText(listActivitiesResponse.getProject_activity().getName());
        holder.txtNumberReport.setText("0");
        holder.clListReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callBack.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return activitiesResponseList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtItemReport, txtNumberReport;
        ConstraintLayout clListReport;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtItemReport = itemView.findViewById(R.id.txtItemReport);
            txtNumberReport = itemView.findViewById(R.id.txtNumberReport);
            clListReport = itemView.findViewById(R.id.clListReport);

        }
    }
}
