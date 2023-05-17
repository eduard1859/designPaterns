package com.design.paterns.behavioral.visitor.example1;

public class main2 {

  public static  abstract class Pedido {
     Double precio = 0D;
    abstract void aplicaDescuento(VisitorPromocion visitor);
  }

  public static class PedidoInternacional extends Pedido {

    PedidoInternacional() {
      precio = 100D;
    }

    @Override
    public void aplicaDescuento(VisitorPromocion visitor) {
      visitor.visit(this);
    }

  }

  public interface VisitorPromocion{
    void visit(Pedido pedido);
  }

  public static class PromocionSuperJueves implements VisitorPromocion {
    @Override
    public void visit(Pedido pedido) {
      System.out.println("Promocionando pedido Especial del super Jueves " + (pedido.precio*0.5));
    }
  }

  public static class  PromocionPizzaGratis implements VisitorPromocion {
    @Override
    public void visit(Pedido pedido) {
      System.out.println("Promocionando pedido Especial de Pizza Gratis " + (pedido.precio*0));
    }
  }



  public static void main(String[] args) {

    Pedido pedidoInternacional = new PedidoInternacional();
    PromocionSuperJueves promocionSuperJueves = new PromocionSuperJueves();
    pedidoInternacional.aplicaDescuento(promocionSuperJueves);

    Pedido pedidoInternacional2 = new PedidoInternacional();
    PromocionPizzaGratis promocionPizzaGratis = new PromocionPizzaGratis();
    pedidoInternacional2.aplicaDescuento(promocionPizzaGratis);
  }

}