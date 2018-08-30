package com.example.harikrishnaa.routin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class itemviewholder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView item_name;
    private ImageView icon;
    Context context;
    public itemviewholder(View itemView, Context context) {
        super(itemView);

        item_name = itemView.findViewById(R.id.item_description);
        icon = itemView.findViewById(R.id.icon_product);
        this.context = context;

        itemView.setOnClickListener(this);
    }

    public void bindNamesData(itemviewmodel viewmodel){
        item_name.setText(viewmodel.getName());
    }
    public void bindIconsData(itemviewmodel viewmodel){
        icon.setImageBitmap(viewmodel.getIcon());
    }

    @Override
    public void onClick(View view) {
        switch(getAdapterPosition()){
            case 0:
                Intent Intent1 = new Intent(context, milkpro.class);
                context.startActivity(Intent1);
                break;
            case 1:
                Intent Intent2 = new Intent(context, beverages.class);
                context.startActivity(Intent2);
                break;

            case 2:
                Intent Intent3 = new Intent(context, bakery.class);
                context.startActivity(Intent3);
                break;

            case 3:
                Intent Intent4 = new Intent(context, grocery.class);
                context.startActivity(Intent4);
                break;

            case 4:
                Intent Intent5 = new Intent(context, ice_creams.class);
                context.startActivity(Intent5);
                break;

            case 5:
                Intent Intent6 = new Intent(context, meat.class);
                context.startActivity(Intent6);
                break;
        }

    }
}
