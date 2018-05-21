package com.kudkud32.ramalanjodoh.view.fragment;


import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toolbar;

import com.kudkud32.ramalanjodoh.R;
import com.kudkud32.ramalanjodoh.model.Ramalan;
import com.kudkud32.ramalanjodoh.view.adapter.RecyclerViewZodiak;
import com.kudkud32.ramalanjodoh.view.adapter.RecyclerviewRamalan;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class RamalanFragment extends Fragment {
    List<Ramalan> ramalan = new ArrayList<>();
    RecyclerView recyclerView;
    Context context;
    Toolbar toolbarTop;
    TextView mTitle;

    public RamalanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_ramalan, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_zodiak);


//        ButterKnife.bind(context, view);
        ramalan = new ArrayList<>();
        ramalan.add(new Ramalan(R.drawable.ic_capricorn_bg,R.drawable.capricorn_icon,"Capricorn", "21 Des - 20 Jan"));
        ramalan.add(new Ramalan(R.drawable.ic_aquarius_bg,R.drawable.aquarius_icon,"Aquarius", "21 Jan - 18 Feb"));
        ramalan.add(new Ramalan(R.drawable.ic_pisces_bg,R.drawable.pisces_icon,"Pisces", "19 Feb - 20 Maret"));
        ramalan.add(new Ramalan(R.drawable.ic_aries_bg,R.drawable.aries_icon,"Aries", "21 Maret - 20 April"));
        ramalan.add(new Ramalan(R.drawable.ic_taurus_bg,R.drawable.taurus_icon,"Taurus", "21 April - 20 Mei"));
        ramalan.add(new Ramalan(R.drawable.ic_gemini_bg,R.drawable.gemini_icon,"Gemini", "21 Mei - 20 Juni"));
        ramalan.add(new Ramalan(R.drawable.ic_cencer_bg,R.drawable.cencer_icon,"Cencer", "21 Juni- 20 Juli"));
        ramalan.add(new Ramalan(R.drawable.ic_leo_bg,R.drawable.leo_icon,"Leo", "21 Juli - 21 Agustus"));
        ramalan.add(new Ramalan(R.drawable.ic_virgo_bg,R.drawable.virgo_icon,"Virgo", "22 Agustus - 22 Sep"));
        ramalan.add(new Ramalan(R.drawable.ic_libra_bg,R.drawable.libra_icon,"Libra", "23 Sep - 22 Oktober"));
        ramalan.add(new Ramalan(R.drawable.ic_scorpio_bg,R.drawable.scorpio_icon,"Scorpio", "23 Oktober - 22 Nov"));
        ramalan.add(new Ramalan(R.drawable.ic_sagitarius_bg,R.drawable.sagitarius_icon,"Sagitarius", "23 Nov -20 Des"));
        RecyclerviewRamalan Myrecyclear = new RecyclerviewRamalan(getContext(),ramalan);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setLayoutManager(new GridLayoutManager(context,3));
        recyclerView.setAdapter(Myrecyclear);
        Myrecyclear.notifyDataSetChanged();

        return view;
    }
}
