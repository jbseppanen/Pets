package com.example.jacob.pets;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.util.TypedValue;


public class MainActivity extends AppCompatActivity {

    public static final String[] animals = new String[]{"Dog", "Cat", "Parrot", "Goldfish"};

    LinearLayout layoutList;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);layoutList = findViewById(R.id.layout_petlist);
        context = this;
        for(String animal: animals) {
            layoutList.addView(defaultTextViewGenerator(animal));
        }



    }

    private TextView defaultTextViewGenerator(String displayText) {

        TextView view = new TextView(context);
        view.setText(displayText);
        view.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        view.setPadding(15, 15, 15, 15);
        view.setTextAlignment(view.TEXT_ALIGNMENT_CENTER);
        view.setWidth(2000);
        return view;
    }
}
