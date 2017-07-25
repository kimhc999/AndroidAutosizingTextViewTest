package com.example.hckim.autosizingtextviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCheckboxTest(View v) {
        Intent granularityIntent = new Intent(MainActivity.this, CheckboxTestActivity.class);
        startActivity(granularityIntent);
    }
    public void onClickCheckboxSupportTest(View v) {
        Intent granularityIntent = new Intent(MainActivity.this, CheckboxSupportTestActivity.class);
        startActivity(granularityIntent);
    }
    public void onClickEdittextTest(View v) {
        Intent granularityIntent = new Intent(MainActivity.this, EdittextTestActivity.class);
        startActivity(granularityIntent);
    }
    public void onClickEdittextSupportTest(View v) {
        Intent granularityIntent = new Intent(MainActivity.this, EdittextSupportTestActivity.class);
        startActivity(granularityIntent);
    }
    public void onClickToggleButtonTest(View v) {
        Intent granularityIntent = new Intent(MainActivity.this, ToggleTestActivity.class);
        startActivity(granularityIntent);
    }
    public void onClickToggleButtonSupportTest(View v) {
        Intent granularityIntent = new Intent(MainActivity.this, ToggleSupportTestActivity.class);
        startActivity(granularityIntent);
    }

}
