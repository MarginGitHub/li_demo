package com.margin.livideo.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.margin.livideo.ui.fragment.home.HotFragment;
import com.margin.livideo.ui.fragment.home.OtherFragment;
import com.margin.model.bean.Categorys;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by margin on 17-9-23.
 */

public class HomeAdapter extends FragmentPagerAdapter {
    private List<Categorys.CategoryItem> mCategoryItems;
    private List<Fragment> mFragments;

    public HomeAdapter(FragmentManager fm) {
        super(fm);
        mFragments = new ArrayList<>();
        mFragments.add(new HotFragment());
    }

    public void initWithCategorys(List<Categorys.CategoryItem> categoryItems) {
        if (categoryItems == null) {
            return;
        }
        mCategoryItems = categoryItems;
        for (Categorys.CategoryItem item : categoryItems) {
            OtherFragment fragment = new OtherFragment();
            fragment.setCategoryItem(item);
            mFragments.add(fragment);
        }
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        if (mFragments != null) {
            return mFragments.size();
        }
        return 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mCategoryItems.get(position).getName();
    }
}
