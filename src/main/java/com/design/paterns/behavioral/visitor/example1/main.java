package com.design.paterns.behavioral.visitor.example1;

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