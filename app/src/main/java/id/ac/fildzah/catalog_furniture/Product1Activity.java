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

    private RecyclerView rvProduct;
    private ArrayList<Product> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product1);

        list = new ArrayList<>();

        rvProduct = findViewById(R.id.rv_product1);
        list.addAll(getListProduct1());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvProduct.setLayoutManager(new GridLayoutManager(this, 2));
        ProductAdapter productAdapter = new ProductAdapter(this, list);
        rvProduct.setAdapter(productAdapter);
    }

    public static int picture[]= {
            R.drawable.raktv1_1,
            R.drawable.raktv1_2,
            R.drawable.raktv2_1,
            R.drawable.raktv3_1,
            R.drawable.raktv4_1,
            R.drawable.raktv4_2,
            R.drawable.raktv5_1,
            R.drawable.raktv6_1,
            R.drawable.raktv7_1,
            R.drawable.raktv8_1,
            R.drawable.raktv8_2,
            R.drawable.raktv8_3,
    };

    public static String name[]= {
            "Eldig",
            "Eldig",
            "Mocca",
            "Roma",
            "Volta",
            "Volta",
            "Kenny",
            "Lambda",
            "Kenny",
            "Petra",
            "Petra",
            "Petra",
    };

    public static String kode[]= {
            "ELDTV 80",
            "ELDTV 80",
            "MOCCA L",
            "ROTV 120",
            "VOTV 100",
            "VOTV 100",
            "KENNY",
            "LDATV 125",
            "KENNY GL",
            "PETTV 225",
            "PETTV 225",
            "PETTV 225 GL",
    };

    public static String warna[]= {
            "Brown Walnut",
            "Yellow Oak",
            "Brown Walnut - White Glossy",
            "Brown Walnut",
            "Brown Walnut",
            "Sonoma Oak",
            "Brown Walnut - Black",
            "Brown Walnut",
            "White GPO - Black",
            "Brown Walnut",
            "Yellow Oak",
            "White Glossy",
    };

    public static String harga[]= {
            "Rp 639.200",
            "Rp 639.200",
            "Rp 1.999.200",
            "Rp 799.200",
            "Rp 489.300",
            "Rp 489.300",
            "Rp 699.300",
            "Rp 1.290.000",
            "Rp. 1.000.000",
            "Rp 1.935.000",
            "Rp 1.935.000",
            "Rp 1.679.300",
    };

    static ArrayList<Product> getListProduct1(){
        ArrayList<Product> list = new ArrayList<>();
        for (int position = 0; position < name.length; position++){
            Product pd1 = new Product();
            pd1.setPict(picture[position]);
            pd1.setName(name[position]);
            pd1.setKode(kode[position]);
            pd1.setWarna(warna[position]);
            pd1.setHarga(harga[position]);
        }
        return list;
    }

}