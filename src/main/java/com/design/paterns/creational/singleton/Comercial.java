package com.design.paterns.creational.singleton;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Comercial {

  protected String nombre;
  protected String direccion;
  protected String email;

  private static Comercial comercial = null;

  private Comercial() {}

  public static Comercial instancia() {
    if (comercial == null) {
      comercial = new Comercial();
    }
    return comercial;
  }
  public void visualiza() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Dirección: " + direccion);
    System.out.println("Email: " + email);
  }


}