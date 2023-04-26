package com.design.paterns.creational.abstractfactory.example2;
   /* Supongamos que tienes una aplicación que administra el proceso de matrícula
    de estudiantes en una universidad. Cada estudiante tiene que elegir una
        carrera y un conjunto de materias para inscribirse en cada semestre.

    El problema es que el proceso de matrícula es diferente para cada carrera.
        Algunas carreras tienen requisitos específicos que deben cumplirse antes de
        que un estudiante pueda inscribirse en ciertas materias, mientras que otras
        no tienen requisitos adicionales.

    Implementa el patrón Abstract Factory para resolver este problema y permitir
        que el proceso de matrícula se adapte a cada carrera de manera dinámica.
        Por favor, implementa al menos dos tipos diferentes de carreras y
        los requisitos que se deben cumplir para cada carrera. Puedes asumir que ya
        tienes definida la clase Estudiante y las clases de Materia.*/
public class main {


  public static class Estudiante{

    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String telefono;
    private String direccion;
    private String fechaNacimiento;


  }
  public static class Materia{

    private String nombre;
    private String codigo;
    private String descripcion;
    private String creditos;
    private String horas;
    private String semestre;
    private String carrera;

  }

  public interface  Carrera{

   public  void requisitosMateria(Materia materia);

   public  void inscribirMateria(Estudiante estudiante, Materia materia);

  }

  public static class Ingenieria implements Carrera{

    @Override
    public void requisitosMateria(Materia materia) {
      System.out.println("Requisitos para la materia de ingenieria");
    }

    @Override
    public void inscribirMateria(Estudiante estudiante, Materia materia) {
      System.out.println("Inscribir materia de ingenieria");
    }
  }

  public static class Medicina implements Carrera{

    @Override
    public void requisitosMateria(Materia materia) {
      System.out.println("Requisitos para la materia de medicina");
    }

    @Override
    public void inscribirMateria(Estudiante estudiante, Materia materia) {
      System.out.println("Inscribir materia de medicina");
    }
  }
  public  interface  CarreraFactory {
    public  Carrera createCarrera(String type);
  }

  public static class CarreraFactoryImpl implements CarreraFactory{

    @Override
    public Carrera createCarrera(String type) {
      switch (type){
        case "Ingenieria":
          return new Ingenieria();
        case "Medicina":
          return new Medicina();
        default:
          throw new IllegalArgumentException("Carrera no soportada");
      }
    }
  }



  public static void main(String[] args){
    CarreraFactory factory = new CarreraFactoryImpl();
    Carrera carrera = factory.createCarrera("Ingenieria");
    carrera.requisitosMateria(new Materia());
    carrera.inscribirMateria(new Estudiante(), new Materia());
  }

}