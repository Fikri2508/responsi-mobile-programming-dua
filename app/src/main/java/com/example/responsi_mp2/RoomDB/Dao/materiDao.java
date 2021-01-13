package com.example.responsi_mp2.RoomDB.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.responsi_mp2.RoomDB.Model.Materi;

import java.util.List;

@Dao
public interface materiDao {

    @Query("SELECT * FROM Materi")
    List<Materi> getAll();


    @Query("SELECT * FROM Materi WHERE dosen LIKE :dosen ")
    Materi findByName(String nama);

    @Insert
    void insertAll(Materi... mahasiswa);

    @Delete
    public void deleteUsers(Materi... users);

    @Query("SELECT * FROM materi WHERE id LIKE :dosenID LIMIT 1")
    Materi findById(int dosenID);

    @Update
    void update(Materi materi);

    @Insert
    void insertData(Materi materi);

    @Delete
    void delete(Materi materi);
}
