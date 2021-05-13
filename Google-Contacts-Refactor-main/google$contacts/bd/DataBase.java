//Facundo Zamora, fzamora994@alumnos.iua.edu.ar

package bd;

import model.Contacts;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

  List<Contacts> dataBase = new ArrayList<Contacts>();

  public List<Contacts> getDataBase() {

    return dataBase;
  }

  public void show() {

    for (int i = 0; i < dataBase.size(); i++) {

      show(i);

    }

  }

  public void show(int i) {

    System.out.println((i + 1) + ") " + dataBase.get(i));

  }

  public void add(Contacts... c) {

    for (Contacts contact : c) {

      dataBase.add(contact);
    }

  }

  public void edit(Contacts c, int index) {

    dataBase.add(index, c);

  }

  public void delete(int index) {

    dataBase.remove(index);

  }

}
