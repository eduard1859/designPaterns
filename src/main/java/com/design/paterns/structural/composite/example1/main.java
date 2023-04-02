package com.design.paterns.structural.composite.example1;

public class main {

      public static void main(String[] args) {
        // TODO Auto-generated method stub
            Empresa filial1 = new EmpresaSinFilial();
            filial1.agregaVehiculo();
            filial1.agregaVehiculo();
            Empresa filial2 = new EmpresaSinFilial();
            filial2.agregaVehiculo();
            filial2.agregaVehiculo();
            Empresa grupo = new EmpresaMadre();
            grupo.agregaFilial(filial1);
            grupo.agregaFilial(filial2);
            System.out.println(grupo.calculaCosteMantenimiento());
      }
}