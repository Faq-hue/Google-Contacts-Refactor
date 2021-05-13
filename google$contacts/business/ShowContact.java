package business;

import model.Contacts;
import java.io.File;
import java.util.Scanner;
import com.google.gson.Gson;

public class ShowContact {
    public class showContactinDisc{
        public Contacts[] listsContacts(int cant) {
            Gson g = new Gson();
            Contacts[] contacts = new Contacts[5];
            for (int i = 0; i < cant; i++) {
                try {
                    Scanner read = new Scanner(new File("data" + File.separator + "conctact" + i + ".json"));
                    String data = "";
                    while (read.hasNextLine())
                        data = read.nextLine();
                    contacts[i] = g.fromJson(data, Contacts.class);
                    lectura.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return contacts;
        }
    }
}
