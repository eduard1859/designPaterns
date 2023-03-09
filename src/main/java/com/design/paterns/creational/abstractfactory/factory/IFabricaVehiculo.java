package com.design.paterns.creational.abstractfactory.factory;

import com.design.paterns.creational.abstractfactory.product.Automovil;

public interface IFabricaVehiculo {

  Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);


}