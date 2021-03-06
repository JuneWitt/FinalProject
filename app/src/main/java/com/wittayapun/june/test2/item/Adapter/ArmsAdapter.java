package com.wittayapun.june.test2.item.Adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wittayapun.june.test2.R;
import com.wittayapun.june.test2.item.Item;
import com.wittayapun.june.test2.item.SetViewHolder;

import java.util.Collections;
import java.util.List;

public class ArmsAdapter extends RecyclerView.Adapter<SetViewHolder> {
    private Activity activity;
    List<Item> items = Collections.emptyList();

    public ArmsAdapter(Activity activity, List<Item> items) {
        this.activity = activity;
        this.items = items;
    }

    @NonNull
    @Override
    public SetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item_arms, parent, false);
        return new SetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SetViewHolder holder, int position) {
        holder.txt_Exer_Name.setText(items.get(position).getExer_name());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
