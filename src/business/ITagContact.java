package src.business;

import src.model.Contacts;

public interface ITagContact {
  void tag(String tag,Contacts... contacts);
}
