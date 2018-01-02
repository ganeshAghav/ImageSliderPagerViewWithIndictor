package com.everestit.imagesliderpagerview;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 05-Apr-17.
 */

public class CustomAdapter extends PagerAdapter {
    private int[] images = {R.drawable.four,R.drawable.one,R.drawable.two,R.drawable.four,R.drawable.four,R.drawable.one,R.drawable.two,R.drawable.four,R.drawable.four,R.drawable.one,R.drawable.two,R.drawable.four};
    private Context ctx;
    private LayoutInflater inflater;

    public CustomAdapter(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view ==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.swipe,container,false);
        ImageView img =(ImageView)v.findViewById(R.id.imageView);
        img.setImageResource(images[position]);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(View container, int position, Object object) {
        container.refreshDrawableState();
    }
}