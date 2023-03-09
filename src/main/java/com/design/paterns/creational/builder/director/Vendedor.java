package com.design.paterns.creational.builder.director;

import com.design.paterns.creational.builder.constructor.DocumentacionVehiculo;
import com.design.paterns.creational.builder.product.Documentacion;

public class Vendedor {
    protected DocumentacionVehiculo constructor;

    public Vendedor(DocumentacionVehiculo constructor) {
        this.constructor = constructor;
    }

    public Documentacion construye(String nombreCliente) {
        constructor.construyeSolicitudPedido(nombreCliente);
        constructor.construyeSolicitudMatriculacion(nombreCliente);
        Documentacion documentacion = constructor.resultado();
        return documentacion;
    }
}