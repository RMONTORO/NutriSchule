package com.montororg.nutrischule.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.montororg.nutrischule.R;

import java.util.List;
import java.util.zip.Inflater;

public class WeekCardListAdapter extends RecyclerView.Adapter<WeekCardListAdapter.ViewHolder> {

    private List<WeekCard> mData;
    private LayoutInflater mInflater;
    private Context mContext;
    private View mView;

    //Constructor
    public WeekCardListAdapter(List<WeekCard> data, Context context){
        this.mInflater = LayoutInflater.from(context);
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
            weekCardTextView.setText(item.getTxt());

            if(item.getColor() == WeekCard.COLOR_1){
                weekCard.setCardBackgroundColor(ContextCompat.getColor(mContext, R.color.primaryColor));
                weekCardTextView.setTextColor(ContextCompat.getColor(mContext, R.color.primaryTextColor));
            }else if (item.getColor() == WeekCard.COLOR_2){
                weekCard.setCardBackgroundColor(ContextCompat.getColor(mContext, R.color.primaryLightColor));
                weekCardTextView.setTextColor(ContextCompat.getColor(mContext, R.color.primaryTextColor));
            } else {
                weekCard.setCardBackgroundColor(ContextCompat.getColor(mContext, R.color.secondaryColor));
                weekCardTextView.setTextColor(ContextCompat.getColor(mContext, R.color.secondaryTextColor));
            }

        }

    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

}
