package com.example.sqlitedatabaseappdemo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        DataBaseHelper DBH = new DataBaseHelper(this);
        DBH.addContact("A", "9876543210");
        DBH.addContact("B", "9876543211");
        DBH.addContact("C", "9876543212");
        DBH.addContact("D", "9876543213");
        DBH.addContact("E", "9876543214");
        DBH.addContact("F", "9876543215");
        DBH.addContact("G", "9876543216");
        DBH.addContact("H", "9876543217");
        DBH.addContact("I", "9876543218");
        DBH.addContact("J", "9876543219");
        DBH.addContact("K", "9876543220");
    }
}