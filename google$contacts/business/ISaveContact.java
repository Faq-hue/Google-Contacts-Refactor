package src.business;

import src.model.Contacts;

public interface ISaveContact {
  public void SaveContactInDisc(String directory,Contacts... contact);
}
