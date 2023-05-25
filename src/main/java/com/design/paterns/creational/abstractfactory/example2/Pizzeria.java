package com.design.paterns.creational.abstractfactory.example2;

// Supongamos que tienes una pizzería y deseas implementar un sistema para crear
// diferentes tipos de pizzas y postres utilizando el patrón Abstract Factory.
public class Pizzeria {
  // Interfaz Pizza
  public interface Pizza {
    void preparar();
    void hornear();
    void cortar();
    void empaquetar();
  }

  // Implementaciones concretas de Pizza
  public static class PizzaMargherita implements Pizza {
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

  public static class PizzaPepperoni implements Pizza {
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
  // Interfaz Postre
  public interface Postre {
    void preparar();
    void decorar();
  }

  // Implementaciones concretas de Postre
  public static class Tiramisu implements Postre {
    @Override
    public void preparar() {
      System.out.println("Preparando Tiramisú");
    }

    @Override
    public void decorar() {
      System.out.println("Decorando Tiramisú");
    }
  }

  public  static class Cheesecake implements Postre {
    @Override
    public void preparar() {
      System.out.println("Preparando Cheesecake");
    }

    @Override
    public void decorar() {
      System.out.println("Decorando Cheesecake");
    }
  }

  // Interfaz Abstract Factory
  public interface PizzeriaFactory {
    Pizza crearPizza();
    Postre crearPostre();
  }

  // Implementaciones concretas de Abstract Factory
  public static class PizzeriaItalianaFactory implements PizzeriaFactory {
    @Override
    public Pizza crearPizza() {
      return new PizzaMargherita();
    }

    @Override
    public Postre crearPostre() {
      return new Tiramisu();
    }
  }

  public  static class PizzeriaAmericanaFactory implements PizzeriaFactory {
    @Override
    public Pizza crearPizza() {
      return new PizzaPepperoni();
    }

    @Override
    public Postre crearPostre() {
      return new Cheesecake();
    }
  }

  // Uso del patrón Abstract Factory en la pizzería

    public static void main(String[] args) {
      PizzeriaFactory italianaFactory = new PizzeriaItalianaFactory();
      Pizza pizzaMargherita = italianaFactory.crearPizza();
      Postre tiramisu = italianaFactory.crearPostre();

      pizzaMargherita.preparar();
      pizzaMargherita.hornear();
      pizzaMargherita.cortar();
      pizzaMargherita.empaquetar();

      tiramisu.preparar();
      tiramisu.decorar();

      PizzeriaFactory americanaFactory = new PizzeriaAmericanaFactory();
      Pizza pizzaPepperoni = americanaFactory.crearPizza();
      Postre cheesecake = americanaFactory.crearPostre();

      pizzaPepperoni.preparar();
      pizzaPepperoni.hornear();
      pizzaPepperoni.cortar();
      pizzaPepperoni.empaquetar();

      cheesecake.preparar();
      cheesecake.decorar();
    }
}