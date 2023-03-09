package com.design.paterns.creational.prototype;

import com.design.paterns.creational.prototype.client.Documentacion;
import com.design.paterns.creational.prototype.client.DocumentacionBlanco;
import com.design.paterns.creational.prototype.client.DocumentacionClient;
import com.design.paterns.creational.prototype.product.OrdenPedido;
import com.design.paterns.creational.prototype.product.SolicitudMatricula;

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