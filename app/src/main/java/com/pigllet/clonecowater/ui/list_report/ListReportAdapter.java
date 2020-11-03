package com.pigllet.clonecowater.ui.list_report;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.pigllet.clonecowater.R;
import com.pigllet.clonecowater.ui.report.OnItemClickListenner;
import com.pigllet.clonecowater.ultis.report.ReportResponse;

import java.util.ArrayList;
import java.util.List;

public class ListReportAdapter extends RecyclerView.Adapter<ListReportAdapter.ViewHolder> {
    private List<ReportResponse.Data.ReportActivity.RealTime> listRealtime;
    private Context context;
    private OnItemClickListenner callBack;

    public ListReportAdapter(Context context, OnItemClickListenner callBack) {
        this.listRealtime = new ArrayList<>();
        this.context = context;
        this.callBack = callBack;
    }

    public void updateData(List<ReportResponse.Data.ReportActivity.RealTime> activityList){
        this.listRealtime.clear();
        this.listRealtime.addAll(activityList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ListReportAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_report, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListReportAdapter.ViewHolder holder, final int position) {
        ReportResponse.Data.ReportActivity.RealTime mRealtime = listRealtime.get(position);
            holder.txtAction.setText(mRealtime.getTitle());
            holder.txtDateTime.setText(mRealtime.getCreated_at());
            holder.clListDetail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callBack.onItemClick(position);
                }
            });
    }

    @Override
    public int getItemCount() {
        return listRealtime.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtAction, txtDateTime;
        private ConstraintLayout clListDetail;

        public ViewHolder(View view) {
            super(view);
            txtAction = (TextView) view.findViewById(R.id.txtAction);
            txtDateTime = view.findViewById(R.id.txtDateTime);
            clListDetail = view.findViewById(R.id.clListDetail);
        }

    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

}
