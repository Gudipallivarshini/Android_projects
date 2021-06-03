package com.example.fourth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("APSSDC","second created");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("APSSDC","second Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("APSSDC","second Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("APSSDC","second Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("APSSDC","second Activity Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("APSSDC","second Activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("APSSDC","second Activity Destroyed");
    }


}
