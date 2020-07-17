package com.tracking.tas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ViewMap extends AppCompatActivity {

    FragmentMap fragmentMap = new FragmentMap();
    FragmentData fragmentData = new FragmentData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_map);

        getSupportFragmentManager().beginTransaction().replace(R.id.viewFragmentMap, fragmentMap).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.viewFragmentData, fragmentData).commit();
    }
}
