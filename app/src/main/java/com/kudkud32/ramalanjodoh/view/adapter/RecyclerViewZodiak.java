package com.kudkud32.ramalanjodoh.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kudkud32.ramalanjodoh.R;

/**
 * Created by joedhaalzelvin on 12/05/18.
 */

public class RecyclerViewZodiak extends RecyclerView.Adapter<RecyclerViewZodiak.ViewHolder>{
    private Context context;

    public RecyclerViewZodiak(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerViewZodiak.ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_zodiak, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
