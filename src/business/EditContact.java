package src.business;

import src.model.Contacts;
import java.io.File;
import java.io.PrintWriter;
import com.google.gson.*;

class EditContact implements IEditContact {

  @Override
  public void edit(String directory, Contacts contact, Contacts contactEdithed) {
    Gson g = new Gson();
    this.delete(directory, contact);
    File file = new File(
        directory + File.separator + contactEdithed.getName() + contactEdithed.getSurname() + " " + ".json");
    try {
      PrintWriter archivo = new PrintWriter(file.getAbsolutePath());
      archivo.println(g.toJson(contactEdithed));
      archivo.close();
    } catch (Exception e) {
      System.out.println(e);
    }

  }

  @Override
  public void delete(String directory, Contacts contact) {
    File file = new File(directory + File.separator + contact.getName() + contact.getSurname() + " " + ".json");
    file.delete();
  }

}
