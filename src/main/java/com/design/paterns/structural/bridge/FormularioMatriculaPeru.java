package com.design.paterns.structural.bridge;

import com.design.paterns.structural.bridge.implementacion.Formulario;

public class FormularioMatriculaPeru  extends FormularioMatricula {

    public FormularioMatriculaPeru(Formulario imp) {
        super(imp);
    }

    @Override
    protected boolean controlZona(String contenido) {
        return contenido.length() == 8;
    }

}