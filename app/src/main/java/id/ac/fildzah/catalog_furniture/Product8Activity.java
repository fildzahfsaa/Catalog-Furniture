package id.ac.fildzah.catalog_furniture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.fildzah.catalog_furniture.adapters.ProductAdapter;
import id.ac.fildzah.catalog_furniture.models.Product;

public class Product8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product8);

        RecyclerView productView = findViewById(R.id.rv_product8);

        List<Product> product = new ArrayList<>();
        product.add(new Product(R.drawable.meja1_1, "Flava", "FLVDK", "Brown Walnut", "Rp 699.300"));
        product.add(new Product(R.drawable.meja2_1, "Brico", "BRCSDT 120", "Brown Walnut - Black", "Rp 799.500"));
        product.add(new Product(R.drawable.meja2_2, "Brico", "BRCSDT 120", "Sanremo Dark - Black", "Rp 799.500"));
        product.add(new Product(R.drawable.meja3_1, "Flicka", "FLICKA", "Yellow Oak", "Rp 1.000.000"));
        product.add(new Product(R.drawable.meja4_1, "Impala", "IMPCT 100", "Brown Walnut - White Glossy", "Rp 1.349.100"));
        product.add(new Product(R.drawable.meja4_2, "Impala", "IMPCT 100", "Yellow Oak - White Glossy", "Rp 1.349.100"));
        product.add(new Product(R.drawable.meja5_1, "Ovi", "OVI", "Brown Walnut", "Rp 1.709.100"));
        product.add(new Product(R.drawable.meja5_3, "Ovi", "OVI", "Yellow Oak", "Rp 1.709.100"));
        product.add(new Product(R.drawable.meja6_1, "Menya", "MNYDT 120 GL", "White Glossy", "Rp 1.470.000"));
        product.add(new Product(R.drawable.meja7_1, "Petra", "PETET 50", "Brown Walnut", "Rp 450.000"));
        product.add(new Product(R.drawable.meja7_2, "Petra", "PETET 50", "Yellow Oak", "Rp 450.000"));
        product.add(new Product(R.drawable.meja8_1, "Volta", "VODK 120", "Brown Walnut", "Rp 699.000"));
        product.add(new Product(R.drawable.meja8_2, "Volta", "VODK 120", "Sonoma Oak", "Rp 699.000"));
        product.add(new Product(R.drawable.meja9_1, "Balcan", "BLCCT 120", "Yellow Oak", "Rp 699.000"));


        ProductAdapter adapter = new ProductAdapter(this, product);
        productView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        productView.setLayoutManager(layoutManager);
    }
}
