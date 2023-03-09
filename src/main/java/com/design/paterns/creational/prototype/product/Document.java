package com.design.paterns.creational.prototype.product;

public abstract class Document implements Cloneable {

    protected String contenido = new String();

    public Document duplica() {
        Document resultado = null;
        try {
            resultado = (Document) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resultado;
    }
    public void rellena(String informacion) {
        contenido = informacion;
    }
    public abstract void imprime();
    public abstract void visualiza();
}