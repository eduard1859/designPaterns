package com.design.paterns.behavioral.visitor.example1;

public class main3 {

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
      visitor.descuentoInternacional(this);
    }

  }

  public static class PedidoNacional extends Pedido {

    PedidoNacional() {
      precio = 50D;
    }

    @Override
    public void aplicaDescuento(VisitorPromocion visitor) {
      visitor.descuentoInternacional(this);
    }

  }

  public interface VisitorPromocion{
    void descuentoInternacional(Pedido pedido);
    void descuentoNacional(Pedido pedido);

  }

  public static class PromocionSuperJueves implements VisitorPromocion {
    @Override
    public void descuentoInternacional(Pedido pedido) {
      System.out.println("Promocionando pedido Especial del super Jueves " + (pedido.precio*0.5));
    }
    @Override
    public void descuentoNacional(Pedido pedido) {
      System.out.println("Promocionando pedido Especial del super Jueves " + (pedido.precio*0.2));
    }
  }

  public static class  PromocionPizzaGratis implements VisitorPromocion {
    @Override
    public void descuentoInternacional(Pedido pedido) {
      System.out.println("Promocionando pedido Especial de Pizza Gratis " + (pedido.precio*0.3));
    }
    @Override
    public void descuentoNacional(Pedido pedido) {
      System.out.println("Promocionando pedido Especial de Pizza Gratis " + (pedido.precio*0.3));
    }
  }
  public  static class PromocionLlevaTuCajitaFeliz implements VisitorPromocion {
    @Override
    public void descuentoInternacional(Pedido pedido) {
      System.out.println("Promocionando pedido Especial de Lleva tu cajita feliz " + (pedido.precio));
    }
    @Override
    public void descuentoNacional(Pedido pedido) {
      System.out.println("Promocionando pedido Especial de Lleva tu cajita feliz " + (pedido.precio*0.6));
    }
  }




  public static void main(String[] args) {

    Pedido   pedidoNacional = new PedidoNacional();
    PromocionLlevaTuCajitaFeliz promocionLlevaTuCajitaFeliz = new PromocionLlevaTuCajitaFeliz();
    pedidoNacional.aplicaDescuento(promocionLlevaTuCajitaFeliz);

    Pedido pedidoInternacional = new PedidoInternacional();
    PromocionSuperJueves promocionSuperJueves = new PromocionSuperJueves();
    pedidoInternacional.aplicaDescuento(promocionSuperJueves);

  }

}