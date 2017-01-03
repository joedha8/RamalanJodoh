package com.kudkud32.ramalanjodoh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.kudkud32.ramalanjodoh.model.GlobalMasuk;
import com.kudkud32.ramalanjodoh.model.Masuk;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.util.Calendar;


public class RamalanZodiak extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    private EditText nama,tglLahir;
    private Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiak);

        nama =(EditText)findViewById(R.id.nama_zod);
        tglLahir=(EditText)findViewById(R.id.tgl_zod);
        ok =(Button)findViewById(R.id.ramal_zod);

        tglLahir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar=Calendar.getInstance();
                DatePickerDialog datePickerDialog=DatePickerDialog.newInstance(
                        RamalanZodiak.this,
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH)
                );
                datePickerDialog.show(getFragmentManager(), "DatePicker Dialog");
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Masuk masuk1 = new Masuk();
                masuk1.setNama(nama.getText().toString());
                masuk1.setTanggal(tglLahir.getText().toString());
                GlobalMasuk.setMasuk(masuk1);
                Intent intent = new Intent(RamalanZodiak.this,Detail.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        String tanggal=dayOfMonth+"-"+(monthOfYear+1)+"-"+year;
        tglLahir.setText(tanggal);
    }
}
