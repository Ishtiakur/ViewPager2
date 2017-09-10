package com.example.ishtiak.viewpager2;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.ViewPager);

        CustomPagerAdapter adapter = new CustomPagerAdapter(this);
        viewPager.setAdapter(adapter);



    }
}
