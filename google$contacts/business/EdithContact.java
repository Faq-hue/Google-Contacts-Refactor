package business;

import model.Contacts;
import java.io.File;
import java.io.PrintWriter;
import com.google.gson.*;

public class EdithContact implements IEdithContact {

    Gson g = new Gson();

    @Override
    public void edith(String directory, Contacts contact, Contacts contactEdithed) {

        //the contact that is passed must be the same with the pertinent changes

        File file = new File(directory + File.separator + contact.getName() + contact.getSurname() + " "
        + contact.hashCode() + ".json");

        try {
            PrintWriter archivo = new PrintWriter(file.getPath());
            file.createNewFile();
            archivo.println(g.toJson(contactEdithed));
            archivo.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }


    @Override
    public void delete( String directory, Contacts contact ) {

        File file = new File(directory + File.separator + contact.getName() + contact.getSurname() + " "
        + contact.hashCode() + ".json");

        file.delete();
        
    }

}
