package com.design.paterns.structural.decorator.example2;



public class main {

  public interface Producto {

    String getNombre();

    double getPrecio();

  }

  public static class ProductoBasico implements Producto {

    private String nombre;
    private double precio;

    public ProductoBasico(String nombre, double precio) {
      this.nombre = nombre;
      this.precio = precio;
    }

    public String getNombre() {
      return nombre;
    }

    public double getPrecio() {
      return precio;
    }

  }

  public static abstract class ProductoDecorador implements Producto {

    protected Producto producto;

    public ProductoDecorador(Producto producto) {
      this.producto = producto;
    }

    public String getNombre() {
      return producto.getNombre();
    }

    public double getPrecio() {
      return producto.getPrecio();
    }

  }

  public static class ProductoConEnvio extends ProductoDecorador {

    public ProductoConEnvio(Producto producto) {
      super(producto);
    }

    public double getPrecio() {
      return producto.getPrecio() + 5.0;
    }

  }

  public static class ProductoConGarantia extends ProductoDecorador {

    public ProductoConGarantia(Producto producto) {
      super(producto);
    }

    public double getPrecio() {
      return producto.getPrecio() + 10.0;
    }

  }

  public static class ProductoConDescuento extends ProductoDecorador {

    public ProductoConDescuento(Producto producto) {
      super(producto);
    }

    public double getPrecio() {
      return producto.getPrecio() * 0.9;
    }

  }

  public static void main(String[] args) {
    Producto producto = new ProductoBasico("Producto 1", 100.0);
    System.out.println("Producto: " + producto.getNombre() + " Precio: " + producto.getPrecio());
    //producto = new ProductoConEnvio(producto);
    //System.out.println("Producto: " + producto.getNombre() + " Precio: " + producto.getPrecio());
    //producto = new ProductoConGarantia(producto);
    //System.out.println("Producto: " + producto.getNombre() + " Precio: " + producto.getPrecio());
    producto = new ProductoConDescuento(producto);
    System.out.println("Producto: " + producto.getNombre() + " Precio: " + producto.getPrecio());
  }

}