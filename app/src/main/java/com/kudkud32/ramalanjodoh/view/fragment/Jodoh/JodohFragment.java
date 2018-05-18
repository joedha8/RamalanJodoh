package com.kudkud32.ramalanjodoh.view.fragment.Jodoh;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kudkud32.ramalanjodoh.R;
import com.kudkud32.ramalanjodoh.model.DataWeton;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class JodohFragment extends Fragment implements JodohMvp {
    private ArrayList<String> hariLahir = new ArrayList<>();
    private ArrayList<String> pasaranLahir = new ArrayList<>();

    Activity activity;

    JodohPresenter presenter;

    public JodohFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jodoh, container, false);
        presenter = new JodohPresenter(this);

        presenter.getDataWeton("Yudha", "07-10-1997");
        presenter.getDataWeton("Rinanda", "22-04-1998");

        return view;
    }

    void getRamalan(ArrayList<String> hariLahir, ArrayList<String> pasaranLahir){
        int pointHariSaya = getPointHari(hariLahir.get(0));
        int pointPasaranSaya = getPointPasaran(pasaranLahir.get(0));

        int pointHariPasangan = getPointHari(hariLahir.get(1));
        int pointPasaranPasangan = getPointPasaran(pasaranLahir.get(1));

        int pointSaya = pointHariSaya + pointPasaranSaya;
        int pointPasangan = pointHariPasangan + pointPasaranPasangan;

        int totalPoint = pointSaya + pointPasangan;

        String ramalan = getRamalan(totalPoint);
        String detailRamalan = activity.getString(getDeskripsi(ramalan));

        Log.d("####", ramalan);
        Log.d("####", detailRamalan);
    }

    int getPointHari(String hari){
        if (hari.equals("Senin"))
            return 4;
        else if (hari.equals("Selasa"))
            return 3;
        else if (hari.equals("Rabu"))
            return 7;
        else if (hari.equals("Kamis"))
            return 8;
        else if (hari.equals("Jumat"))
            return 6;
        else if (hari.equals("Sabtu"))
            return 9;
        else if (hari.equals("Minggu"))
            return 5;
        else
            return 0;
    }

    int getPointPasaran(String pasaran){
        if (pasaran.equals("Pahing"))
            return 9;
        else if (pasaran.equals("Pon"))
            return 7;
        else if (pasaran.equals("Wage"))
            return 4;
        else if (pasaran.equals("Kliwon"))
            return 8;
        else if (pasaran.equals("Legi"))
            return 5;
        else
            return 0;
    }

    String getRamalan(int total){
        if (total % 8 == 0)
            return "Pesthi";
        else if (total % 8 == 1)
            return "Pegat";
        else if (total % 8 == 2)
            return "Ratu";
        else if (total % 8 == 3)
            return "Jodoh";
        else if (total % 8 == 4)
            return "Topo";
        else if (total % 8 == 5)
            return "Tinari";
        else if (total % 8 == 6)
            return "Padu";
        else if (total % 8 == 7)
            return "Sujanan";
        else
            return " ";
    }

    int getDeskripsi(String hasil){
        if (hasil.equals("Pesthi"))
            return R.string.pesthi;
        else if (hasil.equals("Pegat"))
            return R.string.pegat;
        else if (hasil.equals("Ratu"))
            return R.string.ratu;
        else if (hasil.equals("Jodoh"))
            return R.string.jodoh;
        else if (hasil.equals("Topo"))
            return R.string.topo;
        else if (hasil.equals("Tinari"))
            return R.string.tinari;
        else if (hasil.equals("Padu"))
            return R.string.padu;
        else if (hasil.equals("Sujanan"))
            return R.string.sujanan;
        else
            return 0;
    }

    String[] pisahKata(String source){
        String kata[] = source.split(" ");

        return kata;
    }

    @Override
    public void showDataWeton(DataWeton dataWeton) {
        String kata[] = pisahKata(dataWeton.getLahir());
        String hari = kata[0];
        String pasaran = kata[1];

        hariLahir.add(hari);
        pasaranLahir.add(pasaran.substring(0, pasaran.length() - 1));

        try {
            getRamalan(hariLahir, pasaranLahir);
        } catch (IndexOutOfBoundsException e){
            Log.d("####", e.getMessage());
        }
    }

    @Override
    public void showError(String message) {
        Log.d("####", ""+message);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (Activity) context;
    }
}
