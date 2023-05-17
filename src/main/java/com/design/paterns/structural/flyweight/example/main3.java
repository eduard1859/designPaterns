package com.design.paterns.structural.flyweight.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main3 {

  public static class IngredientFactory {
    private Map<String, Ingredient> ingredients = new HashMap<>();

    public Ingredient getIngredient(String name, double cost) {
      Ingredient ingredient = ingredients.get(name);

      if (ingredient == null) {
        ingredient = new Ingredient(name, cost);
        ingredients.put(name, ingredient);
      }

      return ingredient;
    }
  }

  public static class Ingredient {
    private String name;
    private double cost;

    public Ingredient(String name, double cost) {
      this.name = name;
      this.cost = cost;
    }

    public String getName() {
      return name;
    }

    public double getCost() {
      return cost;
    }
  }

  public static class Pizza {
    private List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
      ingredients.add(ingredient);
    }

    public double getPrice() {
      double price = 0.0;

      for (Ingredient ingredient : ingredients) {
        price += ingredient.getCost();
      }

      return price;
    }
  }

    public static void main(String[] args) {
      IngredientFactory ingredientFactory = new IngredientFactory();

      Ingredient cheese = ingredientFactory.getIngredient("cheese", 2.0);
      Ingredient tomatoSauce = ingredientFactory.getIngredient("tomato sauce", 1.0);
      Ingredient pepperoni = ingredientFactory.getIngredient("pepperoni", 3.0);

      Pizza pizza1 = new Pizza();
      pizza1.addIngredient(cheese);
      pizza1.addIngredient(tomatoSauce);
      pizza1.addIngredient(pepperoni);

      Pizza pizza2 = new Pizza();
      pizza2.addIngredient(cheese);
      pizza2.addIngredient(tomatoSauce);

      System.out.println("Pizza 1 price: " + pizza1.getPrice());
      System.out.println("Pizza 2 price: " + pizza2.getPrice());
    }


}