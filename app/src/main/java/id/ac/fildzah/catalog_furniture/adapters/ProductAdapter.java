package id.ac.fildzah.catalog_furniture.adapters;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.fildzah.catalog_furniture.R;
import id.ac.fildzah.catalog_furniture.models.Catalog;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    private Context context;
    private List<Catalog> items;

    public ProductAdapter(Context context, List<Catalog> items) {
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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Catalog item = items.get(position);
        holder.nameText.setText(item.getName());
        Picasso.get().load(item.getPict()).into(holder.pict);
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView pict;
        TextView nameText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pict = itemView.findViewById(R.id.picture);
            nameText = itemView.findViewById(R.id.text_name);
        }
    }
}
