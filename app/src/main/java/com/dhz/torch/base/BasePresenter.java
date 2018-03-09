package com.dhz.torch.base;

import java.lang.ref.WeakReference;

/**
 * Created by cn on 2018/3/6.
 */

public abstract class BasePresenter<T> {


    /**
     * 持有的UI接口的弱引用
     */
    protected WeakReference<T> mViewRef;


    /**
     * 获取数据方法
     */
    public abstract void fetch();

    /**
     * 绑定的方法
     * 在onCreate()中调用
     *
     * @param view
     */
    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }


    /**
     * 解绑
     * 在onDestroy方法中调用，防止内存泄漏
     */
    public void detach() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }

        onDestroy();
    }

    //释放资源处理
    public abstract void onDestroy();
}
