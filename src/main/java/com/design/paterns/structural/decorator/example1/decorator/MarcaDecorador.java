package com.design.paterns.structural.decorator.example1.decorator;

import com.design.paterns.structural.decorator.example1.component.ComponenteGraficoVehiculo;

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