package com.design.paterns.creational.factorymethod.creador;

import com.design.paterns.creational.factorymethod.product.Pedido;
import java.util.ArrayList;
import java.util.List;

public  abstract  class Cliente {

    protected List<Pedido> pedidos = new ArrayList<>();
    protected  abstract Pedido creaPedido(double importe);
    public  void  nuevoPedido(double importe) {
        Pedido pedido = this.creaPedido(importe);
        if (pedido.valida()) {
            System.out.println("Pedido validado");
            pedido.paga();
        }
    }
}