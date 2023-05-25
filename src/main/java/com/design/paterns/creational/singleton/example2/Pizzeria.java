package com.design.paterns.creational.singleton.example2;

public class Pizzeria {
    private static Pizzeria instance;

    private Pizzeria() {
      // constructor privado para prevenir la creación de instancias externas
    }

    public static Pizzeria getInstance() {
      if (instance == null) {
        instance = new Pizzeria();
      }
      return instance;
    }

    public void takeOrder(String pizzaType) {
      // lógica para tomar la orden del cliente
    }

    public void prepareOrder() {
      // lógica para preparar la orden del cliente
    }

    public void deliverOrder() {
      // lógica para entregar la orden al cliente
    }

    public static void main(String[] args){

      Pizzeria pizzeria = Pizzeria.getInstance();
      pizzeria.takeOrder("Pepperoni");
      pizzeria.prepareOrder();
      pizzeria.deliverOrder();
      Pizzeria pizzeria1 = Pizzeria.getInstance();
      pizzeria1.takeOrder("Pepperoni");
      pizzeria1.prepareOrder();
      pizzeria1.deliverOrder();

    }

}