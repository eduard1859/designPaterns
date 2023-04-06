package com.design.paterns.creational.singleton.example2;

/*
  Supongamos que estamos desarrollando una aplicación que necesita conectarse
  a una base de datos y queremos asegurarnos de que solo haya una instancia de
  la conexión en toda la aplicación. Además, queremos que esta instancia
  sea compartida por todos los objetos que necesiten acceder a la base de
  datos.
 */
public class main {

  public static class Database {

    private static Database instance = null;

    private Database() {
    }

    public static Database getInstance() {
      if (instance == null) {
        instance = new Database();
      }
      return instance;
    }

    public void query(String sql) {
      System.out.println("Querying database: " + sql);
    }
  }

  public static void main(String[] args) {
    Database db = Database.getInstance();
    db.query("SELECT * FROM users");
    Database db1 = Database.getInstance();
    db1.query("SELECT * FROM users");
  }


}