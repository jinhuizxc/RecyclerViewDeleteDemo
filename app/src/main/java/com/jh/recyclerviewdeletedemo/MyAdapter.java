package com.jh.recyclerviewdeletedemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jinhui on 2018/8/23.
 * email: 1004260403@qq.com
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    private Context context;
    private List<String> mList;
    private LayoutInflater inflater;

    public MyAdapter(Context context, List<String> mList) {
        this.mList = mList;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(inflater.inflate(R.layout.item_delete, parent, false));
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {

        holder.item_content.setText(mList.get(position));

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void removeItem(int position) {
        mList.remove(position);
        notifyDataSetChanged();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView item_content;
        private TextView item_delete;
        public LinearLayout item_layout;

        public MyViewHolder(View itemView) {
            super(itemView);

            item_content = (TextView) itemView.findViewById(R.id.item_content);
            item_delete = (TextView) itemView.findViewById(R.id.item_delete);
            item_layout = (LinearLayout) itemView.findViewById(R.id.item_layout);
        }
    }
}
