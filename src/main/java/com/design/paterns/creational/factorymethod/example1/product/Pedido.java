package com.design.paterns.creational.factorymethod.example1.product;

public abstract class Pedido {

    protected double importe;

    public Pedido(double importe) {
      this.importe = importe;
    }

    public abstract boolean valida();

    public abstract void paga();
}