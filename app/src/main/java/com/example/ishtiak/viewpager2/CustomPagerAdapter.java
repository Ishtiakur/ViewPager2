package com.example.ishtiak.viewpager2;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Ishtiak on 9/9/2017.
 */

public class CustomPagerAdapter extends PagerAdapter {
    private int[] image_resources = {R.drawable.accept2, R.drawable.background, R.drawable.backward_icon,
                                    R.drawable.game_icon, R.drawable.quit, R.drawable.refresh_1, R.drawable.robot,
                                    R.drawable.robot2, R.drawable.robot3,R.drawable.robot4, R.drawable.robot5,
            R.drawable.robot6, R.drawable.robot7};

    Context con;
    LayoutInflater layoutInflater;

    CustomPagerAdapter(Context context){
            this.con = context;
    }

    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.img_view);
        imageView.setImageResource(image_resources[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
