package com.design.paterns.behavioral.visitor.example1;

/*
supongamos que tienes una tienda en línea que vende productos electrónicos.
 El objetivo es que los usuarios puedan agregar productos a su carrito de compras y
  que puedan aplicar diferentes descuentos según ciertas condiciones. Por ejemplo,
  pueden tener un descuento del 10% en su primer pedido, un 15% de descuento si gastan más de $ 500,
   un 20% de descuento si compran dos productos del mismo tipo, etc.

En este caso, podrías utilizar el patrón Decorator para implementar las diferentes opciones
de descuento como "decoradores" que se aplican sobre el precio base del producto.
Cada decorador implementaría una lógica específica para calcular el descuento que corresponde
 y se encargaría de actualizar el precio final del producto en consecuencia. Luego,
  podrías encadenar diferentes decoradores para aplicar varios descuentos al mismo tiempo.


 */
public class main {

  public interface visitorDocument {
    void visit(PdfFile pdfFile);
    void visit(WordFile wordFile);
    void visit(ExcelFile excelFile);
  }

  public  static  class ContadorPalabras implements visitorDocument {
    @Override
    public void visit(PdfFile pdfFile) {
      System.out.println("Contando palabras en un archivo PDF");
    }

    @Override
    public void visit(WordFile wordFile) {
      System.out.println("Contando palabras en un archivo Word");
    }

    @Override
    public void visit(ExcelFile excelFile) {
      System.out.println("Contando palabras en un archivo Excel");
    }
  }


  public interface Document {
    void accept(visitorDocument visitor);
  }

  public static class PdfFile implements Document {
    @Override
    public void accept(visitorDocument visitor) {
      visitor.visit(this);
    }
  }

  public static class WordFile implements Document {
    @Override
    public void accept(visitorDocument visitor) {
      visitor.visit(this);
    }
  }

  public static class ExcelFile implements Document {
    @Override
    public void accept(visitorDocument visitor) {
      visitor.visit(this);
    }
  }

  public static void main(String[] args) {
      Document pdfFile = new PdfFile();
      Document wordFile = new WordFile();
      Document excelFile = new ExcelFile();

      ContadorPalabras contadorPalabras = new ContadorPalabras();

      pdfFile.accept(contadorPalabras);
      wordFile.accept(contadorPalabras);
      excelFile.accept(contadorPalabras);



    }
}