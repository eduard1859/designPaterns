package com.design.paterns.structural.adapter.example1.adaptador;

import com.design.paterns.structural.adapter.example1.Documento;
import com.design.paterns.structural.adapter.example1.adaptado.ComponentPdf;

public class DocumentPdf implements Documento {

    protected ComponentPdf implementacion;

    public DocumentPdf() {

        implementacion = new ComponentPdf();
    }

    @Override
    public void setContenido(String contenido) {
        implementacion.pdfFijaContenido(contenido);
    }

    @Override
    public void dibuja() {
        implementacion.pdfPreparaVisualizacion();
        implementacion.pdfRefresca();
        implementacion.pdfFinalizaVisualizacion();
    }

    @Override
    public void imprime() {
        implementacion.pdfEnviaImpresora();
    }

}