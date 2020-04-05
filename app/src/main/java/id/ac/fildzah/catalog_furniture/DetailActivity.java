package id.ac.fildzah.catalog_furniture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView pict;
    TextView name, kode, warna, harga;
    String name2, kode2, warna2, harga2;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        pict = findViewById(R.id.pict);
        name = findViewById(R.id.name);
        kode = findViewById(R.id.kode);
        warna = findViewById(R.id.warna);
        harga = findViewById(R.id.harga);

        name2 = getIntent().getStringExtra("name");
        kode2 = getIntent().getStringExtra("kode");
        warna2 = getIntent().getStringExtra("warna");
        harga2 = getIntent().getStringExtra("harga");
        image = getIntent().getIntExtra("pict", 0);

        name.setText("Nama Product : "+ name2);
        kode.setText("Kode Product : "+ kode2);
        warna.setText("Warna : "+ warna2);
        harga.setText("Harga : "+ harga2);
        pict.setImageResource(image);
    }
}
