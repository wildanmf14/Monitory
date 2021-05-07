package com.wildhevire.monitory;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

// NIM : 10118044
// Nama : Wildan Muhammad Fikri
// Tanggal Pengerjaan : 8 Mei 2021
public class ActivityManager {
    public static final String EXTRA_MESSAGE = "com.wildhevire.monitory.MESSAGE";
    public static void GoToActivity(AppCompatActivity current, Class next){
        Intent intent = new Intent(current, next);
        current.startActivity(intent);
    }
    public static void GoToActivity(AppCompatActivity current, Class next, String message){
        Intent intent = new Intent(current, next);
        intent.putExtra(EXTRA_MESSAGE, message);
        current.startActivity(intent);
    }

}