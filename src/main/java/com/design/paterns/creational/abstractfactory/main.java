package com.design.paterns.creational.abstractfactory;

import com.design.paterns.creational.abstractfactory.factory.IFabricaVehiculo;
import com.design.paterns.creational.abstractfactory.factory.FabricaVehiculoElectrico;
import com.design.paterns.creational.abstractfactory.factory.FabricaVehiculoGasolina;
import com.design.paterns.creational.abstractfactory.product.Automovil;
import java.util.ArrayList;
import java.util.List;

public class main {

  public static void main(String[] args) {
   // crear  10 vehiculo electrico y 10 vehiculo gasolina con un ciclo for
    IFabricaVehiculo IFabricaVehiculo = new FabricaVehiculoElectrico();
    List<Automovil> automoviles = new ArrayList<Automovil>();
    for (int i = 0; i < 10; i++) {
      automoviles.add(IFabricaVehiculo.creaAutomovil("modelo" + i, "color" + i, 100 + i, 100.0 + i));
    }
    IFabricaVehiculo IFabricaVehiculo2 = new FabricaVehiculoGasolina();
    for (int i = 0; i < 10; i++) {
      automoviles.add(IFabricaVehiculo2.creaAutomovil("modelo" + i, "color" + i, 100 + i, 100.0 + i));
    }
    // mostrar las caracteristicas de los vehiculos
    for (Automovil automovil : automoviles) {
      automovil.mostrarCaracteristicas();
    }


  }
}