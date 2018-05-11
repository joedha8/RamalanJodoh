package com.kudkud32.ramalanjodoh.basemvp;

/**
 * Created by Kristiawan on 07/04/18.
 * using this class for creating mvp pattern
 */

public interface BasePresenter<T> {

    void save(T model);

    void find(T param);

    void findById(T param);

    void delete(int id);
}
