package com.design.paterns.structural.decorator.example1.decorator;

import com.design.paterns.structural.decorator.example1.component.ComponenteGraficoVehiculo;

public abstract class Decorador implements ComponenteGraficoVehiculo {

    protected ComponenteGraficoVehiculo componente;

    public Decorador(ComponenteGraficoVehiculo componente) {
      this.componente = componente;
    }

    public void visualiza() {
      componente.visualiza();
    }
}