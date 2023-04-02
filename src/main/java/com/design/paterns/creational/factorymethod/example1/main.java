package com.design.paterns.creational.factorymethod.example1;

import com.design.paterns.creational.factorymethod.example1.creador.Cliente;
import com.design.paterns.creational.factorymethod.example1.creador.ClienteContado;
import com.design.paterns.creational.factorymethod.example1.creador.ClienteCredito;

public class main {

    public static void main(String[] args) {
      // TODO Auto-generated method stub
        Cliente cliente = new ClienteContado();
        cliente.nuevoPedido(1000);
        cliente.nuevoPedido(2000);

        cliente = new ClienteCredito();
        cliente.nuevoPedido(1000);
    }
}