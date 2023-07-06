package com.design.paterns.structural.bridge.example2;

public class main {

  // Implementación de los métodos de cocción
  interface CookingMethod {
    void cook();
  }

  public static class  WoodFiredOven implements CookingMethod {
    @Override
    public void cook() {
      System.out.println("Cocinando la pizza en horno de leña");
    }
  }

  public static class ElectricOven implements CookingMethod {
    @Override
    public void cook() {
      System.out.println("Cocinando la pizza en horno eléctrico");
    }
  }

  // Abstracción para la preparación de la pizza
  public static abstract class Pizza {
    protected CookingMethod cookingMethod;

    public Pizza(CookingMethod cookingMethod) {
      this.cookingMethod = cookingMethod;
    }

    public abstract void prepare();
    public abstract void cookPizza();
  }
  // Implementaciones concretas de las pizzas
  public static class MargaritaPizza extends Pizza {
    public MargaritaPizza(CookingMethod cookingMethod) {
      super(cookingMethod);
    }

    @Override
    public void prepare() {
      System.out.println("Preparando pizza margarita");
    }

    @Override
    public void cookPizza() {
      cookingMethod.cook();
    }
  }

  public static class PepperoniPizza extends Pizza {
    public PepperoniPizza(CookingMethod cookingMethod) {
      super(cookingMethod);
    }

    @Override
    public void prepare() {
      System.out.println("Preparando pizza pepperoni");
    }

    @Override
    public void cookPizza() {
      cookingMethod.cook();
    }
  }

  // Ejemplo de uso
    public static void main(String[] args) {
      // Crear los métodos de cocción
      CookingMethod woodFiredOven = new WoodFiredOven();
      CookingMethod electricOven = new ElectricOven();

      // Preparar y cocinar pizzas utilizando diferentes métodos de cocción
      Pizza margaritaWoodFired = new MargaritaPizza(woodFiredOven);
      margaritaWoodFired.prepare();
      margaritaWoodFired.cookPizza();

      margaritaWoodFired = new MargaritaPizza(electricOven);
      margaritaWoodFired.prepare();
      margaritaWoodFired.cookPizza();

    }
}