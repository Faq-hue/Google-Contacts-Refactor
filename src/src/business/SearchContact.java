package src.business;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import com.google.gson.Gson;

import src.model.Contacts;

public class SearchContact implements ISearchContact {

  @Override
  public void searchAndShow(String directory, String key) {
    Gson g = new Gson();
    Contacts c = new Contacts();
    try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(directory))) {
      for (Path file : stream) {
        Scanner read = new Scanner(new File(directory + File.separator + file.getFileName().toString()));
        while (read.hasNextLine()) {
          c = g.fromJson(read.nextLine(), Contacts.class);
          if (comparation(c, key)){
            System.out.println("-------------------------------------------------");
            System.out.println(c);
          }
        }
        read.close();
      }
    } catch (IOException | DirectoryIteratorException ex) {
      System.err.println(ex);
    }
  }

  private boolean comparation(Contacts contact, String key) {

    if (contact.getLabel().toLowerCase().trim().equals(key.toLowerCase().trim()))
      return true;

    if (contact.getName().toLowerCase().trim().contains(key.toLowerCase().trim()))
      return true;
    if (contact.getSurname().toLowerCase().trim().contains(key.toLowerCase().trim()))
      return true;

    if (contact.getEmailLabel().toLowerCase().trim().contains(key.toLowerCase().trim()))
      return true;

    return false;
  }

}
