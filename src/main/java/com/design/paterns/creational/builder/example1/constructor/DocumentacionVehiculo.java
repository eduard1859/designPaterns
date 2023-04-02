package com.design.paterns.creational.builder.example1.constructor;

import com.design.paterns.creational.builder.example1.product.Documentacion;

public  abstract class DocumentacionVehiculo {

    protected Documentacion documentacion;

    public  abstract  void  construyeSolicitudPedido( String  nombreCliente);
    public  abstract  void  construyeSolicitudMatriculacion( String  nombreSolicitante);

    public  Documentacion resultado() {
      return  documentacion;
    }

}