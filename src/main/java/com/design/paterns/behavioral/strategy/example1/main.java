package com.design.paterns.behavioral.strategy.example1;

public class main {
  // Interfaz para la estrategia de precios
  public interface PrecioStrategy {
    double calcularPrecio(double precioBase);
  }

  // Implementaciones concretas de las estrategias de precios
  public static class PrecioRegularStrategy implements PrecioStrategy {
    @Override
    public double calcularPrecio(double precioBase) {
      return precioBase;
    }
  }

  public static class PrecioDescuentoStrategy implements PrecioStrategy {
    private double porcentajeDescuento;

    public PrecioDescuentoStrategy(double porcentajeDescuento) {
      this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularPrecio(double precioBase) {
      return precioBase - (precioBase * porcentajeDescuento);
    }
  }

  public static class PrecioPromocionStrategy implements PrecioStrategy {
    private double precioPromocional;

    public PrecioPromocionStrategy(double precioPromocional) {
      this.precioPromocional = precioPromocional;
    }

    @Override
    public double calcularPrecio(double precioBase) {
      return precioPromocional;
    }
  }

  // Clase Pizza que utiliza la estrategia de precios
  public static class Pizza {
    private String nombre;
    private double precioBase;
    private PrecioStrategy precioStrategy;

    public Pizza(String nombre, double precioBase, PrecioStrategy precioStrategy) {
      this.nombre = nombre;
      this.precioBase = precioBase;
      this.precioStrategy = precioStrategy;
    }

    public double calcularPrecio() {
      return precioStrategy.calcularPrecio(precioBase);
    }

    // Getters y setters para los atributos
    // ...
  }

  // Uso del patrón Strategy en la pizzería
    public static void main(String[] args) {
      Pizza pizzaRegular = new Pizza("Margherita", 10.0, new PrecioRegularStrategy());
      Pizza pizzaDescuento = new Pizza("Pepperoni", 12.0, new PrecioDescuentoStrategy(0.15));
      Pizza pizzaPromocion = new Pizza("Hawaiana", 11.0, new PrecioPromocionStrategy(8.5));

      System.out.println("Precio de la pizza regular: " + pizzaRegular.calcularPrecio());
      System.out.println("Precio de la pizza con descuento: " + pizzaDescuento.calcularPrecio());
      System.out.println("Precio de la pizza en promoción: " + pizzaPromocion.calcularPrecio());
    }

}