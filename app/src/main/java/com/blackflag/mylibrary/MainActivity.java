package com.blackflag.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.blackflag.testlibrary.TestClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestClass testClass=new TestClass("Test Reply");
        Toast.makeText(MainActivity.this,testClass.getTestString(), Toast.LENGTH_SHORT).show();
    }
}
