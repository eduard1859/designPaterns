package com.design.paterns.structural.composite;

public class EmpresaSinFilial extends Empresa{

  public double calculaCosteMantenimiento() {
    return  nVehiculos * costeUnitarioVehiculo;
  }

  public boolean agregaFilial(Empresa filial) {
    return false;
  }
}