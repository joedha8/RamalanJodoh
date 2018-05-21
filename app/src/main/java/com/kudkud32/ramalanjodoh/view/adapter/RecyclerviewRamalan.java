package com.kudkud32.ramalanjodoh.view.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.kudkud32.ramalanjodoh.R;
import com.kudkud32.ramalanjodoh.model.Ramalan;

/**
 * Created by TRW on 3/10/2018.
 */

public class RecyclerviewRamalan extends RecyclerView.Adapter<RecyclerviewRamalan.ContactViewHolder> {
    private Context context;
    private List<Ramalan> ramalan;


    public RecyclerviewRamalan(Context context, List<Ramalan> ramalan) {
        this.context = context;
        this.ramalan = ramalan;
    }


    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(context);
        view = mInflater.inflate(R.layout.list_ramalan,parent,false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {

       holder.iv_logo_zodiak.setImageResource(ramalan.get(position).getImg_zodiak_bg());
        holder.iv_logo2_zodiak.setImageResource(ramalan.get(position).getImg_zodiak());
       holder.tv_nama_zodiak.setText(ramalan.get(position).getNama_zodiak());
       holder.tv_range_zodiak.setText(ramalan.get(position).getTanggal());
    }

    @Override
    public int getItemCount() {
        return ramalan.size();
    }

    public static class  ContactViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_logo2_zodiak,iv_logo_zodiak;
        TextView tv_nama_zodiak, tv_range_zodiak;
        CardView cardViewRamalan;

        public ContactViewHolder(View itemView) {
            super(itemView);
            iv_logo2_zodiak = (ImageView) itemView.findViewById(R.id.iv_logo2_zodiak);
            iv_logo_zodiak = (ImageView) itemView.findViewById(R.id.iv_logo_zodiak);
            tv_nama_zodiak = (TextView) itemView.findViewById(R.id.tv_nama_zodiak);
            tv_range_zodiak = (TextView) itemView.findViewById(R.id.tv_range_zodiak);
            cardViewRamalan = (CardView) itemView.findViewById(R.id.cardViewRamalan);
        }
    }

}
