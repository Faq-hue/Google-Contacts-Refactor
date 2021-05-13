package business;

import model.Contacts;
import java.io.File;
import java.util.Scanner;
import com.google.gson.Gson;

public class ShowContact {
    public class Listarcontactos {
        public Contacts[] listsContacts(int cant) {
            Gson g = new Gson();
            Contacts[] contacts = new Contacts[5];
            for (int i = 0; i < cant; i++) {
                try {
                    Scanner lectura = new Scanner(new File("datos" + File.separator + "conctacto" + i + ".json"));
                    String datos = "";
                    while (lectura.hasNextLine())
                        datos = lectura.nextLine();
                    contacts[i] = g.fromJson(datos, Contacts.class);
                    lectura.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return contacts;
        }
    }
}

