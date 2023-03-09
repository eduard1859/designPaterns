package com.design.paterns.creational.factorymethod.creador;

import com.design.paterns.creational.factorymethod.product.Pedido;
import com.design.paterns.creational.factorymethod.product.PedidoCredito;

public class ClienteCredito extends Cliente{

  @Override
  protected Pedido creaPedido(double importe) {
    return new PedidoCredito(importe);
  }
}