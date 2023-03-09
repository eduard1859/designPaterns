package com.design.paterns.creational.factorymethod.product;

public class PedidoCredito extends Pedido {

    public PedidoCredito(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return importe >= 1000 && importe <= 5000;
    }

    @Override
    public void paga() {
        System.out.println("El pago del pedido a crédito de " + importe + " se ha realizado.");
    }

}