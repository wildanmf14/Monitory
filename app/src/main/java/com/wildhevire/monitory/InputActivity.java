package com.wildhevire.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
// NIM : 10118044
// Nama : Wildan Muhammad Fikri
// Tanggal Pengerjaan : 8 Mei 2021
public class InputActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.wildhevire.monitory.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
    }

    public void GoToEnd(View view) {
        EditText txt = (EditText) findViewById(R.id.txtNama);
        String message = txt.getText().toString();
        ActivityManager.GoToActivity(this, EndActivity.class, message);
    }
}