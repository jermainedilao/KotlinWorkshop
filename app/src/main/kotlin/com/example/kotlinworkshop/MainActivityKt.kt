package com.example.kotlinworkshop

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivityKt : AppCompatActivity() {

    lateinit var adapter: CheeseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CheeseAdapter(this, CheeseKt.LIST)
        listView.adapter = adapter
        listView.setOnItemClickListener { _, _, position, _ ->
            val extras = Bundle()
            extras.putString(SecondActivity.EXTRA_CHEESE, adapter.getItem(position))
            startSecondActivity(extras)
        }
    }

    fun onButtonClick(view: View) {
        val filter = editText.text.toString()

        val cheeseArray = if (filter.isNotEmpty()) {
            CheeseKt.LIST
                    .filter {
                        it.startsWith(filter, true)
                    }
                    .toTypedArray()
        } else {
            CheeseKt.LIST
        }

        adapter.updateItems(cheeseArray)
    }
}
