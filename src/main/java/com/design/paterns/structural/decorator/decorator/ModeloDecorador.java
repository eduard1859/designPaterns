package com.design.paterns.structural.decorator.decorator;

import com.design.paterns.structural.decorator.component.ComponenteGraficoVehiculo;

public class ModeloDecorador  extends Decorador{

    public ModeloDecorador(ComponenteGraficoVehiculo componente) {
        super(componente);
    }

    public void visualiza() {
        super.visualiza();
        this.pintaModelo();
    }

    private void pintaModelo() {
        System.out.println("Agrega el modelo del vehiculo");
    }

}