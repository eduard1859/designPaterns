package com.design.paterns.structural.decorator.example1;

import com.design.paterns.structural.decorator.example1.component.VistaVehiculo;
import com.design.paterns.structural.decorator.example1.decorator.MarcaDecorador;
import com.design.paterns.structural.decorator.example1.decorator.ModeloDecorador;

public class main {

    public static void main(String[] args) {
      VistaVehiculo vista = new VistaVehiculo();
      MarcaDecorador marca = new MarcaDecorador(vista);
      ModeloDecorador modelo = new ModeloDecorador(marca);
      modelo.visualiza();
    }
}