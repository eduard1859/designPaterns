package com.design.paterns.creational.prototype.example1;

import com.design.paterns.creational.prototype.example1.client.DocumentacionBlanco;
import com.design.paterns.creational.prototype.example1.client.DocumentacionClient;
import com.design.paterns.creational.prototype.example1.product.OrdenPedido;
import com.design.paterns.creational.prototype.example1.product.SolicitudMatricula;

public class main {

    public static void main(String[] args) {
      // TODO Auto-generated method stub
        DocumentacionBlanco documentacionBlanco = DocumentacionBlanco.instancia();
        documentacionBlanco.incluye(new OrdenPedido());
        documentacionBlanco.incluye(new SolicitudMatricula());

        DocumentacionClient documentacionCliente1 = new DocumentacionClient("Martin");
        documentacionCliente1.visualiza();
        documentacionCliente1.imprime();

        DocumentacionClient documentacionCliente2 = new DocumentacionClient("Juan");
        documentacionCliente2.visualiza();
        documentacionCliente2.imprime();
    }
}