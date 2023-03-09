package com.design.paterns.structural.adapter.adaptado;

public class ComponentPdf {

      protected String contenido;

      public void pdfFijaContenido(String contenido) {
          this.contenido = contenido;
      }
      public void pdfPreparaVisualizacion() {
          System.out.println("Prepara la visualización del PDF: " + contenido);
      }
      public void pdfRefresca() {
          System.out.println("Refresca la visualización del PDF: " + contenido);
      }
      public void  pdfFinalizaVisualizacion() {
          System.out.println("Finaliza la visualización del PDF: " + contenido);
      }
      public void pdfEnviaImpresora() {
          System.out.println("Envía a impresora el PDF: " + contenido);
      }

}