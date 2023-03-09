package com.design.paterns.creational.builder.constructor;

import com.design.paterns.creational.builder.product.Documentacion;

public  abstract class DocumentacionVehiculo {

    protected Documentacion documentacion;

    public  abstract  void  construyeSolicitudPedido( String  nombreCliente);
    public  abstract  void  construyeSolicitudMatriculacion( String  nombreSolicitante);

    public  Documentacion resultado() {
      return  documentacion;
    }

}