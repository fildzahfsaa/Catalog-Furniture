package id.ac.fildzah.catalog_furniture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.fildzah.catalog_furniture.adapters.CategoryAdapter;
import id.ac.fildzah.catalog_furniture.adapters.ProductAdapter;
import id.ac.fildzah.catalog_furniture.models.Product;

public class Product1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product1);

        RecyclerView productView = findViewById(R.id.rv_product1);

        List<Product> product = new ArrayList<>();
        product.add(new Product(R.drawable.raktv1_1, "Mocca L"));
        product.add(new Product(R.drawable.raktv1_2, "DUAAAAA"));
        product.add(new Product(R.drawable.raktv2_1, "TIGAAAA"));


//        category.add(new Catalog(R.drawable.raktv2_1, "Rak TV", "1"));

        ProductAdapter adapter = new ProductAdapter(this, product);
        productView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        productView.setLayoutManager(layoutManager);
    }
}
