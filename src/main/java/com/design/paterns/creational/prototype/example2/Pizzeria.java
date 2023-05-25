package com.design.paterns.creational.prototype.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizzeria {
  // Clase abstracta Pizza que implementa la interfaz Cloneable
  public static abstract class Pizza implements Cloneable {
    private String masa;
    private String salsa;
    private List<String> ingredientes;

    public Pizza(String masa, String salsa, List<String> ingredientes) {
      this.masa = masa;
      this.salsa = salsa;
      this.ingredientes = ingredientes;
    }

    // Métodos abstractos que deben ser implementados por las clases concretas
    public abstract Pizza clonar();

    public abstract void mostrarPizza();

    // Getters y setters para los atributos

    public String getMasa() {
      return masa;
    }

    public void setMasa(String masa) {
      this.masa = masa;
    }

    public String getSalsa() {
      return salsa;
    }

    public void setSalsa(String salsa) {
      this.salsa = salsa;
    }

    public List<String> getIngredientes() {
      return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
      this.ingredientes = ingredientes;
    }

  }


  // Clase concreta PizzaMargherita que extiende de Pizza
  public static class PizzaMargherita extends Pizza {
    public PizzaMargherita(String masa, String salsa, List<String> ingredientes) {
      super(masa, salsa, ingredientes);
    }

    // Implementación del método clonar para la Pizza Margherita
    @Override
    public Pizza clonar() {
      List<String> ingredientesClonados = new ArrayList<>(getIngredientes());
      return new PizzaMargherita(getMasa(), getSalsa(), ingredientesClonados);
    }

    // Implementación del método mostrarPizza para la Pizza Margherita
    @Override
    public void mostrarPizza() {
      System.out.println("Pizza Margherita: Masa " + getMasa() + ", Salsa " + getSalsa() +
          ", Ingredientes " + getIngredientes());
    }
  }

  // Uso del patrón Prototype en la pizzería
    public static void main(String[] args) {
      // Crear una pizza original
      List<String> ingredientesOriginales = Arrays.asList("Tomate", "Queso", "Albahaca");
      PizzaMargherita original = new PizzaMargherita("Delgada", "Tomate", ingredientesOriginales);

      // Clonar la pizza original
      PizzaMargherita clon = (PizzaMargherita) original.clonar();

      // Modificar la pizza clonada
      clon.setMasa("Gruesa");
      clon.getIngredientes().add("Aceitunas");

      // Mostrar las pizzas original y clonada
      original.mostrarPizza();
      clon.mostrarPizza();
    }

}