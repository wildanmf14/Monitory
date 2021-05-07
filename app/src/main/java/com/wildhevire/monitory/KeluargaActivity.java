package com.wildhevire.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

// NIM : 10118044
// Nama : Wildan Muhammad Fikri
// Tanggal Pengerjaan : 8 Mei 2021
public class KeluargaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keluarga);
    }
    public void GoToInput(View view){
        ActivityManager.GoToActivity(this, InputActivity.class);
    }
}