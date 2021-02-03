package com.robertlevonyan.views.chipsample;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.robertlevonyan.views.chip.Chip;
import com.robertlevonyan.views.chip.OnCloseClickListener;
import com.robertlevonyan.views.chip.OnIconClickListener;
import com.robertlevonyan.views.chip.OnSelectClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout activity_main = findViewById(R.id.activity_main);
//        Chip chip = findViewById(R.id.football_chip);
        Chip chip = new Chip(this);
        chip.setText("Some Text");
//        chip.setChipSelectableWithoutIcon(true);
//        chip.setIconText("My Icon", Color.YELLOW, Color.BLACK);
//        chip.setSelectable(true);
//        chip.setChipSelectedTextColor(Color.BLACK);
//        chip.setChipTextColor(Color.RED);
//        chip.setStrokeColor(Color.BLUE);
//        chip.setStrokeSize(1);
//        chip.setCornerRadius(100);
//        chip.setSelectable(true);
//        chip.setChipSelectedCloseColor(Color.BLUE);
//        chip.setChipCloseColor(Color.YELLOW);
        chip.setChipBackgroundColor(Color.GREEN);
        chip.setChipSelectedBackgroundColor(Color.RED);
        chip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Chip", "click");
            }
        });
        chip.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {
                Log.e("Chip", "" + selected);
            }
        });

        activity_main.addView(chip, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

//        chip.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Your action here...
//            }
//        });
//
//        chip.setOnCloseClickListener(new OnCloseClickListener() {
//            @Override
//            public void onCloseClick(View v) {
//                //Your action here...
//            }
//        });
//
//        chip.setOnIconClickListener(new OnIconClickListener() {
//            @Override
//            public void onIconClick(View v) {
//                //Your action here...
//            }
//        });
//
//        chip.setOnSelectClickListener(new OnSelectClickListener() {
//            @Override
//            public void onSelectClick(View v, boolean selected) {
//                //Your action here...
//            }
//        });
    }
}