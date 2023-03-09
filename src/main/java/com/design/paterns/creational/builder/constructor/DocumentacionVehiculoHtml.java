package com.design.paterns.creational.builder.constructor;

import com.design.paterns.creational.builder.product.DocumentacionHTML;

public class DocumentacionVehiculoHtml extends  DocumentacionVehiculo{

  public DocumentacionVehiculoHtml() {
    documentacion = new DocumentacionHTML();
  }

  @Override
  public void construyeSolicitudPedido(String nombreCliente) {
    String documento;
    documento = "<HTML>Solicitud de pedido Cliente: " + nombreCliente;
    documentacion.agregaDocumento(documento);
  }

  @Override
  public void construyeSolicitudMatriculacion(String nombreSolicitante) {
    String documento;
    documento = "<HTML>Solicitud de matriculacion Solicitante: " + nombreSolicitante;
    documentacion.agregaDocumento(documento);
  }
}