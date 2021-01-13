package com.example.responsi_mp2.RoomDB.DB;

import android.app.Application;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public class MyApp extends Application {
    public static RoomDatabase.Builder<AppDatabase> db;

    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"Materi").allowMainThreadQueries();
    }
}
