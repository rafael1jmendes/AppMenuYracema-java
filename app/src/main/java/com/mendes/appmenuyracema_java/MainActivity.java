package com.mendes.appmenuyracema_java;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mendes.appmenuyracema_java.adapter.FoodAdapter;
import com.mendes.appmenuyracema_java.databinding.ActivityMainBinding;
import com.mendes.appmenuyracema_java.model.Food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FoodAdapter foodAdapter;
    private ArrayList<Food> foodList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewFood = binding.RecyclerViewFood;
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFood.setHasFixedSize(true);
        foodAdapter = new FoodAdapter(foodList, this);
        recyclerViewFood.setAdapter(foodAdapter);

        }
    private void getFood(){
        Food food1 = new Food (
                R.drawable.food1

        )
    }

}