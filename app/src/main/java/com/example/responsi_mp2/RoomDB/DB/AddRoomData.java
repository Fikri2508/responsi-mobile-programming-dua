package com.example.responsi_mp2.RoomDB.DB;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.responsi_mp2.R;
import com.example.responsi_mp2.RoomDB.Model.Materi;

import static com.example.responsi_mp2.RoomDB.DB.MyApp.db;

public class AddRoomData extends AppCompatActivity {

    EditText namadosen;
    EditText matkul;
    EditText judul;
    EditText prodi;
    Button tambah;
    Materi materi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_room_data);
        namadosen = findViewById(R.id.nama);
        matkul = findViewById(R.id.matkul);
        judul = findViewById(R.id.judul);
        prodi = findViewById(R.id.prodi);
        tambah = findViewById(R.id.btninsert);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tambah();
            }
        });
    }

    private void tambah(){
        if (namadosen.getText().toString().isEmpty()&&!matkul.getText().toString().isEmpty()&&!
        judul.getText().toString().isEmpty()&&!prodi.getText().toString().isEmpty()){

            materi = new Materi();
            materi.setDosen(namadosen.getText().toString());
            materi.setMatkul(matkul.getText().toString());
            materi.setJudul(judul.getText().toString());
            materi.setProdi(prodi.getText().toString());

            db.userDao().insertAll(materi);
            startActivity(new Intent());

        }
    }
}