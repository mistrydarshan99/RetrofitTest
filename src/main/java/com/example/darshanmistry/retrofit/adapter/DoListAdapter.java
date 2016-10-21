package com.example.darshanmistry.retrofit.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.darshanmistry.retrofit.R;
import com.example.darshanmistry.retrofit.model.HH_Dealer;

import java.util.ArrayList;


public class DoListAdapter extends RecyclerView.Adapter<DoListAdapter.ViewHolder> {

    private Activity activity;

    private LayoutInflater layoutInflater;

    private ArrayList<HH_Dealer> routeMasterRecords = new ArrayList<>();

    private DoListAdapter.OnItemClickListener onItemClickListener;

    private int currentSelected = -1;

    public DoListAdapter(Activity activity) {

        this.activity = activity;

        layoutInflater = LayoutInflater.from(activity);
    }

    @Override
    public DoListAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {

        View view = layoutInflater.inflate(R.layout.row_route_record, viewGroup, false);

        DoListAdapter.ViewHolder viewHolder = new DoListAdapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final DoListAdapter.ViewHolder viewHolder, final int position) {

        final HH_Dealer routeMaster = routeMasterRecords.get(position);

        viewHolder.tvRouteDate.setTag(position);
        viewHolder.tvRouteDate.setText(routeMaster.getDMSID());

        View.OnClickListener clickListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (onItemClickListener != null) {

                    onItemClickListener.onItemClick(position, viewHolder.itemView);
                }

                currentSelected = position;

                notifyDataSetChanged();
            }
        };

        viewHolder.itemView.setOnClickListener(clickListener);


    }

    @Override
    public int getItemCount() {

        return routeMasterRecords.size();
    }


    public void setData(ArrayList<HH_Dealer> doLines) {

        if (doLines == null) {

            return;
        }

        this.routeMasterRecords = doLines;

        notifyDataSetChanged();

        if (onItemClickListener != null) {

            onItemClickListener.onItemCountChange();
        }
    }

    public ArrayList<HH_Dealer> getRouteMasterRecords() {
        return routeMasterRecords;
    }

    public int getCurrentSelected() {
        return currentSelected;
    }

    public void setCurrentSelected(int currentSelected) {
        this.currentSelected = currentSelected;
    }

    public static interface OnItemClickListener {

        void onItemClick(int position, View view);

        void onItemCountChange();

    }

    public OnItemClickListener getOnItemClickListener() {

        return onItemClickListener;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {

        this.onItemClickListener = onItemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public View itemView;

        //public CheckBox cbRoute;

        public TextView tvRouteDate;

        public TextView tvRouteNo;

        public TextView tvDriverId;

        public ViewHolder(View itemView) {

            super(itemView);

            this.itemView = itemView;

            tvRouteDate = (TextView) itemView.findViewById(R.id.tvRouteDate);


        }
    }
}
