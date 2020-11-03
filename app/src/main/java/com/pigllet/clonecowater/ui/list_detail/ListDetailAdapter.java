package com.pigllet.clonecowater.ui.list_detail;

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
import com.pigllet.clonecowater.ultis.report.ReportResponse;

import java.util.List;

public class ListDetailAdapter extends RecyclerView.Adapter<ListDetailAdapter.ViewHolder> {
    private List<ReportResponse.Data.ReportActivity> listRealtime;
    private Context context;
    private OnItemClickListenner callBack;

    public ListDetailAdapter(Context context, OnItemClickListenner callBack) {
        this.listRealtime = listRealtime;
        this.context = context;
        this.callBack = callBack;
    }



    @NonNull
    @Override
    public ListDetailAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_detail, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListDetailAdapter.ViewHolder holder, final int position) {
        ReportResponse.Data.ReportActivity mRealtime = listRealtime.get(position);
        holder.txtAction.setText(mRealtime.getReal_time().get(position).getTitle());
        holder.txtDateTime.setText(mRealtime.getReal_time().get(position).getCreated_at());
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
}
