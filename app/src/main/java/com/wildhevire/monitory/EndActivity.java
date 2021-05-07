package com.wildhevire.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.MessageFormat;

// NIM : 10118044
// Nama : Wildan Muhammad Fikri
// Tanggal Pengerjaan : 8 Mei 2021
public class EndActivity extends AppCompatActivity {
    String text = "Beres! Sekarang {0} udah bisa ngecek penggunakan HP mu tiap hari buat bantu {0} ngatur waktu :)";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        String intentMessage = GetTextFromIntent();
        String message = MessageFormat.format(text, intentMessage);
        SetText(message);
    }
    public void CloseApp(View view){
        finishAffinity();
    }

    private String GetTextFromIntent(){
        Intent intent = getIntent();
        return intent.getStringExtra(InputActivity.EXTRA_MESSAGE);
    }

    private void SetText(String message){
        TextView textView = findViewById(R.id.text);
        textView.setText(message);
    }
}