package com.design.paterns.creational.factorymethod.example1.creador;

import com.design.paterns.creational.factorymethod.example1.product.Pedido;
import com.design.paterns.creational.factorymethod.example1.product.PedidoContado;

public class ClienteContado extends Cliente{

  @Override
  protected Pedido creaPedido(double importe) {
    return new PedidoContado(importe);
  }
}