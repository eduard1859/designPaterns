package com.design.paterns.behavioral.memento.example2;

import java.util.ArrayList;
import java.util.List;

public class main {

  public static class Pizza{

    private String descripcion;
    private String masa;
    private String salsa;
    private String queso;
    private String relleno;

    public Pizza(String descripcion, String masa, String salsa, String queso, String relleno) {
      this.descripcion = descripcion;
      this.masa = masa;
      this.salsa = salsa;
      this.queso = queso;
      this.relleno = relleno;
    }

    public PizzaMemento crearPizzaMemento() {
        return new PizzaMemento(this);
    }

    public void restaurar(PizzaMemento memento) {
        Pizza pizza = memento.getPizza();
        this.descripcion = pizza.descripcion;
        this.masa = pizza.masa;
        this.salsa = pizza.salsa;
        this.queso = pizza.queso;
        this.relleno = pizza.relleno;
    }
  }

  public static class PizzaMemento{

      private String descripcion;
      private String masa;
      private String salsa;
      private String queso;
      private String relleno;

      public  PizzaMemento(Pizza pizza) {
        this.descripcion = pizza.descripcion;
        this.masa = pizza.masa;
        this.salsa = pizza.salsa;
        this.queso = pizza.queso;
        this.relleno = pizza.relleno;
      }

      public Pizza getPizza() {
        return new Pizza(descripcion, masa, salsa, queso, relleno);
      }

  }

  public static class PizzaHistorial {

    private List<PizzaMemento> estados = new ArrayList<>();

    public void agregarMemento(PizzaMemento memento) {
      estados.add(memento);
    }

    public PizzaMemento getEstadoAnterior() {
      if(estados.size()>1) {
        PizzaMemento estadoAnterior = estados.get(estados.size()-2);
        estados.remove(estados.size()-1);
        return estadoAnterior;
      } else {
        throw new RuntimeException("No hay estados anteriores");
      }
    }
  }
  public static void main(String[] args) {
      Pizza pizza = new Pizza("Pizza de Peperoni", "Masa delgada", "Salsa de tomate", "Queso mozzarella", "Peperoni");
      PizzaHistorial historial = new PizzaHistorial();
      historial.agregarMemento(pizza.crearPizzaMemento());
      System.out.println(pizza.descripcion);
      pizza.descripcion = "Pizza de Peperoni con extra queso";
      historial.agregarMemento(pizza.crearPizzaMemento());
      System.out.println(pizza.descripcion);
      pizza.descripcion = "Pizza de Peperoni con extra queso y extra peperoni";
      historial.agregarMemento(pizza.crearPizzaMemento());
      System.out.println(pizza.descripcion);
      pizza.restaurar(historial.getEstadoAnterior());
      System.out.println(pizza.descripcion);
      pizza.restaurar(historial.getEstadoAnterior());
      System.out.println(pizza.descripcion);
  }
}