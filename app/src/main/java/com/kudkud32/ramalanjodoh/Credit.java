package com.kudkud32.ramalanjodoh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Credit extends AppCompatActivity {
    private TextView credit;
    static String cdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_credit);
        credit=(TextView)findViewById(R.id.tentang);
        credit(cdt);
        credit.setText(cdt+"");
    }
    private static void credit(String kata){
        kata="Aplikasi ini berisi ramalan kecocokan dan tentang pasangan anda. Apapun hasil yang keluar dari aplikasi ini jangan terlalu dibawa serius, karena pada dasarnya aplikasi ini hanya untuk bersenang-senang." +
                "\n" +
                "\nDikembangkan Oleh :" +
                "\nYudha Pratama Putra" +
                "\nYudistiro Septian Dwi Saputro" +
                "\n" +
                "\nTerima Kasih kepada :" +
                "\nAllah SWT" +
                "\nKristiawan Adi" +
                "\ndan seluruh pihak yang terlibat" +
                "\n" +
                "\nRack Edan, RackSpira" +
                "\nRackSpira Team";
    cdt=kata;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu3, menu);
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
            Intent intent=new Intent(Credit.this, MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
