package com.example.apinrdw.sampleproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        com.example.mylibrary.HelloWorld helloWorld = new com.example.mylibrary.HelloWorld();
        Log.d("MainActivity", helloWorld.sayHello());

        com.example.testlibrary.HelloWorld helloWorld2 = new com.example.testlibrary.HelloWorld();
        Log.d("MainActivity", helloWorld2.sayHello());
    }
}
