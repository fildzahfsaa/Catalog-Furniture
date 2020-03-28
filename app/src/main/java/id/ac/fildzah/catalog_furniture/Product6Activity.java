package id.ac.fildzah.catalog_furniture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.fildzah.catalog_furniture.adapters.ProductAdapter;
import id.ac.fildzah.catalog_furniture.models.Product;

public class Product6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product6);

        RecyclerView productView = findViewById(R.id.rv_product6);

        List<Product> product = new ArrayList<>();
        product.add(new Product(R.drawable.rakbuku1_1, "Aquila", "AQUBC 40 AO", "Brown Walnut", "Rp 299.000"));
        product.add(new Product(R.drawable.rakbuku1_3, "Aquila", "AQUBC 40 AO", "Rustico", "Rp 299.000"));
        product.add(new Product(R.drawable.rakbuku1_4, "Aquila", "AQUBC 40 AO", "Sanremo Light", "Rp 299.000"));
        product.add(new Product(R.drawable.rakbuku2_1, "Aquila", "AQUBC 835", "Brown Walnut", "Rp 1.699.000"));
        product.add(new Product(R.drawable.rakbuku2_3, "Aquila", "AQUBC 835", "Sanremo Light", "Rp 1.699.000"));
        product.add(new Product(R.drawable.rakbuku2_5, "Aquila", "AQUBC 835", "Yellow Oak", "Rp 1.699.000"));
        product.add(new Product(R.drawable.rakbuku3_1, "Impala", "IMPSU 65", "Light Green Line", "Rp 690.000"));
        product.add(new Product(R.drawable.rakbuku3_3, "Impala", "IMPSU 65", "Yellow Oak", "Rp 690.000"));
        product.add(new Product(R.drawable.rakbuku4_1, "Zara", "ZARA 160GL", "White Glossy - Granite", "Rp 2.835.000"));
        product.add(new Product(R.drawable.rakbuku5_1, "Marsden", "MRDSU 4X1", "Yellow Oak", "Rp 879.000"));
        product.add(new Product(R.drawable.rakbuku6_1, "Patron", "PATSU 240", "Brown Walnut", "Rp 3.015.000"));
        product.add(new Product(R.drawable.rakbuku6_2, "Patron", "PATSU 240", "Yellow Oak", "Rp 3.015.000"));


        ProductAdapter adapter = new ProductAdapter(this, product);
        productView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        productView.setLayoutManager(layoutManager);
    }
}
