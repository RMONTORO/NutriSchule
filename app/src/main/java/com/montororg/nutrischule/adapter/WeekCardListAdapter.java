package com.montororg.nutrischule.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.montororg.nutrischule.R;

import java.util.List;

public class WeekCardListAdapter extends RecyclerView.Adapter<WeekCardListAdapter.ViewHolder> {

    private List<WeekCard> mData;
    private LayoutInflater mInflater;
    private Context mContext;
    private View mView;

    //Constructor
    public WeekCardListAdapter(List<WeekCard> data, Context context){
        this.mData = data;
        this.mContext = context;
    }

    @NonNull
    @Override
    public WeekCardListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mView = mInflater.inflate(R.layout.week_card, parent, false);
        return new WeekCardListAdapter.ViewHolder(mView);
    }


    @Override
    public void onBindViewHolder(@NonNull WeekCardListAdapter.ViewHolder holder, int position) {
        holder.bindData(mData.get(position));
    }

    public void setItems(List<WeekCard> items) { mData = items; }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CardView weekCard;
        TextView weekCardTextView;

        ViewHolder(View itemView){
            super(itemView);
            weekCard = itemView.findViewById(R.id.week_card);
            weekCardTextView = itemView.findViewById(R.id.week_card_TextView);
        }

        void bindData (final WeekCard item){
            weekCard.setCardBackgroundColor(item.bgColor);
            weekCardTextView.setTextColor(item.getTxtColor());
            weekCardTextView.setText(item.getTxt());
        }

    }



    @Override
    public int getItemCount() {
        return mData.size();
    }

}
