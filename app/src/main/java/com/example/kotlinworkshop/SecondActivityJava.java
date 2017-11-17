package com.example.kotlinworkshop;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivityJava extends AppCompatActivity {

    public static final String EXTRA_CHEESE = "extra:cheese";
    private TextView textView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView2 = findViewById(R.id.textView2);

        String cheese = getIntent().getExtras().getString(EXTRA_CHEESE, "");
        textView2.setText(cheese);
    }
}
