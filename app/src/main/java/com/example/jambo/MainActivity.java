package com.example.jambo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.util.MissingFormatArgumentException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textView;
    Button storyButton;
    Button storyButton2;
    Button storyButton3;

    private static final String TAG = Activity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        storyButton = findViewById(R.id.storyButton);
        storyButton.setOnClickListener(this);

        storyButton2 = findViewById(R.id.storyButton2);
        storyButton2.setOnClickListener(this);

        storyButton3 = findViewById(R.id.storyButton3);
        storyButton3.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.storyButton:
                callIntent(MainActivity.this, Story1Activity.class);
            case R.id.storyButton2:
                callIntent(MainActivity.this,Story2Activity.class);
            case R.id.storyButton3:
                callIntent(MainActivity.this, Story3Activity.class);

        }
    }

    public void callIntent(Object obj, Class<?> cas){
        Intent intent = new Intent((Context) obj, cas);
        startActivity(intent);
    }
}


