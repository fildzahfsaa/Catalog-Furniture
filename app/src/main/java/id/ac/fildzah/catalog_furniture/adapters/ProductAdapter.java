package id.ac.fildzah.catalog_furniture.adapters;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.fildzah.catalog_furniture.DetailActivity;
import id.ac.fildzah.catalog_furniture.R;
import id.ac.fildzah.catalog_furniture.models.Catalog;
import id.ac.fildzah.catalog_furniture.models.Product;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    private Context context;
    private List<Product> items;

    public ProductAdapter(Context context, List<Product> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_grid, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Product item = items.get(position);
        holder.nameText.setText(item.getName());
        Picasso.get().load(item.getPict()).into(holder.pict);
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailActivity.class);
                i.putExtra("pict", item.getPict());
                i.putExtra("name", item.getName());
                i.putExtra("kode", item.getKode());
                i.putExtra("warna", item.getWarna());
                i.putExtra("harga", item.getHarga());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView pict;
        TextView nameText;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            pict = itemView.findViewById(R.id.picture);
            nameText = itemView.findViewById(R.id.text_name);
            constraintLayout = itemView.findViewById(R.id.constraint);
        }
    }
}
