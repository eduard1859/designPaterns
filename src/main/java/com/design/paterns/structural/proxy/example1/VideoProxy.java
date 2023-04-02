package com.design.paterns.structural.proxy.example1;

public class VideoProxy implements Animacion {

  protected Video video = null;
  protected String foto = "Mostar foto";

  public void dibuja() {
    if(video != null) {
      video.dibuja();
    } else {
      System.out.println(foto);
    }
  }

  public void clic() {
    if(video== null) {
      video = new Video();
      video.carga();
    }
    video.reproduce();
  }

}