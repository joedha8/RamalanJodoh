package com.kudkud32.ramalanjodoh.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kudkud32.ramalanjodoh.R;

import java.util.zip.Inflater;

/**
 * Created by WIN 10 on 28/12/2016.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private String[] namaZodiak = {"Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagitarius", "Capricorn", "Aquarius", "Pisces"};
    private String[] rangeZodiak = {"21 Maret - 19 April", "20 April - Mei", "21 Mei - 20 Juni", "21 Juni - 22 Juli", "23 Juli - 22 Agustus", "23 Agustus - 22 September", "23 September - 22 Oktober", "23 Oktober - 21 November", "22 November - 21 Desember", "22 Desember - 19 Januari", "20 Januari - 18 Februari", "19 Februari - 20 Maret"};
    private int[] imgZodiak = {R.drawable.ic_aries,R.drawable.ic_taurus,R.drawable.ic_gemini,R.drawable.ic_cancer,R.drawable.ic_leo,R.drawable.ic_virgo,R.drawable.ic_libra,R.drawable.ic_scorpio,R.drawable.ic_sagitarius,R.drawable.ic_capricorn,R.drawable.ic_aquarius,R.drawable.ic_pisces};
    private Context context;
    LayoutInflater inflater;

    public RecyclerViewAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_view,parent,false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.nama_zodiak.setText(namaZodiak[position]);
        holder.tgl_zodiak.setText(rangeZodiak[position]);
        holder.zodiak_icon.setImageResource(imgZodiak[position]);
    }

    @Override
    public int getItemCount() {

        return namaZodiak.length;
    }
}
