package com.project.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private  ArrayList<Foods> foodsList;
    private RecyclerView mRecyclerView;
    private FoodListAdapter mAdapter;
    private MenuItem resetMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foodsList=FoodRecipeData.foodList;
        mRecyclerView=findViewById(R.id.recyclerview);
        mAdapter=new FoodListAdapter(this, foodsList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}