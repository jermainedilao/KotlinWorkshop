package com.example.kotlinworkshop

import android.app.Activity
import android.content.Intent
import android.os.Bundle


fun Activity.startSecondActivity(extras: Bundle) {
    val intent = Intent(this, SecondActivity::class.java)
    intent.putExtras(extras)
    startActivity(intent)
}