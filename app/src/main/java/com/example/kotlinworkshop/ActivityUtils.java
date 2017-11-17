package com.example.kotlinworkshop;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class ActivityUtils {

    public static void startSecondActivity(Context context, Bundle extras) {
        Intent intent = new Intent(context, SecondActivityJava.class);
        intent.putExtras(extras);
        context.startActivity(intent);
    }
}
