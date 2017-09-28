package com.margin.livideo.model;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * Created by dongjijin on 2017/9/28 0028.
 */

public class BaseModel {
    protected List<Disposable> mDisposableList;
    protected void addDisposable(Disposable disposable) {
        if (mDisposableList == null) {
            mDisposableList = new ArrayList<>();
        }
        mDisposableList.add(disposable);
    }

    public void dispose() {
        if (mDisposableList != null) {
            for (Disposable d : mDisposableList) {
                if (!d.isDisposed()) {
                    d.dispose();
                }
            }
        }
        mDisposableList.clear();
    }

    public static interface Next<T> {
        void onNext(@NonNull T t);
    }
    public static interface Error {
        void onError(@NonNull Throwable e);
    }

}
