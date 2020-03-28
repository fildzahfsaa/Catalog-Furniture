package id.ac.fildzah.catalog_furniture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.fildzah.catalog_furniture.adapters.ProductAdapter;
import id.ac.fildzah.catalog_furniture.models.Catalog;

public class Product2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product2);
    }
}
