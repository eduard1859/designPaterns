package com.design.paterns.structural.bridge;

import com.design.paterns.structural.bridge.implementacion.Formulario;

public abstract class FormularioMatricula {
  protected String contenido;
  protected Formulario formulario;

  public FormularioMatricula(Formulario formulario) {
    this.formulario = formulario;
  }
  public void visualiza() {
    formulario.dibujaTexto("Numero matricula: " );
  }
  public void generaDocumento() {
    formulario.dibujaTexto("Numero matricula: " );
    formulario.dibujaTexto(contenido);
  }
  public boolean administraZonaIndicada() {
    contenido = formulario.administraZonaIndicada();
     return this.controlZona(contenido);
  }

  protected abstract boolean controlZona(String contenido);
}