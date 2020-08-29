package com.example.p_motionlayout;
//ImageFilterView搭配RecyclerView 當滑動到圖片訂位時，切換顏色出現toast
//1.databinding
//2.打開明碼權限
//3.加入api  implementation 'com.github.bumptech.glide:glide:4.11.0'
//           implementation 'com.android.support:recyclerview-v7:29.0.1'
//4.準備RecyclerView
//5.item 加入imageViewFilter
//6.準備好bean
//7.重點寫一個RecyclerViewAdapter 用DataBinding傳進去
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.p_motionlayout.databinding.ActivityImageFilterViewRecyclerBinding;
import com.example.p_motionlayout.databinding.ItemCardBinding;

import java.util.ArrayList;
import java.util.List;

public class ImageFilterViewRecyclerActivity extends AppCompatActivity {
    private ActivityImageFilterViewRecyclerBinding activityImageFilterViewRecyclerBinding;
    private List<Person> personList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityImageFilterViewRecyclerBinding = ActivityImageFilterViewRecyclerBinding.inflate(getLayoutInflater());
        setContentView(activityImageFilterViewRecyclerBinding.getRoot());


        initData();


    }

    private void initData() {
        personList = new ArrayList<>();

        personList.add(new Person("hank","https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?cs=srgb&dl=pexels-pixabay-220453.jpg&fm=jpg"));
        personList.add(new Person("jason","https://images.pexels.com/photos/1681010/pexels-photo-1681010.jpeg?cs=srgb&dl=pexels-creation-hill-1681010.jpg&fm=jpg"));
        personList.add(new Person("carter","https://images.pexels.com/photos/936229/pexels-photo-936229.jpeg?cs=srgb&dl=pexels-mentatdgt-936229.jpg&fm=jpg"));
        personList.add(new Person("jenfier","https://images.pexels.com/photos/1587009/pexels-photo-1587009.jpeg?cs=srgb&dl=pexels-moose-photos-1587009.jpg&fm=jpg"));
        personList.add(new Person("amy","https://images.pexels.com/photos/774909/pexels-photo-774909.jpeg?cs=srgb&dl=pexels-andrea-piacquadio-774909.jpg&fm=jpg"));

        PersonRecyclerViewAdapter personRecyclerViewAdapter = new PersonRecyclerViewAdapter(personList,this);

        activityImageFilterViewRecyclerBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        activityImageFilterViewRecyclerBinding.recyclerView.setAdapter(personRecyclerViewAdapter);
    }
}