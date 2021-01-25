package com.example.remidi;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.remidi.model.Harimau;

import java.util.List;

public class HarimauActivity extends AppCompatActivity {

    List<Harimau> harimaus;
    int indeksTampil = 0;
    Button btnPertama, btnTerakhir, btnSebelumnya, btnBerikutnya;
    TextView txJenis, txAsal, txDeskripsi, txJudul;
    ImageView ivFotoBurung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        harimaus = DataProvider.getAllHarimau(this);
        inisialisasiView();
        tampilkanProfilBurung();
    }

    private void inisialisasiView(){
        btnPertama = findViewById(R.id.btnPertama);
        btnTerakhir = findViewById(R.id.btnTerakhir);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);

        btnPertama.setOnClickListener(view -> burungPertama());
        btnTerakhir.setOnClickListener(view -> burungTerakhir());
        btnBerikutnya.setOnClickListener(view -> burungBerikutnya());
        btnSebelumnya.setOnClickListener(view -> burungSebelumnya());

        txJenis = findViewById(R.id.txJenis);
        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoBurung = findViewById(R.id.gambarHewan);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Ras Ikan");
    }

    private void tampilkanProfilBurung(){
        Harimau k = harimaus.get(indeksTampil);
        Log.d("Anjing","Menampilkan ikan"+k.getJenis());
        txJenis.setText(k.getJenis());
        txAsal.setText(k.getAsal());
        txDeskripsi.setText(k.getDeskripsi());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ivFotoBurung.setImageDrawable(this.getDrawable(k.getDrawebleRes()));
        }
    }

    private void burungPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this, "Sudah di posisi harimau pertama", Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfilBurung();
        }
    }
    private void burungTerakhir() {
        int posAkhir = harimaus.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi harimau terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfilBurung();
        }
    }
    private void burungBerikutnya(){
        if (indeksTampil == harimaus.size() -1){
            Toast.makeText(this,"Sudah di posisi harimau terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfilBurung();
        }
    }
    private void burungSebelumnya(){
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi harimau pertama",Toast.LENGTH_SHORT).show();
            return;
        } else{
            indeksTampil --;
            tampilkanProfilBurung();
        }
    }
}
