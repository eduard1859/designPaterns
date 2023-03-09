package com.design.paterns.structural.proxy;

public class main {

      public static void main(String[] args) {
          Animacion animacion = new VideoProxy();
          animacion.dibuja();
          animacion.clic();
          animacion.dibuja();
      }
}