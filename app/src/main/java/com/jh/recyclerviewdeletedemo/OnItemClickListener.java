package com.jh.recyclerviewdeletedemo;

import android.view.View;

/**
 * Created by jinhui on 2018/8/23.
 * email: 1004260403@qq.com
 */

public interface OnItemClickListener {

    /**
     * item点击回调
     *
     * @param view
     * @param position
     */
    void onItemClick(View view, int position);

    /**
     * 删除按钮回调
     *
     * @param position
     */
    void onDeleteClick(int position);


}
