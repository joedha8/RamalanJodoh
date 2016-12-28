package com.kudkud32.ramalanjodoh.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kudkud32.ramalanjodoh.R;

/**
 * Created by WIN 10 on 28/12/2016.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    ImageView zodiak_icon;
    TextView nama_zodiak,tgl_zodiak;


    public RecyclerViewHolder(View itemView) {
        super(itemView);
        zodiak_icon = (ImageView)itemView.findViewById(R.id.zodiak_icon);
        nama_zodiak = (TextView)itemView.findViewById(R.id.nama_zodiak);
        tgl_zodiak = (TextView)itemView.findViewById(R.id.tgl_zodiak);
    }
}
