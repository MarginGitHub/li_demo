package com.margin.livideo.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;

import com.margin.model.bean.Home;

import java.util.List;

/**
 * Created by margin on 17-9-23.
 */

public class HotAdapter extends RecyclerView.Adapter<HotAdapter.HotViewHolder> {
    private List<Home.DataListBean> dataList;

    @Override
    public HotViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(HotViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if (dataList != null) {
            return dataList.size();
        }
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        String nodeType = dataList.get(position).getNodeType();
        if (!TextUtils.isEmpty(nodeType) && TextUtils.isDigitsOnly(nodeType)) {
            return Integer.valueOf(nodeType);
        }
        return -1;
    }

    public static class HotViewHolder extends RecyclerView.ViewHolder {

        public HotViewHolder(View itemView, int viewType) {
            super(itemView);
        }
    }

}
