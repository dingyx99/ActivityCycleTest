package me.dingyx99.activitycycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "LIFECYCLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "(1) onCreate()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "(2) onStart() ");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "(3) onRestoreInstanceState() ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "(4) onResume() ");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "(5) onSaveInstanceState() ");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.i(TAG, "(6) onRestart() ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "(7) onPause() ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "(8) onStop() ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "(9) onDestroy() ");
    }
}
