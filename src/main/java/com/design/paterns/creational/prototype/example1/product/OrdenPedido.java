package com.design.paterns.creational.prototype.example1.product;

public class OrdenPedido extends Document{

  @Override
  public void imprime() {
    System.out.println("Imprime la orden de pedido: " + contenido);
  }

  @Override
  public void visualiza() {
    System.out.println("Muestra la orden de pedido: " + contenido);
  }
}