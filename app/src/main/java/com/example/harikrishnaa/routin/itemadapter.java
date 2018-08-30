package com.example.harikrishnaa.routin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;

public class itemadapter extends RecyclerView.Adapter {
    private ArrayList<itemviewmodel>names = new ArrayList<>();
    private ArrayList<itemviewmodel>icons = new ArrayList<>();
    private Context context;

    public itemadapter(ArrayList<itemviewmodel> names, ArrayList<itemviewmodel> icons, Context context) {
        this.names = names;
        this.icons = icons;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new itemviewholder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((itemviewholder)holder).bindNamesData(names.get(position));
        ((itemviewholder) holder).bindIconsData(icons.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    @Override
    public int getItemViewType(final int position){
        return R.layout.item;
    }
}