package id.ac.fildzah.catalog_furniture.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.fildzah.catalog_furniture.Product1Activity;
import id.ac.fildzah.catalog_furniture.Product2Activity;
import id.ac.fildzah.catalog_furniture.Product3Activity;
import id.ac.fildzah.catalog_furniture.Product4Activity;
import id.ac.fildzah.catalog_furniture.Product5Activity;
import id.ac.fildzah.catalog_furniture.Product6Activity;
import id.ac.fildzah.catalog_furniture.Product7Activity;
import id.ac.fildzah.catalog_furniture.Product8Activity;
import id.ac.fildzah.catalog_furniture.R;
import id.ac.fildzah.catalog_furniture.models.Catalog;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private Context context;
    private List<Catalog> items;

    public CategoryAdapter(Context context, List<Catalog> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_category, parent, false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Catalog item = items.get(position);
        holder.nameText.setText(item.getName());
        Picasso.get().load(item.getPict()).into(holder.logoImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (items.get(position).getRowID().matches("1")){
                    Intent gotoactivity = new Intent(context, Product1Activity.class);
                    context.startActivity(gotoactivity);
                } else if (items.get(position).getRowID().matches("2")){
                    Intent gotoactivity = new Intent(context, Product2Activity.class);
                    context.startActivity(gotoactivity);
                } else if (items.get(position).getRowID().matches("3")){
                    Intent gotoactivity = new Intent(context, Product3Activity.class);
                    context.startActivity(gotoactivity);
                } else if (items.get(position).getRowID().matches("4")){
                    Intent gotoactivity = new Intent(context, Product4Activity.class);
                    context.startActivity(gotoactivity);
                } else if (items.get(position).getRowID().matches("5")){
                    Intent gotoactivity = new Intent(context, Product5Activity.class);
                    context.startActivity(gotoactivity);
                } else if (items.get(position).getRowID().matches("6")){
                    Intent gotoactivity = new Intent(context, Product6Activity.class);
                    context.startActivity(gotoactivity);
                } else if (items.get(position).getRowID().matches("7")){
                    Intent gotoactivity = new Intent(context, Product7Activity.class);
                    context.startActivity(gotoactivity);
                } else if (items.get(position).getRowID().matches("8")){
                    Intent gotoactivity = new Intent(context, Product8Activity.class);
                    context.startActivity(gotoactivity);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
        }
    }
}
