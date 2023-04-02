package com.design.paterns.structural.composite.example1;

public abstract class Empresa {
  protected static double costeUnitarioVehiculo = 5.0;
  protected int nVehiculos;

  public void agregaVehiculo() {
    nVehiculos++;
  }
  public abstract double calculaCosteMantenimiento();
  public abstract boolean agregaFilial(Empresa filial);

}