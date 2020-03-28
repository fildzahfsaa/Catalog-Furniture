package id.ac.fildzah.catalog_furniture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.fildzah.catalog_furniture.adapters.ProductAdapter;
import id.ac.fildzah.catalog_furniture.models.Product;

public class Product7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product7);

        RecyclerView productView = findViewById(R.id.rv_product7);

        List<Product> product = new ArrayList<>();
        product.add(new Product(R.drawable.bangku1_1, "Steelmaw", "STEELMAW ST46-W", "Black", "Rp 399.200"));
        product.add(new Product(R.drawable.bangku1_2, "Steelmaw", "STEELMAW ST46-W", "Red", "Rp 399.200"));


        ProductAdapter adapter = new ProductAdapter(this, product);
        productView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        productView.setLayoutManager(layoutManager);
    }
}
