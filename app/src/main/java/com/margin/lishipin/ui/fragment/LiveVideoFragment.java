package com.margin.lishipin.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.margin.lishipin.R;
import com.margin.lishipin.ui.adapter.HomeAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by margin on 17-9-23.
 */

public class LiveVideoFragment extends Fragment {
    @BindView(R.id.home_table_layout)
    TabLayout homeTableLayout;
    @BindView(R.id.home_container)
    ViewPager homeContainer;
    Unbinder unbinder;
    private HomeAdapter homeAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home_pager, container, false);
        unbinder = ButterKnife.bind(this, super.onCreateView(inflater, container, savedInstanceState));
        initViews();
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    /***********************************************************************/

    private void initViews() {
        homeAdapter = new HomeAdapter(getActivity().getSupportFragmentManager());
        homeContainer.setAdapter(homeAdapter);
        homeTableLayout.setupWithViewPager(homeContainer);
        homeTableLayout.setTabMode(TabLayout.MODE_FIXED);
    }
}