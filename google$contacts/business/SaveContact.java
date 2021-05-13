package business;

import java.io.File;
import java.io.PrintWriter;
import com.google.gson.*;
import model.*;

public class SaveContact implements ISaveContact {

 @Override
  public void SaveContactInDisc(String directory, Contacts... contact) {
    Gson g = new Gson();
    for (int i = 0; i < contact.length; i++) {
      File file = new File(directory + File.separator + contact[i].getEmailLabel()+ ".json");
      try {
        PrintWriter archivo = new PrintWriter(file.getAbsolutePath());
        file.createNewFile();
        archivo.println(g.toJson(contact[i]));
        archivo.close();
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }

}
