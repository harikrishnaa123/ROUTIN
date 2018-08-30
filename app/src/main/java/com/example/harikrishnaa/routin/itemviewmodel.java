package com.example.harikrishnaa.routin;

import android.graphics.Bitmap;

public class itemviewmodel {
    Bitmap item_icon;
    String itemname;

    public itemviewmodel(String itemname) {
        this.itemname = itemname;
    }

    public itemviewmodel(Bitmap item_icon){
        this.item_icon = item_icon;
    }

    public String getName(){
        return itemname;
    }

    public Bitmap getIcon(){
        return item_icon;
    }
}