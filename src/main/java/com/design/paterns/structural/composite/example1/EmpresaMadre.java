package com.design.paterns.structural.composite.example1;

import java.util.ArrayList;
import java.util.List;

public class EmpresaMadre extends Empresa{

  protected List<Empresa>   filiales = new ArrayList<>();

  public double calculaCosteMantenimiento() {
    double coste = 0;
    for (Empresa filial : filiales) {
      coste += filial.calculaCosteMantenimiento();
    }
    return coste;
  }

  public boolean agregaFilial(Empresa filial) {
    return filiales.add(filial);
  }
}