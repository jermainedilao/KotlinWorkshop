package com.example.kotlinworkshop

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter


class CheeseAdapter(private val context: Context, private var cheeseArray: Array<String>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val view: View?
        val cheeseViewHolder: CheeseViewHolder
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_cheese, parent, false)
            cheeseViewHolder = CheeseViewHolder(view)
            view?.tag = cheeseViewHolder
        } else {
            view = convertView
            cheeseViewHolder = convertView.tag as CheeseViewHolder
        }

        cheeseViewHolder.textView.text = cheeseArray[position]
        return view
    }

    override fun getItem(position: Int) = cheeseArray[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getCount() = cheeseArray.size
}