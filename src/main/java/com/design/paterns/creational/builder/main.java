package com.design.paterns.creational.builder;

import com.design.paterns.creational.builder.constructor.DocumentacionVehiculo;
import com.design.paterns.creational.builder.constructor.DocumentacionVehiculoHtml;
import com.design.paterns.creational.builder.constructor.DocumentacionVehiculoPDF;
import com.design.paterns.creational.builder.director.Vendedor;
import com.design.paterns.creational.builder.product.Documentacion;

public class main {

    public static void main(String[] args) {
      // TODO Auto-generated method stub
        DocumentacionVehiculo documentacionVehiculoPdf = new DocumentacionVehiculoPDF();
        Vendedor vendedor = new Vendedor(documentacionVehiculoPdf);
        Documentacion documentacion = vendedor.construye("Juan Perez");
        documentacion.imprime();

        DocumentacionVehiculo documentacionVehiculoHtml = new DocumentacionVehiculoHtml();
        vendedor = new Vendedor(documentacionVehiculoHtml);
        documentacion = vendedor.construye("Juan Perez");
        documentacion.imprime();
    }
}