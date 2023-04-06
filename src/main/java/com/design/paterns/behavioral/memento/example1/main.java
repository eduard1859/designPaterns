package com.design.paterns.behavioral.memento.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
  * Memento Design Pattern
  * caso de ejemplo
  *  supongamos que estás creando una aplicación de procesamiento de texto
  *  y quieres implementar una funcionalidad de deshacer/rehacer (undo/redo)
  *  para que los usuarios puedan retroceder y avanzar a través de
  *  las ediciones que han realizado.
  * ¿Cómo podrías aplicar el patrón Memento en esta situación?
 */
public class main {

  public static class  EditorTexto {
    private String texto;
    public EditorTexto(String texto) {
      this.texto = texto;
    }
    public EditorTextoMemento crearMemento() {
      return new EditorTextoMemento(texto);
    }
    public void restaurar(EditorTextoMemento memento) {
      texto  = Objects.nonNull(memento)? memento.getTexto(): "";
    }
  }
  public static class EditorTextoMemento {
    private String texto;
    public EditorTextoMemento(String texto) {
      this.texto = texto;
    }
    public String getTexto() {
      return texto;
    }
  }

  public static class Historial {
    private List<EditorTextoMemento> estados = new ArrayList<>();
    public void agregarMemento(EditorTextoMemento memento) {
      estados.add(memento);
    }
    public EditorTextoMemento getEstadoAnterior() {
      if(estados.size()>1) {
        EditorTextoMemento estadoAnterior = estados.get(estados.size()-2);
        estados.remove(estados.size()-1);
        return estadoAnterior;
      } else {
        return null;
      }
    }
  }
  public static void main(String[] args) {

    EditorTexto editor = new EditorTexto("Texto 1");
    Historial historial = new Historial();
    historial.agregarMemento(editor.crearMemento());
    System.out.println(editor.texto);
    editor.texto = "Texto 2";
    historial.agregarMemento(editor.crearMemento());
    System.out.println(editor.texto);
    editor.texto = "Texto 3";
    historial.agregarMemento(editor.crearMemento());
    System.out.println(editor.texto);
    editor.restaurar(historial.getEstadoAnterior());
    System.out.println(editor.texto);
    editor.restaurar(historial.getEstadoAnterior());
    System.out.println(editor.texto);
    editor.restaurar(historial.getEstadoAnterior());
    System.out.println(editor.texto);


  }
}