package com.example.harikrishnaa.routin;

import android.widget.ImageView;

public class itemviewmodel {
    ImageView item_icon;
    String itemname;

    public itemviewmodel(ImageView item_icon, String itemname) {
        this.item_icon = item_icon;
        this.itemname = itemname;
    }

    public String getName(){
        return itemname;
    }

    public ImageView getIcon(){
        return item_icon;
    }
}
