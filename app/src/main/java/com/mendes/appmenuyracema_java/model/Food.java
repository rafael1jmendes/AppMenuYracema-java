package com.mendes.appmenuyracema_java.model;

public class Food {
    int ImgFood;
    String FoodName;

    public Food(int imgFood, String foodName, String foodDescrition, String price) {
        ImgFood = imgFood;
        FoodName = foodName;
        FoodDescrition = foodDescrition;
        Price = price;
    }

    String FoodDescrition;
    String Price;

    public int getImgFood() {
        return ImgFood;
    }

    public void setImgFood(int imgFood) {
        this.ImgFood = imgFood;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        this.FoodName = foodName;
    }

    public String getFoodDescrition() {
        return FoodDescrition;
    }

    public void setFoodDescrition(String foodDescrition) {
        this.FoodDescrition = foodDescrition;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        this.Price = price;
    }
}
