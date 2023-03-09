package com.design.paterns.structural.adapter;

import com.design.paterns.structural.adapter.adaptador.DocumentPdf;

public class main {

      public static void main(String[] args) {
        // TODO Auto-generated method stub
            Documento documento1, documento2;
            documento1 = new DocumentoHtml();
            documento1.setContenido("Este es un documento HTML");
            documento1.dibuja();
            documento1.imprime();
            System.out.println();
            documento2 = new DocumentPdf();
            documento2.setContenido("Este es un documento PDF");
            documento2.dibuja();
            documento2.imprime();
            System.out.println();
      }
}