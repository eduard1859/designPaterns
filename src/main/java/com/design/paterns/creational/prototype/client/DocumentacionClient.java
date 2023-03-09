package com.design.paterns.creational.prototype.client;

import com.design.paterns.creational.prototype.product.Document;
import java.util.ArrayList;
import java.util.List;

public class DocumentacionClient  extends  Documentacion{

   public DocumentacionClient(String informacion) {
    documentos = new ArrayList<>();
    DocumentacionBlanco documentacionEnBlanco = DocumentacionBlanco.instancia();
    List<Document> documentosEnBlanco = documentacionEnBlanco.getDocumentos();
    for (Document document : documentosEnBlanco) {
      Document documentacionCliente = document.duplica();
      documentacionCliente.rellena(informacion);
      documentos.add(documentacionCliente);
    }
  }

   public void visualiza() {
    for (Document document : documentos) {
      document.visualiza();
    }
  }

   public void imprime() {
    for (Document document : documentos) {
      document.imprime();
    }
  }
}