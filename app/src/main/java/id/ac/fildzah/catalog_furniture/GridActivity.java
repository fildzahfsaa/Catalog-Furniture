package id.ac.fildzah.catalog_furniture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.fildzah.catalog_furniture.adapters.GridAdapter;
import id.ac.fildzah.catalog_furniture.models.Catalog;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        RecyclerView catalogView = findViewById(R.id.rv_catalog);

        List<Catalog> catalog = new ArrayList<>();
//        catalog.add(new Catalog(R.drawable.));

        GridAdapter adapter = new GridAdapter(this, catalog);
        catalogView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 1);
        catalogView.setLayoutManager(layoutManager);
    }
}
