package com.example.p_motionlayout;
//用DataBind來取德裡面xml元件
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.p_motionlayout.databinding.ItemCardBinding;

import java.net.URL;
import java.util.List;

class PersonRecyclerViewAdapter  extends  RecyclerView.Adapter<PersonRecyclerViewAdapter.PersonViewHolder>{
private List<Person> mData;
private Context mContent;

    public PersonRecyclerViewAdapter(List<Person> mData, Context mContent) {
        this.mData = mData;
        this.mContent = mContent;
    }
    public class PersonViewHolder extends RecyclerView.ViewHolder{
         ItemCardBinding mItemCardBinding;

        //1.將layoutBinding初始化帶進去,super給爸爸告訴這個itemCardBinding.getRoot() 代表給他這個View
        public PersonViewHolder(ItemCardBinding itemCardBinding){
            super(itemCardBinding.getRoot());
            mItemCardBinding = itemCardBinding;
        }


    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //2.將取得的View帶進去給PersonViewHolder
        LayoutInflater li = LayoutInflater.from(parent.getContext());
        return new PersonViewHolder(ItemCardBinding.inflate(li));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.mItemCardBinding.tvName.setText(mData.get(position).getName());
        try {
            //3.用Glide方式這定圖片,有預設圖片跟錯誤圖片
            URL url = new URL( mData.get(position).getPhoto() +"");
            RequestOptions requestOptions = new RequestOptions()
                    .centerCrop()
                    .placeholder(R.drawable.person)
                    .error(R.drawable.person);
            Glide.with(mContent)
                    .load(url)
                    .apply(requestOptions)
                    .into(holder.mItemCardBinding.img);

        }catch (Exception e){
            Log.v("hank","Exception-> e =" +e.toString());
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


}
