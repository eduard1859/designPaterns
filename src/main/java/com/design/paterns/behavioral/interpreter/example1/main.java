package com.design.paterns.behavioral.interpreter.example1;

import java.util.Scanner;

public class main {

  interface Expresion {
    void interpretar(Contexto contexto);
  }

  // Expresión terminal
 static class PedidoExpresion implements Expresion {
    private Expresion[] pizzas;

    public PedidoExpresion(Expresion[] pizzas) {
      this.pizzas = pizzas;
    }

    @Override
    public void interpretar(Contexto contexto) {
      for (Expresion pizza : pizzas) {
        pizza.interpretar(contexto);
      }
    }
  }
 static class PizzaExpresion implements Expresion {
    private String tipo;

    public PizzaExpresion(String tipo) {
      this.tipo = tipo;
    }

    @Override
    public void interpretar(Contexto contexto) {
      // Lógica para agregar la pizza al pedido
      System.out.println("Agregando pizza " + tipo + " al pedido");
    }
  }
  // Contexto
 static class Contexto {
    // Puedes agregar propiedades adicionales según las necesidades del sistema
  }

  // Intérprete
 static class PedidoInterpreter {
    private Expresion expresion;

    public PedidoInterpreter(Expresion expresion) {
      this.expresion = expresion;
    }

    public void interpretarComando(String comando) {
      // Lógica para interpretar el comando de texto y crear el pedido
      Contexto contexto = new Contexto();
      expresion.interpretar(contexto);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bienvenido a la pizzería");
    System.out.println("Ingrese su pedido:");

    String comando = scanner.nextLine();

    // Crear las expresiones para interpretar el pedido
    Expresion[] pizzas = {
        new PizzaExpresion("Margherita"),
        new PizzaExpresion("Pepperoni"),
        new PizzaExpresion("Hawaiana")
    };
    Expresion pedido = new PedidoExpresion(pizzas);

    // Crear el intérprete y ejecutar el comando
    PedidoInterpreter interpreter = new PedidoInterpreter(pedido);
    interpreter.interpretarComando(comando);

    System.out.println("Pedido realizado con éxito");

  }
}