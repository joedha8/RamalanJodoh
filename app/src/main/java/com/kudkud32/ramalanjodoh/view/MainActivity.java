package com.kudkud32.ramalanjodoh.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.kudkud32.ramalanjodoh.R;
import com.kudkud32.ramalanjodoh.view.fragment.CreditFragment;
import com.kudkud32.ramalanjodoh.view.fragment.JodohFragment;
import com.kudkud32.ramalanjodoh.view.fragment.RamalanFragment;

public class MainActivity extends AppCompatActivity {
    private FragmentManager manager;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    manager.beginTransaction().replace(R.id.content_frame, new RamalanFragment()).commit();
                    return true;
                case R.id.navigation_dashboard:
                    manager = getSupportFragmentManager();
                    manager.beginTransaction().replace(R.id.content_frame, new JodohFragment()).commit();
                    return true;
                case R.id.navigation_notifications:
                    manager = getSupportFragmentManager();
                    manager.beginTransaction().replace(R.id.content_frame, new CreditFragment()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_dashboard);

        manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.content_frame, new JodohFragment()).commit();
    }

}
