package com.design.paterns.creational.builder.example1;

import com.design.paterns.creational.builder.example1.constructor.DocumentacionVehiculo;
import com.design.paterns.creational.builder.example1.constructor.DocumentacionVehiculoHtml;
import com.design.paterns.creational.builder.example1.constructor.DocumentacionVehiculoPDF;
import com.design.paterns.creational.builder.example1.director.Vendedor;
import com.design.paterns.creational.builder.example1.product.Documentacion;

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