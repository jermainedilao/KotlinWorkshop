package com.example.kotlinworkshop;


import android.view.View;
import android.widget.TextView;

public class CheeseViewHolderJava {

    private final TextView textView;

    public CheeseViewHolderJava(View view) {
        textView = view.findViewById(R.id.textView);
    }

    public TextView getTextView() {
        return textView;
    }
}
