package com.dhz.torch.base;

/**
 * Created by cn on 2018/3/6.
 * View层基类
 */

public interface BaseView<T> {
    //显示toast
    void showToast();

    //显示进度框
    void showDialog();

    //隐藏进度框
    void dismissDialog();
}
