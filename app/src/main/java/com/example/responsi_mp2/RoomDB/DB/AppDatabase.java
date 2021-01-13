package com.example.responsi_mp2.RoomDB.DB;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.responsi_mp2.RoomDB.Dao.materiDao;
import com.example.responsi_mp2.RoomDB.Model.Materi;

@Database(entities = {Materi.class},version= 1)
public abstract class AppDatabase extends RoomDatabase{
    public abstract materiDao userDao();
}

