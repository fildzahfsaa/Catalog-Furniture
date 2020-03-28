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
        product.add(new Product(R.drawable.raktv1_1, "Eldig", "ELDTV 80", "Brown Walnut", "Rp 639.200"));
        product.add(new Product(R.drawable.raktv1_2, "Eldig", "ELDTV 80", "Yellow Oak", "Rp 639.200"));
        product.add(new Product(R.drawable.raktv2_1, "Mocca", "MOCCA L", "Brown Walnut - White Glossy", "Rp 1.999.200"));
        product.add(new Product(R.drawable.raktv3_1, "Roma", "ROTV 120", "Brown Walnut", "Rp 799.200"));
        product.add(new Product(R.drawable.raktv4_1, "Volta", "VOTV 100", "Brown Walnut", "Rp 489.300"));
        product.add(new Product(R.drawable.raktv4_2, "Volta", "VOTV 100", "Sonoma Oak", "Rp 489.300"));
        product.add(new Product(R.drawable.raktv5_1, "Kenny", "KENNY", "Brown Walnut - Black", "Rp 699.300"));
        product.add(new Product(R.drawable.raktv6_1, "Lambda", "LDATV 125", "Brown Walnut", "Rp 1.290.000"));
        product.add(new Product(R.drawable.raktv7_1, "Kenny", "KENNY GL", "White GPO - Black", "Rp. 1.000.000"));
        product.add(new Product(R.drawable.raktv8_1, "Petra", "PETTV 225", "Brown Walnut", "Rp 1.935.000"));
        product.add(new Product(R.drawable.raktv8_2, "Petra", "PETTV 225", "Yellow Oak", "Rp 1.935.000"));
        product.add(new Product(R.drawable.raktv8_3, "Petra", "PETTV 225 GL", "White Glossy", "Rp 1.679.300"));

        ProductAdapter adapter = new ProductAdapter(this, product);
        productView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        productView.setLayoutManager(layoutManager);
    }
}
