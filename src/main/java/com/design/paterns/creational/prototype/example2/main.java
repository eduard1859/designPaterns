package com.design.paterns.creational.prototype.example2;

public class main {

/*
  Una empresa de servicios de comida desea implementar el patrón Prototype para mejorar
   la eficiencia en la creación de pedidos de comida personalizados.
   Cada pedido tiene varios elementos como la proteína, el acompañamiento, las bebidas y los postres,
    y cada uno de estos elementos tiene varias opciones disponibles. La empresa quiere que los clientes
    puedan crear pedidos personalizados de manera rápida y sencilla, sin tener que esperar a que se cree cada elemento por separado.
 */
  public static abstract class PrototypePedido{

    protected ElementoPedido[] elementoPedido;

    public PrototypePedido(ElementoPedido[] elementoPedido) {
      this.elementoPedido = elementoPedido;
    }

    public abstract PrototypePedido  clone();


  }

  public static class Pedido extends PrototypePedido{

    public Pedido(ElementoPedido[] elementoPedido) {
      super(elementoPedido);
    }

    @Override
    public Pedido clone() {
      return  new Pedido(this.elementoPedido);
    }

    public String toString() {
      String resultado = "---";
      for (ElementoPedido elementoPedido : this.elementoPedido) {
        resultado += elementoPedido.nombre + " --- ";
        for (OpcionPedido opcionPedido : elementoPedido.opcionePedido) {
          resultado += opcionPedido.nombre + " " + opcionPedido.valor + " ";
        }
      }
      System.out.println(resultado);
      return resultado;
    }
  }


  public static class ElementoPedido {

    private String nombre;
    private OpcionPedido[] opcionePedido;

    public ElementoPedido(String nombre,OpcionPedido[] opcionePedido) {
      this.opcionePedido = opcionePedido;
      this.nombre = nombre;
    }

  }

  public static class OpcionPedido {

    private String nombre;
    private String valor;

    public OpcionPedido(String nombre, String valor) {
      this.nombre = nombre;
      this.valor = valor;
    }

  }

  public static void main(String args[]) {

   // implementa el cliente
    OpcionPedido opcionPedido = new OpcionPedido("OpcionA","OptionA");
    OpcionPedido opcionPedido1 = new OpcionPedido("OpcionB","OptionB");
    OpcionPedido opcionPedido2 = new OpcionPedido("OpcionC","OptionC");
    OpcionPedido[] opciones = {opcionPedido,opcionPedido1,opcionPedido2};
    ElementoPedido bebida = new ElementoPedido("bebida",opciones);
    ElementoPedido proteina = new ElementoPedido("proteina",opciones);

    ElementoPedido[] elementos = {bebida,proteina};

    Pedido pedido = new Pedido(elementos);

    pedido.toString();
    Pedido pedido1 = pedido.clone();
    pedido1.elementoPedido[0].nombre = "Cambio";
    pedido1.toString();



  }


}