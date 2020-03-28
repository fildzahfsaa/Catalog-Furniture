package id.ac.fildzah.catalog_furniture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.fildzah.catalog_furniture.adapters.CategoryAdapter;
import id.ac.fildzah.catalog_furniture.models.Catalog;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        RecyclerView categoryView = findViewById(R.id.rv_category);

        List<Catalog> category = new ArrayList<>();
        category.add(new Catalog(R.drawable.raktv2_1, "Rak TV"));
        category.add(new Catalog(R.drawable.lemari7_1, "Lemari"));
        category.add(new Catalog(R.drawable.kursimakan1_1, "Kursi"));
        category.add(new Catalog(R.drawable.sofa5_2, "Sofa"));
        category.add(new Catalog(R.drawable.ranjang3_1, "Ranjang"));
        category.add(new Catalog(R.drawable.rakbuku2_3, "Rak Buku"));
        category.add(new Catalog(R.drawable.bangku1_1, "Bangku"));

        CategoryAdapter adapter = new CategoryAdapter(this, category);
        categoryView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        categoryView.setLayoutManager(layoutManager);
    }
}
