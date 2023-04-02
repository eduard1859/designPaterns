package com.design.paterns.creational.abstractfactory.example1;

import com.design.paterns.creational.abstractfactory.example1.factory.FabricaVehiculo;
import com.design.paterns.creational.abstractfactory.example1.factory.FabricaVehiculoElectrico;
import com.design.paterns.creational.abstractfactory.example1.factory.FabricaVehiculoGasolina;
import com.design.paterns.creational.abstractfactory.example1.product.Automovil;
import com.design.paterns.creational.abstractfactory.example1.product.Scotter;
import java.util.ArrayList;
import java.util.List;

public class main {

  public static void main(String[] args) {
   // crear  10 vehiculo electrico y 10 vehiculo gasolina con un ciclo for
    FabricaVehiculo fabricaVehiculoElectrico = new FabricaVehiculoElectrico();
    List<Automovil> automovilList = new ArrayList();
    List<Scotter> scotterList = new ArrayList();
    for (int i = 0; i < 10; i++) {
      Automovil automovilElectrico = fabricaVehiculoElectrico.creaAutomovil("modelo" + i, "color" + i, 100 + i, 100.0 + i);
      automovilList.add(automovilElectrico);
      Scotter scotterElectrico = fabricaVehiculoElectrico.creaScotter("modelo" + i, "color" + i, 100 + i);
      scotterList.add(scotterElectrico);
    }
    FabricaVehiculo fabricaVehiculoGasolina = new FabricaVehiculoGasolina();
    for (int i = 0; i < 10; i++) {
      Automovil automovilGasolina = fabricaVehiculoGasolina.creaAutomovil("modelo" + i, "color" + i, 100 + i, 100.0 + i);
      automovilList.add(automovilGasolina);
      Scotter scotterManual = fabricaVehiculoGasolina.creaScotter("modelo" + i, "color" + i, 100 + i);
      scotterList.add(scotterManual);
    }

    // mostrar las caracteristicas de los vehiculos
    for (Automovil automovil : automovilList) {
        automovil.mostrarCaracteristicas();
    }
    for (Scotter scotter : scotterList) {
        scotter.mostrarCaracteristicas();
    }
  }
}