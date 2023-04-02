package com.design.paterns.creational.factorymethod.example1.creador;

import com.design.paterns.creational.factorymethod.example1.product.Pedido;
import com.design.paterns.creational.factorymethod.example1.product.PedidoCredito;

public class ClienteCredito extends Cliente{

  @Override
  protected Pedido creaPedido(double importe) {
    return new PedidoCredito(importe);
  }
}