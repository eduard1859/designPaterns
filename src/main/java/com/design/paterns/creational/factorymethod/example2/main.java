package com.design.paterns.creational.factorymethod.example2;

/*

 */
public class main {

  // Clase abstracta Pizza
  public abstract static class Pizza {
    public abstract void preparar();
    public abstract void hornear();
    public abstract void cortar();
    public abstract void empaquetar();
  }

  // Clases concretas de pizzas
  public static class PizzaMargherita extends Pizza {
    @Override
    public void preparar() {
      System.out.println("Preparando pizza Margherita");
    }

    @Override
    public void hornear() {
      System.out.println("Horneando pizza Margherita");
    }

    @Override
    public void cortar() {
      System.out.println("Cortando pizza Margherita");
    }

    @Override
    public void empaquetar() {
      System.out.println("Empaquetando pizza Margherita");
    }
  }

  public static class PizzaPepperoni extends Pizza {
    @Override
    public void preparar() {
      System.out.println("Preparando pizza Pepperoni");
    }

    @Override
    public void hornear() {
      System.out.println("Horneando pizza Pepperoni");
    }

    @Override
    public void cortar() {
      System.out.println("Cortando pizza Pepperoni");
    }

    @Override
    public void empaquetar() {
      System.out.println("Empaquetando pizza Pepperoni");
    }
  }

  // Interfaz PizzaFactory
  public interface PizzaFactory {
    Pizza crearPizza();
  }

  // Implementaciones concretas de la PizzaFactory
  public static class PizzaMargheritaFactory implements PizzaFactory {
    @Override
    public Pizza crearPizza() {
      return new PizzaMargherita();
    }
  }

  public static class PizzaPepperoniFactory implements PizzaFactory {
    @Override
    public Pizza crearPizza() {
      return new PizzaPepperoni();
    }
  }

  // Uso del patrón Factory Method en la pizzería
    public static void main(String[] args) {
      PizzaFactory margheritaFactory = new PizzaMargheritaFactory();
      Pizza margherita = margheritaFactory.crearPizza();
      margherita.preparar();
      margherita.hornear();
      margherita.cortar();
      margherita.empaquetar();

      PizzaFactory pepperoniFactory = new PizzaPepperoniFactory();
      Pizza pepperoni = pepperoniFactory.crearPizza();
      pepperoni.preparar();
      pepperoni.hornear();
      pepperoni.cortar();
      pepperoni.empaquetar();

  }


}