package com.kudkud32.ramalanjodoh.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kudkud32.ramalanjodoh.R;
import com.kudkud32.ramalanjodoh.adapter.RecyclerViewZodiak;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class RamalanFragment extends Fragment {
    @BindView(R.id.rv_zodiak)
    RecyclerView recyclerView;

    public RamalanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ramalan, container, false);

        ButterKnife.bind(this, view);

        loadZodiak();

        return view;
    }

    public void loadZodiak(){
        RecyclerViewZodiak adapter = new RecyclerViewZodiak(getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

}
