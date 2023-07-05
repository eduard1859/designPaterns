package com.design.paterns.behavioral.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class main2 {

  // Sujeto Observable: Clima
  static class Clima {
    private List<Observador> observadores;
    private String estado;

    public Clima() {
      observadores = new ArrayList<>();
    }

    public void agregarObservador(Observador observador) {
      observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
      observadores.remove(observador);
    }

    public void setEstado(String estado) {
      this.estado = estado;
      notificarObservadores();
    }

    public String getEstado() {
      return estado;
    }

    private void notificarObservadores() {
      for (Observador observador : observadores) {
        observador.actualizar(estado);
      }
    }
  }

  // Observador: Pantalla
  interface Observador {
    void actualizar(String estado);
  }

  // Observadores concretos: PantallaPrincipal y PantallaSecundaria
  static class PantallaPrincipal implements Observador {
    @Override
    public void actualizar(String estado) {
      System.out.println("Pantalla principal actualizada. Estado del clima: " + estado);
    }
  }

  static class PantallaSecundaria implements Observador {
    @Override
    public void actualizar(String estado) {
      System.out.println("Pantalla secundaria actualizada. Estado del clima: " + estado);
    }
  }

  // Clase principal para probar el código
    public static void main(String[] args) {
      // Crear el objeto Clima
      Clima clima = new Clima();

      // Crear las pantallas (observadores)
      Observador pantallaPrincipal = new PantallaPrincipal();
      Observador pantallaSecundaria = new PantallaSecundaria();

      // Agregar las pantallas como observadores del Clima
      clima.agregarObservador(pantallaPrincipal);
      clima.agregarObservador(pantallaSecundaria);

      // Actualizar el estado del Clima
      clima.setEstado("Soleado");

      // Salida esperada:
      // Pantalla principal actualizada. Estado del clima: Soleado
      // Pantalla secundaria actualizada. Estado del clima: Soleado
    }

}