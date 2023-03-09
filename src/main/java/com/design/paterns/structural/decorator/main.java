package com.design.paterns.structural.decorator;

import com.design.paterns.structural.decorator.component.VistaVehiculo;
import com.design.paterns.structural.decorator.decorator.MarcaDecorador;
import com.design.paterns.structural.decorator.decorator.ModeloDecorador;

public class main {

    public static void main(String[] args) {
      VistaVehiculo vista = new VistaVehiculo();
      MarcaDecorador marca = new MarcaDecorador(vista);
      ModeloDecorador modelo = new ModeloDecorador(marca);
      modelo.visualiza();
    }
}