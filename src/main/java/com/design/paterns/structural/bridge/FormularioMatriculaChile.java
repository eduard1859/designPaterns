package com.design.paterns.structural.bridge;

import com.design.paterns.structural.bridge.implementacion.Formulario;

public class FormularioMatriculaChile extends FormularioMatricula {

    public FormularioMatriculaChile(Formulario imp) {
        super(imp);
    }

    @Override
    protected boolean controlZona(String contenido) {
        return contenido.length() == 5;
    }


}