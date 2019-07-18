package com.chavez.mrjuerga.adapters;


import android.content.Context;
        import android.content.Intent;
        import android.media.Image;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageButton;
        import android.widget.ImageView;
        import android.widget.TextView;


import com.chavez.mrjuerga.R;
import com.chavez.mrjuerga.models.ProductoReal;

import java.util.List;


public class ProductAdapter extends ArrayAdapter<ProductoReal> {
    Context context;


    private class ViewHolder {

        TextView name;
        TextView price;
        TextView description;
        TextView category;
        ImageButton btnAddToBag;

        private ViewHolder() {
        }
    }

    public ProductAdapter(Context context, List<ProductoReal> items) {
        super(context, 0, items);
        this.context = context;

    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        final ProductoReal rowItem = (ProductoReal) getItem(position);
        LayoutInflater mInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.adapter_product_item, null);
            holder = new ViewHolder();
//            holder.image = (ImageView) convertView.findViewById(R.id.image);

            holder.name = (TextView) convertView.findViewById(R.id.name);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.name.setText(rowItem.getName());




//        holder.image.setImageBitmap(rowItem.getSmallBitMap());
        return convertView;
    }
}
