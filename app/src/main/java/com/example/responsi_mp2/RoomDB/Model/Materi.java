package com.example.responsi_mp2.RoomDB.Model;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

public class Materi {

    @PrimaryKey (autoGenerate = true)
    int id;
    @ColumnInfo (name = "dosen")
    String dosen;
    @ColumnInfo (name = "matkul")
    String matkul;
    @ColumnInfo (name = "judul")
    String judul;
    @ColumnInfo (name = "prodi")
    String prodi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
