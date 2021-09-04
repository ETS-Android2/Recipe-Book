
package com.example.recipebook.api;

import com.example.recipebook.model.Categories;
import com.example.recipebook.model.Meals;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FoodApi {

    @GET("filter.php?a=Indian")
    Call<Meals> getMeal();

    @GET("categories.php")
    Call<Categories> getCategories();

    @GET("filter.php") 
    Call<Meals> getMealByCategory(@Query("c") String category);

    @GET("search.php")
  Call<Meals> getMealByName(@Query("s") String mealName);
}



