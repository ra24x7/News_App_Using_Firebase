package com.example.rajat.newsapp;
import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class NewsApp extends Application {

    public void onCreate(){
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
