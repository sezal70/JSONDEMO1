package com.example.sejal.jsondemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String data = loadAssetsData("student.json");
        Student student = getData(data);
        Log.e("Student",student.toString());
    }

    public String loadAssetsData(String filename)
}
