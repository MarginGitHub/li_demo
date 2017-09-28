package com.margin.livideo.model;

import com.margin.livideo.contract.HomeContract;
import com.margin.model.bean.Categorys;
import com.margin.model.net.NetService;
import com.margin.model.net.NetServiceProvider;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by margin on 17-9-23.
 */

public class HomeModel extends BaseModel implements HomeContract.Model {

    private final NetService mService;

    public HomeModel() {
        mService = (NetService) NetServiceProvider.getInstance().getService();
    }

    @Override
    public void getCategoryItems(final Next<Categorys> next, final Error error) {
        mService.getCategorys()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Categorys>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        addDisposable(d);
                    }

                    @Override
                    public void onNext(@NonNull Categorys categorys) {
                        next.onNext(categorys);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        error.onError(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void cancelRequest() {
        dispose();
    }

}
