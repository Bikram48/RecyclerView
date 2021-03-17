package com.project.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.io.File;
import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView recipeIngredient;
    private TextView recipeProcedure;
    ArrayList<Foods> foodsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView=findViewById(R.id.imageView);
        recipeIngredient=findViewById(R.id.ingredientTxt);
        recipeProcedure=findViewById(R.id.procedureTxt);
        foodsList=FoodRecipeData.foodList;
        loadData();

    }

    private void loadData() {
        Intent intent=getIntent();
        int position=intent.getIntExtra("pos",0);
        recipeIngredient.setText(foodsList.get(position).getIngredients());
        recipeProcedure.setText(foodsList.get(position).getProcedure());
        String image=foodsList.get(position).getImage().toString();
        imageView.setImageDrawable(getImage(this,image));
    }

    public Drawable getImage(Context context, String name) {
        return context.getResources().getDrawable(context.getResources().getIdentifier(name, "drawable", context.getPackageName()));
    }
}