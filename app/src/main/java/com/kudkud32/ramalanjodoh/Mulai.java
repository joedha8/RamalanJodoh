package com.kudkud32.ramalanjodoh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import java.util.Calendar;

public class Mulai extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{
    private Button go;
    public static EditText tgl;
    public static EditText nama1;
    public static EditText nama2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_mulai);
        nama1=(EditText)findViewById(R.id.nama1);
        nama2=(EditText)findViewById(R.id.nama2);
        go=(Button)findViewById(R.id.go);
        tgl=(EditText)findViewById(R.id.tgl);

        tgl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar now = Calendar.getInstance();
                DatePickerDialog dpd = DatePickerDialog.newInstance(
                        Mulai.this,
                        now.get(Calendar.YEAR),
                        now.get(Calendar.MONTH),
                        now.get(Calendar.DAY_OF_MONTH)
                );
                dpd.show(getFragmentManager(), "Datepickerdialog");
            }
        });
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(nama1.getText()) || TextUtils.isEmpty(nama2.getText()) || TextUtils.isEmpty(tgl.getText()))
                    Toast.makeText(Mulai.this,"Pastikan semua data terisi",Toast.LENGTH_SHORT).show();
                else if(nama1.getText().toString().equals(".") || nama2.getText().toString().equals("."))
                    Toast.makeText(Mulai.this,"Pastikan semua data terisi",Toast.LENGTH_SHORT).show();
                else if(nama1.getText().toString().length()<3 || nama2.getText().toString().length()<3)
                    Toast.makeText(Mulai.this,"Pastikan Nama Anda Benar",Toast.LENGTH_SHORT).show();
                else{
                    Intent intent = new Intent(Mulai.this, Hasil.class);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        String date = dayOfMonth+"/"+(monthOfYear+1)+"/"+year;
        tgl.setText(date);
        GlobalTanggal.date=date;
        GlobalTanggal.tgl=dayOfMonth;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home){
            //finish();
            Intent intent=new Intent(Mulai.this, MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}