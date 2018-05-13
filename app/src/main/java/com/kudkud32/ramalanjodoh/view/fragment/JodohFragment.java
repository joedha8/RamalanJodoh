package com.kudkud32.ramalanjodoh.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kudkud32.ramalanjodoh.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class JodohFragment extends Fragment {


    public JodohFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jodoh, container, false);
    }

}
