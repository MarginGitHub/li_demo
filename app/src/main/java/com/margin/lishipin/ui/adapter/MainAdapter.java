package com.margin.lishipin.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.margin.lishipin.ui.fragment.HomeFragment;
import com.margin.lishipin.ui.fragment.LiveVideoFragment;
import com.margin.lishipin.ui.fragment.MyFragment;
import com.margin.lishipin.ui.fragment.PaikeFragment;
import com.margin.lishipin.ui.fragment.SubscribeFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by margin on 17-9-23.
 */

public class MainAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;
    public MainAdapter(FragmentManager fm) {
        super(fm);
        fragments = new ArrayList<>(5);
        fragments.add(new HomeFragment());
        fragments.add(new LiveVideoFragment());
        fragments.add(new SubscribeFragment());
        fragments.add(new PaikeFragment());
        fragments.add(new MyFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return 5;
    }
}
