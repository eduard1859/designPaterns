package com.design.paterns.structural.proxy.example1;

import com.design.paterns.structural.proxy.example1.Animacion;

public class Video implements Animacion {

  public void dibuja() {
    System.out.println("Mostrar el video");
  }

  public void clic() {

  }
  public  void carga() {
    System.out.println("Carga el video");
  }
  public  void reproduce() {
    System.out.println("Reproduce el video");
  }

}