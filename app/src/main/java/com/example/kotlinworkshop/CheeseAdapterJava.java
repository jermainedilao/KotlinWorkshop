package com.example.kotlinworkshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CheeseAdapterJava extends BaseAdapter {

    private Context context;
    private String[] cheeseArray;

    public CheeseAdapterJava(Context context, String[] cheeseArray) {
        this.context = context;
        this.cheeseArray = cheeseArray;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        CheeseViewHolderJava cheeseViewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_cheese, parent, false);
            cheeseViewHolder = new CheeseViewHolderJava(view);
            view.setTag(cheeseViewHolder);
        } else {
            view = convertView;
            cheeseViewHolder = (CheeseViewHolderJava) convertView.getTag();
        }

        cheeseViewHolder.getTextView().setText(cheeseArray[position]);
        return view;
    }

    @Override
    public String getItem(int position) {
        return cheeseArray[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return cheeseArray.length;
    }

    public void updateItems(String[] newCheeseArray) {
        cheeseArray = newCheeseArray;
        notifyDataSetChanged();
    }
}
