package com.design.paterns.structural.flyweight.example;

import java.util.HashMap;

public class main2 {

/*
Supongamos que eres un desarrollador de un juego de estrategia y necesitas implementar el patrón Flyweight para optimizar el uso de memoria en tu juego.

  Tu juego tiene muchas unidades militares como soldados, arqueros, caballería, entre otros.
   Cada unidad tiene una imagen, una posición en el mapa y estadísticas como la vida y el ataque.
    Además, hay muchas unidades idénticas en el juego. Por lo tanto, quieres usar el patrón Flyweight
    para evitar crear objetos duplicados y ahorrar memoria.
 */

  public  static abstract class UnidadMilitar {
      protected String imagen;
      protected Integer posicionX;
      protected Integer posicionY;

      protected Integer vida;
      protected Integer ataque;

       UnidadMilitar(String imagen, Integer posicionX,
          Integer posicionY,Integer vida,Integer ataque) {
        this.imagen = imagen;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.vida = vida;
        this.ataque = ataque;
      }
      public abstract void setVida(Integer vida);
       public abstract void setAtaque(Integer ataque);
        public abstract void setPosicion(Integer posicionX,Integer posicionY);

        public  abstract void mostrarInformacion();
  }
  public static class Soldado extends UnidadMilitar {

    public Soldado(String imagen, Integer posicionX,
        Integer posicionY,Integer vida,Integer ataque) {
      super(imagen, posicionX, posicionY, vida, ataque);
    }

    @Override
    public void setVida(Integer vida) {
      this.vida = vida;
    }

    @Override
    public void setAtaque(Integer ataque) {
      this.ataque = ataque;
    }

    @Override
    public void setPosicion(Integer posicionX, Integer posicionY) {
      this.posicionX = posicionX;
      this.posicionY = posicionY;
    }

    @Override
    public void mostrarInformacion() {
      System.out.println("Soldado");
      System.out.println("Vida: "+vida);
      System.out.println("Ataque: "+ataque);
      System.out.println("Posicion: "+posicionX+" "+posicionY);
    }

  }

  public static class Arquero extends UnidadMilitar {

    public Arquero(String imagen, Integer posicionX,
        Integer posicionY,Integer vida,Integer ataque) {
      super(imagen, posicionX, posicionY, vida, ataque);
    }

    @Override
    public void setVida(Integer vida) {
      this.vida = vida;
    }

    @Override
    public void setAtaque(Integer ataque) {
      this.ataque = ataque;
    }

    @Override
    public void setPosicion(Integer posicionX, Integer posicionY) {
      this.posicionX = posicionX;
      this.posicionY = posicionY;
    }

    @Override
    public void mostrarInformacion() {
      System.out.println("Arquero");
      System.out.println("Vida: "+vida);
      System.out.println("Ataque: "+ataque);
      System.out.println("Posicion: "+posicionX+" "+posicionY);
    }
  }

  public static class FabricaUnidadesMilitares {
    private static final HashMap<String, UnidadMilitar> unidadesMilitares = new HashMap<>();
    public static UnidadMilitar getUnidadMilitar(String tipo) {

      UnidadMilitar unidadMilitar = unidadesMilitares.get(tipo);
      if (unidadMilitar == null) {
        switch (tipo) {
          case "Soldado":
            unidadMilitar = new Soldado("imagenSoldado", 0, 0, 100, 10);
            break;
          case "Arquero":
            unidadMilitar = new Arquero("imagenArquero", 0, 0, 100, 10);
            break;
        }
        unidadesMilitares.put(tipo, unidadMilitar);
      }
      return unidadMilitar;
    }
  }
  public  static void main(String[] args) {
    UnidadMilitar soldado1 = FabricaUnidadesMilitares.getUnidadMilitar("Soldado");
    soldado1.setVida(12);
    soldado1.mostrarInformacion();
    UnidadMilitar soldado2 = FabricaUnidadesMilitares.getUnidadMilitar("Soldado");
    soldado2.setVida(18);
    soldado2.mostrarInformacion();
    UnidadMilitar arquero1 = FabricaUnidadesMilitares.getUnidadMilitar("Arquero");
    arquero1.setVida(12);
    arquero1.mostrarInformacion();
    UnidadMilitar arquero2 = FabricaUnidadesMilitares.getUnidadMilitar("Arquero");
    arquero2.setVida(18);
    arquero2.mostrarInformacion();

  }

}