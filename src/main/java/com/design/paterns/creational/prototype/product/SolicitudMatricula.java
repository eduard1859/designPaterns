package com.design.paterns.creational.prototype.product;

public class SolicitudMatricula  extends Document{

  @Override
  public void imprime() {
    System.out.println("Imprime la solicitud de matricula: " + contenido);
  }

  @Override
  public void visualiza() {
    System.out.println("Muestra la solicitud de matricula: " + contenido);
  }
}