package com.design.paterns.structural.bridge.example1;

import com.design.paterns.structural.bridge.example1.implementacion.Formulario;

public class FormularioMatriculaChile extends FormularioMatricula {

    public FormularioMatriculaChile(Formulario imp) {
        super(imp);
    }

    @Override
    protected boolean controlZona(String contenido) {
        return contenido.length() == 5;
    }


}