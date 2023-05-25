package com.design.paterns.creational.builder.example2;

public class Pizzeria {
  // Clase Pizza que se va a construir
  public static class Pizza {
    private String masa;
    private String salsa;
    private String topping;

    public Pizza() {
      // Constructor de la pizza
    }

    // Setters para los ingredientes de la pizza
    public void setMasa(String masa) {
      this.masa = masa;
    }

    public void setSalsa(String salsa) {
      this.salsa = salsa;
    }

    public void setTopping(String topping) {
      this.topping = topping;
    }

    // Método para mostrar la pizza
    public void mostrarPizza() {
      System.out.println("Pizza: Masa " + masa + ", Salsa " + salsa + ", Topping " + topping);
    }
  }




  // Builder para construir la pizza paso a paso
  public static class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
      pizza = new Pizza();
    }

    public PizzaBuilder setMasa(String masa) {
      pizza.setMasa(masa);
      return this;
    }

    public PizzaBuilder setSalsa(String salsa) {
      pizza.setSalsa(salsa);
      return this;
    }

    public PizzaBuilder setTopping(String topping) {
      pizza.setTopping(topping);
      return this;
    }

    public Pizza build() {
      return pizza;
    }
  }

  // Uso del patrón Builder en la pizzería
    public static void main(String[] args) {
      PizzaBuilder builder = new PizzaBuilder();

      // Crear una pizza Margarita
      Pizza margarita = builder.setMasa("Delgada")
          .setSalsa("Tomate")
          .setTopping("Queso Mozzarella")
          .build();
      margarita.mostrarPizza();

      // Crear una pizza Pepperoni
      Pizza pepperoni = builder.setMasa("Gruesa")
          .setSalsa("Tomate")
          .setTopping("Pepperoni")
          .build();
      pepperoni.mostrarPizza();
    }

}