package com.design.paterns.creational.factorymethod.creador;

import com.design.paterns.creational.factorymethod.product.Pedido;
import com.design.paterns.creational.factorymethod.product.PedidoContado;

public class ClienteContado extends Cliente{

  @Override
  protected Pedido creaPedido(double importe) {
    return new PedidoContado(importe);
  }
}