package com.everestit.imagesliderpagerview;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.everestit.indicatorlibrary.CirclePageIndicator;
import com.everestit.indicatorlibrary.PageIndicator;

public class MainActivity extends AppCompatActivity
{
    ViewPager viewPager;
    CustomAdapter adapter;
    PageIndicator mIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.view_pager);
        adapter = new CustomAdapter(this);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);

      //  TitlePageIndicator indicator = (TitlePageIndicator)findViewById(R.id.custom_indicator);
     //   indicator.setViewPager( viewPager );

        CirclePageIndicator indicator = (CirclePageIndicator)findViewById(R.id.indicator);
        mIndicator = indicator;
        indicator.setViewPager(viewPager);

        final float density = getResources().getDisplayMetrics().density;
        indicator.setBackgroundColor(0xFFFFFF); //backgorund color
        indicator.setRadius(10 * density); //circle size
        indicator.setPageColor(0xFFFFFFFF);
        indicator.setFillColor(0xFFFF0000);
        indicator.setStrokeColor(0xFF000000); //circle in side color
        indicator.setStrokeWidth(2 * density);
    }
}