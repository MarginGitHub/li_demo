package com.margin.lishipin.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by margin on 17-9-23.
 */

public class HomeAdapter extends FragmentPagerAdapter {
    private List<String> mTitles;
    private List<Fragment> fragments;

    public HomeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        if (fragments != null) {
            return fragments.size();
        }
        return 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
