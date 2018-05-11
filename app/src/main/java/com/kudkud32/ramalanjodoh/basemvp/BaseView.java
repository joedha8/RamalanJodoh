package com.kudkud32.ramalanjodoh.basemvp;

/**
 * Created by Kristiawan on 07/04/18.
 * using this class for creating mvp pattern
 */

public interface BaseView<T> {

    void showProgress();

    void removeProgress();

    void onSaveResult(T model);

    void onSaveError(T model);

    void onLoadError(String error);

    void onLoadSuccess(T result);
}

