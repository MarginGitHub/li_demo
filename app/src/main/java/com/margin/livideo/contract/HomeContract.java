package com.margin.livideo.contract;

import com.margin.livideo.model.BaseModel;
import com.margin.livideo.ui.adapter.HomeAdapter;
import com.margin.model.bean.Categorys;

/**
 * Created by margin on 17-9-23.
 */

public interface HomeContract {
    interface Model {
        void getCategoryItems(BaseModel.Next<Categorys> next, BaseModel.Error error);
        void cancelRequest();
    }

    interface View {
        HomeAdapter getAdapter();
        void bindTableLayout();
        void showError(Throwable e);
        void showFailedInfo(int code, String msg);
    }

    interface Presenter {
        void getCategorys();
        void onDestroyView();
    }
}
