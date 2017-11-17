package com.example.kotlinworkshop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivityJava extends AppCompatActivity {

    private CheeseAdapterJava adapter;
    private ListView listView;
    private EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        editText = findViewById(R.id.editText);

        adapter = new CheeseAdapterJava(this, CheeseJava.ARRAY);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Bundle extras = new Bundle();
                extras.putString(SecondActivityJava.EXTRA_CHEESE, adapter.getItem(position));
                ActivityUtils.startSecondActivity(MainActivityJava.this, extras);
            }
        });
    }

    public void onButtonClick(View view) {
        String filter = editText.getText().toString();

        String[] cheeseArray;
        List<String> cheeseList = new ArrayList<>();
        if (!filter.isEmpty()) {
            for (String cheese : CheeseJava.ARRAY) {
                if (cheese.startsWith(filter)) {
                    cheeseList.add(cheese);
                }
            }
            cheeseArray = new String[cheeseList.size()];
            cheeseList.toArray(cheeseArray);
        } else {
            cheeseList = Arrays.asList(CheeseJava.ARRAY);
            cheeseArray = new String[CheeseJava.ARRAY.length];
            cheeseList.toArray(cheeseArray);
        }

        adapter.updateItems(cheeseArray);
    }
}
