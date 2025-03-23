package com.mendes.appmenuyracema_java.model;

public class Food {
    int ImgFood;
    String FoodName;
    String FoodDescrition;
    String Price;

    public Food(int imgFood, String foodName, String foodDescrition, String price) {
        ImgFood = imgFood;
        FoodName = foodName;
        FoodDescrition = foodDescrition;
        Price = price;
    }

    public int getImgFood() {
        return ImgFood;
    }


    public String getFoodName() {
        return FoodName;
    }



    public String getFoodDescrition() {
        return FoodDescrition;
    }

    public String getPrice() {
        return Price;
    }

}
