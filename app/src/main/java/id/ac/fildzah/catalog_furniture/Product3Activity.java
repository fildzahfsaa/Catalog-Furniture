package id.ac.fildzah.catalog_furniture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.fildzah.catalog_furniture.adapters.ProductAdapter;
import id.ac.fildzah.catalog_furniture.models.Product;

public class Product3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product3);

        RecyclerView productView = findViewById(R.id.rv_product3);

        List<Product> product = new ArrayList<>();
        product.add(new Product(R.drawable.kursimakan1_1, "Molinka", "MOLINKA DC", "Brown", "Rp 489.300"));
        product.add(new Product(R.drawable.kursimakan1_2, "Molinka", "MOLINKA DC", "Grey", "Rp 489.300"));
        product.add(new Product(R.drawable.kursimakan1_3, "Molinka", "MOLINKA DC", "Yellow", "Rp 489.300"));
        product.add(new Product(R.drawable.kursimakan2_1, "Serah", "SERAH DC", "Black", "Rp 799.000"));
        product.add(new Product(R.drawable.kursimakan2_2, "Serah", "SERAH DC", "Cream", "Rp 799.000"));
        product.add(new Product(R.drawable.kursimakan2_3, "Serah", "SERAH DC", "Grey Brown", "Rp 799.000"));
        product.add(new Product(R.drawable.kursimakan3_1, "Benoit", "BENOIT", "Black", "Rp 629.100"));
        product.add(new Product(R.drawable.kursimakan3_2, "Benoit", "BENOIT", "Terracotta", "Rp 629.100"));
        product.add(new Product(R.drawable.kursimakan4_1, "Steelmaw", "STEELMAW DC B-AF", "Antique Red", "Rp 719.100"));
        product.add(new Product(R.drawable.kursimakan4_2, "Steelmaw", "STEELMAW DC B-AF", "Antique Sky-Blue", "Rp 719.100"));
        product.add(new Product(R.drawable.kursilipat1_1, "Forlisa", "FORLISA", "Black", "Rp 299.000"));
        product.add(new Product(R.drawable.kursimakan5_1, "Debs", "DEBS DC", "Maroon", "Rp 699.300"));
        product.add(new Product(R.drawable.kursimakan6_1, "Starpaw", "STARPAW DC", "Black", "Rp 559.200"));
        product.add(new Product(R.drawable.kursibar1_1, "Steelmaw", "STEELMAW ST76-W", "Red", "Rp 599.000"));

        ProductAdapter adapter = new ProductAdapter(this, product);
        productView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        productView.setLayoutManager(layoutManager);
    }
}
