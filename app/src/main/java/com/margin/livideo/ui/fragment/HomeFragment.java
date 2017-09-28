package com.margin.livideo.ui.fragment;

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
import android.widget.Toast;

import com.margin.livideo.R;
import com.margin.livideo.contract.HomeContract;
import com.margin.livideo.presenter.HomePresenter;
import com.margin.livideo.ui.adapter.HomeAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by margin on 17-9-23.
 */

public class HomeFragment extends Fragment implements HomeContract.View {

    @BindView(R.id.home_table_layout)
    TabLayout mHomeTableLayout;
    @BindView(R.id.home_container)
    ViewPager mHomeContainer;
    Unbinder unbinder;
    private HomeAdapter mHomeAdapter;
    private HomeContract.Presenter mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new HomePresenter(this);
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home_pager, container, false);
        unbinder = ButterKnife.bind(this, rootView);
        initViews();
        mPresenter.getCategorys();
        return rootView;
    }

    @Override
    public void onDestroyView() {
        mPresenter.onDestroyView();
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
        if (mHomeAdapter == null) {
            mHomeAdapter = new HomeAdapter(getActivity().getSupportFragmentManager());
        }
        mHomeContainer.setAdapter(mHomeAdapter);
    }

    @Override
    public HomeAdapter getAdapter() {
        return mHomeAdapter;
    }

    @Override
    public void bindTableLayout() {
        mHomeTableLayout.setupWithViewPager(mHomeContainer);
        mHomeTableLayout.setTabMode(TabLayout.MODE_FIXED);
    }

    @Override
    public void showError(Throwable e) {
        Toast.makeText(getContext(), e.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailedInfo(int code, String msg) {
        Toast.makeText(getContext(), String.format("code: %d, msg: %s\n", code, msg), Toast.LENGTH_SHORT).show();
    }

}
