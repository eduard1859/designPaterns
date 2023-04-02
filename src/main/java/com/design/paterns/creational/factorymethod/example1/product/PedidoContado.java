package com.design.paterns.creational.factorymethod.example1.product;

public class PedidoContado extends Pedido {

  public PedidoContado(double importe) {
    super(importe);
  }

  @Override
  public boolean valida() {
    return true;
  }

  @Override
  public void paga() {
    System.out.println("El pago del pedido a contado se ha realizado");
  }

}