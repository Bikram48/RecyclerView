package com.project.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.ViewHolder> {
    private final ArrayList<Foods> foodsList;
    private LayoutInflater mInflater;
    Context context;
    public FoodListAdapter(Context context, ArrayList<Foods> foodsList) {
        this.context=context;
        mInflater = LayoutInflater.from(context);
        this.foodsList = foodsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.foodlist_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.recipeTitle.setText(foodsList.get(position).getName());
        holder.recipeDescription.setText(foodsList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return foodsList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
       TextView recipeTitle;
       TextView recipeDescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recipeTitle=itemView.findViewById(R.id.food_title);
            recipeDescription=itemView.findViewById(R.id.food_description);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position=getLayoutPosition();
            Intent intent=new Intent(context,SecondActivity.class);
            intent.putExtra("pos",position);
            context.startActivity(intent);
        }
    }
}
