package com.example.homepage.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homepage.Interface.ItemClickListener;
import com.example.homepage.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txtProductName, txtPrice;
    public ImageView imageView;
    public ItemClickListener listener;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.product_image);
        txtPrice = (TextView) itemView.findViewById(R.id.product_price);
        txtProductName = (TextView) itemView.findViewById(R.id.product_name);
    }
    public void setItemClickListener(ItemClickListener itemClickListener){
        this.listener = itemClickListener;
    }
    @Override
    public void onClick(View view) {
        listener.onClick(view, getAdapterPosition(), false );
    }
}
