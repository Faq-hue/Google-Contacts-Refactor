package business;

import model.Contacts;
import java.io.File;
import java.io.PrintWriter;
import com.google.gson.*;

public class EdithContact implements IEdithContact {

    Gson g = new Gson();

    @Override
    public void edith(String directory, Contacts contact, Contacts contactEdithed) {

        Gson g = new Gson();

        File file = new File(directory + File.separator + contact.getEmailLabel() + ".json");

        try {
            PrintWriter archivo = new PrintWriter(file.getAbsolutePath());
            file.createNewFile();
            archivo.println(g.toJson(contactEdithed));
            archivo.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public void delete(Contacts contact) {

    }

    @Override
    public void replace() {
        // TODO Auto-generated method stub

    }

}
