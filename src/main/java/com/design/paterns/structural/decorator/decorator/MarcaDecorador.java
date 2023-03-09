package com.design.paterns.structural.decorator.decorator;

import com.design.paterns.structural.decorator.component.ComponenteGraficoVehiculo;

public class MarcaDecorador extends Decorador {

    public MarcaDecorador(ComponenteGraficoVehiculo componente) {
        super(componente);
    }

    public void visualiza() {
        super.visualiza();
        this.pintaMarca();
    }

    private void pintaMarca() {
        System.out.println("Agrega la marca del vehiculo");
    }


}