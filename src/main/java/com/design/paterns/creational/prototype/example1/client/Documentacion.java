package com.design.paterns.creational.prototype.example1.client;

import com.design.paterns.creational.prototype.example1.product.Document;
import java.util.List;

public abstract class Documentacion {

  protected List<Document> documentos;
  public List<Document> getDocumentos() {
    return documentos;
  }
}