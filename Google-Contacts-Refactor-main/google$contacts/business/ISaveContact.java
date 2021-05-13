package business;

import model.Contacts;

public interface ISaveContact {
  public void SaveContactInDisc(String directory,Contacts... contact);
}