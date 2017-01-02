package com.kudkud32.ramalanjodoh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.kudkud32.ramalanjodoh.model.GlobalMasuk;
import com.kudkud32.ramalanjodoh.model.Masuk;
import com.kudkud32.ramalanjodoh.model.Zodiak;


public class RamalanZodiak extends AppCompatActivity {
    private EditText nama,tglLahir;
    private Button ok;
    private TextView coba1,coba2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiak);

        nama =(EditText)findViewById(R.id.nama_zod);
        tglLahir=(EditText)findViewById(R.id.tgl_zod);
        ok =(Button)findViewById(R.id.ramal_zod);
        coba1 =(TextView)findViewById(R.id.coba1);
        coba2 =(TextView)findViewById(R.id.coba2);

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
}
