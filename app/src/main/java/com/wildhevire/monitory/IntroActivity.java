package com.wildhevire.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

// NIM : 10118044
// Nama : Wildan Muhammad Fikri
// Tanggal Pengerjaan : 8 Mei 2021
public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }
    public void GoToKeluarga(View view){
        ActivityManager.GoToActivity(this, KeluargaActivity.class);
    }
}