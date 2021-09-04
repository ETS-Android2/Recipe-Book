package com.example.recipebook.view.home;

import com.example.recipebook.model.Categories;
import com.example.recipebook.model.Meals;

import java.util.List;

public interface HomeView {
    void showLoading();
    void hideLoading();
    void ShowRefresh();
    void HideRefresh();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
