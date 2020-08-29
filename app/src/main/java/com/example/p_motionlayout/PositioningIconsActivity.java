package com.example.p_motionlayout;
//一群icons效果,準備九個icons
//上面9個icon下面一個愛心,點下愛心後7,8,9icon隱藏 1~6icon縮成第一排
//佈局利用xml來處理,Transition設定秒數
//<OnClick /> ->按下layout觸發效果

/* 2.移動icon製造效果,用拖動的方式
A.  app:motionDebug="SHOW_PATH" -> DeBug效果可以讓你看到移動的軌跡在主要xml設定
  OnSwipe motion:touchAnchorId="@+id/view" //要拖動的元件id
            motion:dragDirection="dragUp"  //要拖動的方向
            motion:touchAnchorSide="top"

            />
* */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PositioningIconsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positioning_icons);
    }
}