package src.business;

import src.model.Contacts;

public interface IEditContact {

  public void edit(String directory, Contacts contact, Contacts contactEdithed);

  public void delete(String directory, Contacts contact);


}
