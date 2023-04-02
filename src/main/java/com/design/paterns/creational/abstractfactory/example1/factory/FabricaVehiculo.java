package com.design.paterns.creational.abstractfactory.example1.factory;

import com.design.paterns.creational.abstractfactory.example1.product.Automovil;
import com.design.paterns.creational.abstractfactory.example1.product.Scotter;

public interface FabricaVehiculo {

  Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);

  Scotter creaScotter(String modelo, String color, int potencia);


}