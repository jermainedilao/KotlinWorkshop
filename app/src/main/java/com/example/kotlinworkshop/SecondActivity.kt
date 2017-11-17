package com.example.kotlinworkshop

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    companion object {
        val EXTRA_CHEESE = "extra:cheese"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val cheese = intent.extras.getString(EXTRA_CHEESE, "")
        textView2.text = cheese
    }
}