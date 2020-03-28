package id.ac.fildzah.catalog_furniture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.fildzah.catalog_furniture.adapters.ProductAdapter;
import id.ac.fildzah.catalog_furniture.models.Catalog;
import id.ac.fildzah.catalog_furniture.models.Product;

public class Product2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product2);

        RecyclerView productView = findViewById(R.id.rv_product2);

        List<Product> product = new ArrayList<>();
        product.add(new Product(R.drawable.lemari4_1, "Belvis", "BLVWD 160", "Brown Walnut", "Rp 4.499.000"));
        product.add(new Product(R.drawable.lemari4_2, "Belvis", "BLVWD 160", "Yellow Oak", "Rp 4.499.000"));
        product.add(new Product(R.drawable.lemari5_1, "Inbiz", "IBZWDSL 150HH", "Brown Walnut - White Glossy", "Rp 4.450.000"));
        product.add(new Product(R.drawable.lemari6_1, "Inbiz", "IBZWD 2FF", "Brown Walnut - White Glossy", "Rp 3.450.000"));
        product.add(new Product(R.drawable.lemari7_1, "Texas", "TXWD 160 SSL", "Brown Walnut", "Rp 5.450.000"));
        product.add(new Product(R.drawable.lemari9_1, "Volta", "VOWDD 2", "Brown Walnut", "Rp 1.709.100"));
        product.add(new Product(R.drawable.lemari10_1, "Vegas", "VGSWDSL 150NNGL", "White GPO", "Rp 4.139.100"));


        ProductAdapter adapter = new ProductAdapter(this, product);
        productView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        productView.setLayoutManager(layoutManager);


    }
}
