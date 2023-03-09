package com.design.paterns.creational.builder.constructor;

import com.design.paterns.creational.builder.product.DocumentacionPDF;

public class DocumentacionVehiculoPDF  extends DocumentacionVehiculo{

  public DocumentacionVehiculoPDF() {
    documentacion = new DocumentacionPDF();
  }

  @Override
  public void construyeSolicitudPedido(String nombreCliente) {
    String documento;
    documento = "<PDF>Solicitud de pedido Cliente: " + nombreCliente;
    documentacion.agregaDocumento(documento);
  }

  @Override
  public void construyeSolicitudMatriculacion(String nombreSolicitante) {
    String documento;
    documento = "<PDF>Solicitud de matriculacion Solicitante: " + nombreSolicitante;
    documentacion.agregaDocumento(documento);
  }
}