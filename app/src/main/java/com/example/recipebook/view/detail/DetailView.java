
package com.example.recipebook.view.detail;

import com.example.recipebook.model.Meals;

public interface DetailView {

    void showLoading();
    void hideLoading();
    void setMeal(Meals.Meal meal);
    void onErrorLoading(String message);

}
