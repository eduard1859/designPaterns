package com.design.paterns.structural.decorator.example3;

public class main {

  public static abstract class   Pizza {

     protected double precio;
     public abstract void getPrecioTotal();
  }
  public static class PizzaBase extends Pizza {

      public PizzaBase() {
        precio = 5.0;
      }

      @Override
      public void getPrecioTotal() {
        System.out.println("Precio total: " + precio);
      }
  }

  public static abstract class PizzaDecorator extends Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
      this.pizza = pizza;
    }

    public abstract void getPrecioTotal();
  }

  public static class PizzaConQueso extends PizzaDecorator {

    public PizzaConQueso(Pizza pizza) {
      super(pizza);
    }

    @Override
    public void getPrecioTotal() {
      precio = pizza.precio+1.0;
      System.out.println("Precio total: " + (precio));
    }
  }

  public static class PizzaConMasaFina extends PizzaDecorator {

    public PizzaConMasaFina(Pizza pizza) {
      super(pizza);
    }

    @Override
    public void getPrecioTotal() {
      precio = pizza.precio+5.0;
      System.out.println("Precio total: " + (precio));
    }
  }

  public static class PizzaConPeperoni extends PizzaDecorator {

    public PizzaConPeperoni(Pizza pizza) {
      super(pizza);
    }

    @Override
    public void getPrecioTotal() {
      precio = pizza.precio+2.0;
      System.out.println("Precio total: " + (precio));
    }
  }
  public static void main(String[] args) {

    Pizza pizza = new PizzaBase();
    System.out.println("Precio base");
    pizza.getPrecioTotal();
    System.out.println("Agregando queso");
    pizza = new PizzaConQueso(pizza);
    pizza.getPrecioTotal();
    System.out.println("Agregando peperoni");
    pizza = new PizzaConPeperoni(pizza);
    pizza.getPrecioTotal();
    System.out.println("Agregando masa fina");
    pizza = new PizzaConMasaFina(pizza);
    pizza.getPrecioTotal();

  }

}