package com.example.harikrishnaa.routin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class store extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Bitmap bm[] = {BitmapFactory.decodeResource(getResources(), R.drawable.mm1),
                BitmapFactory.decodeResource(getResources(), R.drawable.b1),
                BitmapFactory.decodeResource(getResources(), R.drawable.bb1),
                BitmapFactory.decodeResource(getResources(), R.drawable.g1),
                BitmapFactory.decodeResource(getResources(), R.drawable.i1),
                BitmapFactory.decodeResource(getResources(), R.drawable.m1),
        };
        ArrayList<itemviewmodel>namelist = new ArrayList<>();
        namelist.add(new itemviewmodel("Dairy"));
        namelist.add(new itemviewmodel("Beverages"));
        namelist.add(new itemviewmodel("Bakery"));
        namelist.add(new itemviewmodel("Grocerry"));
        namelist.add(new itemviewmodel("Ice Cream"));
        namelist.add(new itemviewmodel("meat"));

        ArrayList<itemviewmodel>iconlist = new ArrayList<>();
        iconlist.add(new itemviewmodel(bm[0]));
        iconlist.add(new itemviewmodel(bm[1]));
        iconlist.add(new itemviewmodel(bm[2]));
        iconlist.add(new itemviewmodel(bm[3]));
        iconlist.add(new itemviewmodel(bm[4]));
        iconlist.add(new itemviewmodel(bm[5]));


        itemadapter adapter = new itemadapter(namelist, iconlist, getContext());
        RecyclerView list = new RecyclerView(getContext());
        list.setLayoutManager(new LinearLayoutManager(getContext()));
        list.setAdapter(adapter);
        // Inflate the layout for this fragment
        return list;
    }

}