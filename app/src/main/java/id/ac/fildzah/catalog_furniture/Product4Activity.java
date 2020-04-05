package id.ac.fildzah.catalog_furniture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.fildzah.catalog_furniture.adapters.ProductAdapter;
import id.ac.fildzah.catalog_furniture.models.Product;

public class Product4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product4);

        RecyclerView productView = findViewById(R.id.rv_product4);

        List<Product> product = new ArrayList<>();
        product.add(new Product(R.drawable.sofa1_1, "Alextra", "ALEXTRA 3S", "Beige Brown XO", "Rp 5.599.000"));
        product.add(new Product(R.drawable.sofa2_1, "Alextra", "ALEXTRA 1S", "Beige Brown XO", "Rp 3.015.000"));
        product.add(new Product(R.drawable.sofa5_2, "Dastan", "DASTAN SBD L", "Brown", "Rp 2.699.100"));
        product.add(new Product(R.drawable.sofa6_2, "Conor", "CONOR SBD L", "Brown", "Rp 3.899.000"));
        product.add(new Product(R.drawable.sofa6_3, "Conor", "CONOR SBD L", "Grey Brown", "Rp 3.899.000"));
        product.add(new Product(R.drawable.sofa8_1, "Keelis", "KEELIS AC", "Grey Brown", "Rp 2.399.000"));
        product.add(new Product(R.drawable.sofa9_1, "Miracle", "MIRACLE CORNER", "GREY VN", "Rp 2.385.000"));
        product.add(new Product(R.drawable.sofa10_1, "Martian", "MARTIAN SBD", "Beige Brown XO", "Rp 3.149.100"));

        ProductAdapter adapter = new ProductAdapter(this, product);
        productView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        productView.setLayoutManager(layoutManager);
    }
}
