package com.design.paterns.creational.builder.example2;
/*
un caso en el que se podría utilizar el patrón Builder es en
 la construcción de objetos de tipo vehículo.

Imaginemos que necesitamos construir un objeto vehículo que tiene
varias características como marca, modelo, año de fabricación,
tipo de combustible, número de puertas, color, entre otras.
Además, para cada una de estas características podrían existir varias opciones
 posibles, por ejemplo, el tipo de combustible puede ser gasolina,
  diésel o eléctrico.

En este caso, el patrón Builder nos permitiría construir un objeto vehículo
 de manera sencilla y flexible, permitiéndonos seleccionar las características
  que deseamos para el vehículo de forma individual y en cualquier orden.
 */



public class main {
    public  static class Vehiculo {
        private String marca;
        private String modelo;
        private int anioFabricacion;
        private String tipoCombustible;
        private int numeroPuertas;
        private String color;
        public Vehiculo(String marca, String modelo, int anioFabricacion, String tipoCombustible, int numeroPuertas, String color) {
            this.marca = marca;
            this.modelo = modelo;
            this.anioFabricacion = anioFabricacion;
            this.tipoCombustible = tipoCombustible;
            this.numeroPuertas = numeroPuertas;
            this.color = color;
        }
        public String getMarca() {
            return marca;
        }
        public String getModelo() {
            return modelo;
        }
        public int getAnioFabricacion() {
            return anioFabricacion;
        }
        public String getTipoCombustible() {
            return tipoCombustible;
        }
        public int getNumeroPuertas() {
            return numeroPuertas;
        }
        public String getColor() {
            return color;
        }
        @Override
        public String toString() {
            return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion
                    + ", tipoCombustible=" + tipoCombustible + ", numeroPuertas=" + numeroPuertas + ", color=" + color
                    + "]";
        }
    }
    public static  class VehiculoBuilder {
      private String marca;
      private String modelo;
      private int anioFabricacion;
      private String tipoCombustible;
      private int numeroPuertas;
      private String color;

      public VehiculoBuilder() {
      }
      public VehiculoBuilder setMarca(String marca) {
          this.marca = marca;
          return this;
      }
      public VehiculoBuilder setModelo(String modelo) {
          this.modelo = modelo;
          return this;
      }
      public VehiculoBuilder setAnioFabricacion(int anioFabricacion) {
          this.anioFabricacion = anioFabricacion;
          return this;
      }
      public VehiculoBuilder setTipoCombustible(String tipoCombustible) {
          this.tipoCombustible = tipoCombustible;
          return this;
      }
      public VehiculoBuilder setNumeroPuertas(int numeroPuertas) {
          this.numeroPuertas = numeroPuertas;
          return this;
      }
      public VehiculoBuilder setColor(String color) {
          this.color = color;
          return this;
      }
      public Vehiculo build() {
          return new Vehiculo(marca, modelo, anioFabricacion, tipoCombustible, numeroPuertas, color);
      }


    }
    public static void main(String[] args) {
        Vehiculo vehiculoGasolina = new VehiculoBuilder().setMarca("Toyota").setModelo("Corolla").setAnioFabricacion(2018)
                .setTipoCombustible("Gasolina").setNumeroPuertas(4).setColor("Blanco").build();
        System.out.println(vehiculoGasolina);

        Vehiculo vehiculoPetroleo = new VehiculoBuilder().setMarca("Toyota").setModelo("Corolla").setAnioFabricacion(2018)
                .setTipoCombustible("Petroleo").setNumeroPuertas(6).setColor("Blanco").build();
        System.out.println(vehiculoPetroleo);


    }
}