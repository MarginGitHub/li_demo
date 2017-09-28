package com.margin.livideo.presenter;

import com.margin.livideo.contract.HomeContract;
import com.margin.livideo.model.BaseModel;
import com.margin.livideo.model.HomeModel;
import com.margin.model.bean.Categorys;

import io.reactivex.annotations.NonNull;

/**
 * Created by margin on 17-9-23.
 */

public class HomePresenter implements HomeContract.Presenter {
    private HomeContract.View mView;
    private HomeContract.Model mModel;

    public HomePresenter(HomeContract.View view) {
        mView = view;
        mModel = new HomeModel();
    }

    @Override
    public void getCategorys() {
        mModel.getCategoryItems(new BaseModel.Next<Categorys>() {
            @Override
            public void onNext(@NonNull Categorys categorys) {
                int code = categorys.getResultCode();
                if (code == 1) {
                    mView.getAdapter().initWithCategorys(categorys.getCategoryList());
                    mView.bindTableLayout();
                } else {
                    mView.showFailedInfo(code, categorys.getResultMsg());
                }
            }
        }, new BaseModel.Error() {
            @Override
            public void onError(@NonNull Throwable e) {
                mView.showError(e);
            }
        });
    }

    @Override
    public void onDestroyView() {
        mModel.cancelRequest();
    }
}
