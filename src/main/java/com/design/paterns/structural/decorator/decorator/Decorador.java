package com.design.paterns.structural.decorator.decorator;

import com.design.paterns.structural.decorator.component.ComponenteGraficoVehiculo;

public abstract class Decorador implements ComponenteGraficoVehiculo {

    protected ComponenteGraficoVehiculo componente;

    public Decorador(ComponenteGraficoVehiculo componente) {
      this.componente = componente;
    }

    public void visualiza() {
      componente.visualiza();
    }
}