package com.design.paterns.behavioral.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class main {

  // Sujeto (Observable)
  public  static class Pizzeria {
    private List<Cliente> clientes = new ArrayList<>();

    public void suscribirCliente(Cliente cliente) {
      clientes.add(cliente);
    }

    public void desuscribirCliente(Cliente cliente) {
      clientes.remove(cliente);
    }

    public void notificarPromocion(String promocion) {
      for (Cliente cliente : clientes) {
        cliente.actualizar(promocion);
      }
    }
  }

  // Observador
  public interface Cliente {
    void actualizar(String promocion);
  }

  // Observador concreto
  public static class ClienteRegular implements Cliente {
    private String nombre;

    public ClienteRegular(String nombre) {
      this.nombre = nombre;
    }

    @Override
    public void actualizar(String promocion) {
      System.out.println("[" + nombre + "] Ha recibido una promoción: " + promocion);
    }
  }

  // Observador concreto
  public  static class ClientePremium implements Cliente {
    private String nombre;

    public ClientePremium(String nombre) {
      this.nombre = nombre;
    }

    @Override
    public void actualizar(String promocion) {
      System.out.println("[" + nombre + "] Ha recibido una promoción especial: " + promocion);
    }
  }

  // Ejemplo de uso
    public static void main(String[] args) {
      Pizzeria pizzeria = new Pizzeria();

      Cliente cliente1 = new ClienteRegular("Juan");
      Cliente cliente2 = new ClientePremium("María");

      pizzeria.suscribirCliente(cliente1);
      pizzeria.suscribirCliente(cliente2);

      pizzeria.notificarPromocion("¡Hoy todas las pizzas al 50% de descuento!");

      //pizzeria.desuscribirCliente(cliente1);

      //pizzeria.notificarPromocion("¡Nuevo sabor de pizza disponible!");

      // Resultado esperado:
      // [Juan] Ha recibido una promoción: ¡Hoy todas las pizzas al 50% de descuento!
      // [María] Ha recibido una promoción: ¡Hoy todas las pizzas al 50% de descuento!
      // [María] Ha recibido una promoción especial: ¡Nuevo sabor de pizza disponible!
    }

}