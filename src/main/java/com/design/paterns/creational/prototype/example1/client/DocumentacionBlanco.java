package com.design.paterns.creational.prototype.example1.client;

import com.design.paterns.creational.prototype.example1.product.Document;
import java.util.ArrayList;

public class DocumentacionBlanco extends Documentacion{
  private static DocumentacionBlanco documentacionBlanco = null;
  private DocumentacionBlanco() {
    documentos = new ArrayList<>();
  }
  public static DocumentacionBlanco instancia() {
    if (documentacionBlanco == null) {
      documentacionBlanco = new DocumentacionBlanco();
    }
    return documentacionBlanco;
  }
  public void incluye(Document documento) {
    documentos.add(documento);
  }
  public void excluye(Document documento) {
    documentos.remove(documento);
  }
}