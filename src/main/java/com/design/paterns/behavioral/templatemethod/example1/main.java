package com.design.paterns.behavioral.templatemethod.example1;

public class main {
  public static abstract class Pizza {
    public final void prepararPizza() {
      prepararMasa();
      agregarSalsaTomate();
      agregarIngredientes();
      hornearPizza();
      empaquetarPizza();
    }

    protected abstract void agregarIngredientes();

    protected void prepararMasa() {
      System.out.println("Preparando la masa de la pizza");
    }

    protected void agregarSalsaTomate() {
      System.out.println("Agregando salsa de tomate a la pizza");
    }

    protected void hornearPizza() {
      System.out.println("Horneando la pizza");
    }

    protected void empaquetarPizza() {
      System.out.println("Empaquetando la pizza");
    }
  }

  public static class PizzaMargherita extends Pizza {
    @Override
    protected void agregarIngredientes() {
      System.out.println("Agregando queso, tomate y albahaca a la pizza Margherita");
    }
  }

  public static class PizzaPepperoni extends Pizza {
    @Override
    protected void agregarIngredientes() {
      System.out.println("Agregando queso y pepperoni a la pizza Pepperoni");
    }
  }

  public static class PizzaHawaiana extends Pizza {
    @Override
    protected void agregarIngredientes() {
      System.out.println("Agregando queso, piña y jamón a la pizza Hawaiana");
    }

    @Override
    protected void hornearPizza() {
      System.out.println("Horneando la pizza Hawaiana por más tiempo");
    }
  }

    public static void main(String[] args) {
      Pizza pizzaMargherita = new PizzaMargherita();
      Pizza pizzaPepperoni = new PizzaPepperoni();
      Pizza pizzaHawaiana = new PizzaHawaiana();

      System.out.println("Preparando la pizza Margherita:");
      pizzaMargherita.prepararPizza();

      System.out.println("\nPreparando la pizza Pepperoni:");
      pizzaPepperoni.prepararPizza();

      System.out.println("\nPreparando la pizza Hawaiana:");
      pizzaHawaiana.prepararPizza();
    }

}