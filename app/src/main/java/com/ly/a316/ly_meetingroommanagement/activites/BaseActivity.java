package com.ly.a316.ly_meetingroommanagement.activites;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.gyf.barlibrary.ImmersionBar;
import com.ly.a316.ly_meetingroommanagement.R;

/**
 *  描述：基本类 实现沉浸式效果
 *  作者： 余智强
 *  创建时间：12/3 14:13
*/
public class BaseActivity  extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化沉浸式
        if (isImmersionBarEnabled()) {
            initImmersionBar();
        }
       // ImmersionBar.with(this).init();
    }
    protected void initImmersionBar() {
        //在BaseActivity里初始化
        ImmersionBar.with(this).init();
    }
    protected boolean isImmersionBarEnabled() {
        return true;
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ImmersionBar.with(this).destroy();
    }
}
