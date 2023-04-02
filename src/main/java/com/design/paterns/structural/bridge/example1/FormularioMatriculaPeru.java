package com.design.paterns.structural.bridge.example1;

import com.design.paterns.structural.bridge.example1.implementacion.Formulario;

public class FormularioMatriculaPeru  extends FormularioMatricula {

    public FormularioMatriculaPeru(Formulario imp) {
        super(imp);
    }

    @Override
    protected boolean controlZona(String contenido) {
        return contenido.length() == 8;
    }

}