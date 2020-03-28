package id.ac.fildzah.catalog_furniture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.fildzah.catalog_furniture.adapters.ProductAdapter;
import id.ac.fildzah.catalog_furniture.models.Product;

public class Product5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product5);

        RecyclerView productView = findViewById(R.id.rv_product5);

        List<Product> product = new ArrayList<>();
        product.add(new Product(R.drawable.ranjang1_1, "Patron", "PATBD 120", "Brown Walnut", "Rp 1.329.300"));
        product.add(new Product(R.drawable.ranjang1_3, "Patron", "PATBD 120", "Yellow Oak", "Rp 1.329.300"));
        product.add(new Product(R.drawable.ranjang2_2, "Patron", "PATBD 160", "Yellow Oak", "Rp 1.819.300"));
        product.add(new Product(R.drawable.ranjang3_1, "Roma", "ROBD 120", "Brown Walnut", "Rp 1.505.000"));
        product.add(new Product(R.drawable.ranjang3_2, "Roma", "ROBD 120", "Sonoma Oak", "Rp 1.505.000"));
        product.add(new Product(R.drawable.ranjang4_1, "Volta", "VOBD 120", "Brown Walnut", "Rp 1.259.300"));
        product.add(new Product(R.drawable.ranjang5_1, "Volta", "VOBD 160", "Sonoma Oak", "Rp 2.115.000"));


        ProductAdapter adapter = new ProductAdapter(this, product);
        productView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        productView.setLayoutManager(layoutManager);
    }
}
