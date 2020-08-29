package com.example.p_motionlayout;
//升級4.0後再舊的xml改成這個則可支援xmlns:android="http://schemas.android.com/apk/res/android"
//A.Basic touch-controlled motion ->觸碰特效
//1.加入api  implementation 'androidx.constraintlayout:constraintlayout:2.0.0-beta1'
//2.MotionLayout是ConstraintLayout的子類別，所以在xml中ConstraintLayout裡面可以放MotionLayout
//3.在activity_main.xml加上MotionLayout，加上屬性app:layoutDescription=”@xml/scene”。
// 這個MotionLayout裡的子View就可以透過scene.xml的設定當使用者與UI互動時產生動畫
//4.MotionScene在這裡設定當使用者與UI做什麼樣的互動(例：OnSwipe)時，要使用什麼動畫。xml/scene.xml
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toPageImagViewMotion(View view) {
        startActivity(new Intent(MainActivity.this,ImagViewMontion.class));
    }

    public void toPageIcons(View view) {
        startActivity(new Intent(MainActivity.this,PositioningIconsActivity.class));
    }

    public void toKeyFrameSet(View view) {
        startActivity(new Intent(MainActivity.this,KeyframeSetActivity.class));
    }

    public void toPageImagViewFilter(View view) {
        startActivity(new Intent(MainActivity.this, ImageFilterViewRecyclerActivity.class));
    }
}