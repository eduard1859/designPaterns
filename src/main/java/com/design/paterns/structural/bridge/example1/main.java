package com.design.paterns.structural.bridge.example1;

import com.design.paterns.structural.bridge.example1.implementacion.FormApple;
import com.design.paterns.structural.bridge.example1.implementacion.FormHtml;

public class main {

      public static void main(String[] args) {
        // TODO Auto-generated method stub
            FormularioMatricula formulario1, formulario2;
            formulario1 = new FormularioMatriculaPeru(new FormHtml());
            formulario1.visualiza();
            if (formulario1.administraZonaIndicada()) {
                formulario1.generaDocumento();
            }
            System.out.println();
            formulario2 = new FormularioMatriculaChile(new FormApple());
            formulario2.visualiza();
            if (formulario2.administraZonaIndicada()) {
                formulario2.generaDocumento();
            }
            System.out.println();
      }
}