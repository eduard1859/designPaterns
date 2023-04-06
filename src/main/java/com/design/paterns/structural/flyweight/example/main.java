package com.design.paterns.structural.flyweight.example;

import java.util.HashMap;

//Cada personaje tiene diferentes habilidades y atributos,
// como fuerza, velocidad y salud, y también diferentes apariencias,
// como ropa, color de piel y peinado.
// En este caso, podríamos utilizar el patrón Flyweight para minimizar
// la cantidad de objetos que se crean y reducir el consumo de memoria del juego.
public class main {

        public static class Apariencia {
                String colorPiel;
                String Peinado;
                String Ropa;

                String nombre;

                public Apariencia(String colorPiel, String peinado, String ropa,String nombre) {
                        this.colorPiel = colorPiel;
                        this.Peinado = peinado;
                        this.Ropa =    ropa;
                        this.nombre = nombre;
                }
        }
        public static   abstract class  Personaje {
                protected Integer fuerza;
                protected Integer velocidad;
                protected Integer salud;


                Personaje(Integer fuerza,Integer velocidad
                    ,Integer salud){
                        this.fuerza = fuerza;
                        this.velocidad = velocidad;
                        this.salud = salud;
                }

                public abstract void mostrarPoder(Apariencia apariencia);

        }
        public  static class Dinosaurio extends Personaje {
                public Dinosaurio(Integer fuerza,Integer velocidad
                    ,Integer salud){
                        super(fuerza,velocidad,salud);
                }
                @Override
                public void mostrarPoder(Apariencia apariencia) {
                        System.out.println("Dinosaurio");
                        System.out.println("Fuerza: "+fuerza);
                        System.out.println("Velocidad: "+velocidad);
                        System.out.println("Salud: "+salud);
                        System.out.println("Color de piel: "+apariencia.colorPiel);
                        System.out.println("Peinado: "+apariencia.Peinado);
                        System.out.println("Ropa: "+apariencia.Ropa);
                        System.out.println("Poder especial: "+apariencia.nombre);
                }
        }
        public static class Humano extends Personaje {
                public Humano(Integer fuerza,Integer velocidad
                    ,Integer salud){
                        super(fuerza,velocidad,salud);
                }
                @Override
                public void mostrarPoder(Apariencia apariencia) {
                        System.out.println("Humano");
                        System.out.println("Fuerza: "+fuerza);
                        System.out.println("Velocidad: "+velocidad);
                        System.out.println("Salud: "+salud);
                        System.out.println("Color de piel: "+apariencia.colorPiel);
                        System.out.println("Peinado: "+apariencia.Peinado);
                        System.out.println("Ropa: "+apariencia.Ropa);
                        System.out.println("Poder especial: "+apariencia.nombre);
                }
        }

        public static class FabricaPersonajes {
                private     HashMap<String,Personaje> personajes = new HashMap<String,Personaje>();
                public  Personaje getPersonaje(String tipo) {
                        Personaje personaje = personajes.get(tipo);
                        if(personaje == null) {
                                if(tipo.equals("Dinosaurio")) {
                                        personaje = new Dinosaurio(100, 100, 100);
                                }else if(tipo.equals("Humano")) {
                                        personaje = new Humano(200, 200, 200);
                                }
                                personajes.put(tipo, personaje);
                        }
                        return personaje;
                }
        }

        public static void main(String[] args) {
                FabricaPersonajes fabrica = new FabricaPersonajes();
                Personaje personaje1 = fabrica.getPersonaje("Dinosaurio");
                personaje1.mostrarPoder(new Apariencia("Verde", "Corto", "Camisa","Fuego"));
                Personaje personaje2 = fabrica.getPersonaje("Humano");
                personaje2.mostrarPoder(new Apariencia("rojo", "Corto", "Camisa","Rayo"));
                Personaje personaje3 = fabrica.getPersonaje("Dinosaurio");
                personaje3.mostrarPoder(new Apariencia("claro", "Corto", "Camisa","Rayo"));
                Personaje personaje4 = fabrica.getPersonaje("Humano");
                personaje4.mostrarPoder(new Apariencia("humo", "Corto", "Camisa","Rayo"));
        }
}