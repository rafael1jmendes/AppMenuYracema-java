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
        getFood();

        }
    private void getFood(){
        Food food1 = new Food(
                R.drawable.food1,
                "Especial sem prensar",
                "Um pao fofinho com, tomate cebola e milho, 1 ou 2 vinas" +
                        "e muita maionese junto com a nossa farofa de batata com bacon triturado.",
                "21,90" );

        foodList.add(food1);

        Food food2 = new Food(
                R.drawable.food2,
                "Especial sem prensar",
                "Um pao fofinho com, tomate cebola e milho, 1 ou 2 vinas" +
                        "e muita maionese junto com a nossa farofa de batata com bacon triturado.",
                "21,90" );

        foodList.add(food2);

        Food food3 = new Food(
                R.drawable.food3,
                "Especial sem prensar",
                "Um pao fofinho com, tomate cebola e milho, 1 ou 2 vinas" +
                        "e muita maionese junto com a nossa farofa de batata com bacon triturado.",
                "21,90" );

        foodList.add(food3);

        Food food4 = new Food(
                R.drawable.food4,
                "Especial sem prensar",
                "Um pao fofinho com, tomate cebola e milho, 1 ou 2 vinas" +
                        "e muita maionese junto com a nossa farofa de batata com bacon triturado.",
                "21,90" );

        foodList.add(food4);

        Food food5 = new Food(
                R.drawable.food5,
                "Especial sem prensar",
                "Um pao fofinho com, tomate cebola e milho, 1 ou 2 vinas" +
                        "e muita maionese junto com a nossa farofa de batata com bacon triturado.",
                "21,90" );

        foodList.add(food5);
    }

}