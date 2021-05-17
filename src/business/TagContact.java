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

public class TagContact implements ITagContact {

  @Override
  public void tag(String directory,String tag, String... key) {
    Gson g = new Gson();
    Contacts c = new Contacts();
    try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(directory))) {
      for (Path file : stream) {
        Scanner read = new Scanner(new File(directory + File.separator + file.getFileName().toString()));
        while (read.hasNextLine()) {
          c = g.fromJson(read.nextLine(), Contacts.class);
          for (int i = 0; i < key.length; i++) {
            if (comparation(c, key[i])) {
              SaveContact sv = new SaveContact();
              c.setLabel(tag);
              sv.SaveContactInDisc(directory, c);
            }
          }
        }
        read.close();
      }
    } catch (IOException | DirectoryIteratorException ex) {
      System.err.println(ex);
    }
  }


  
  private boolean comparation(Contacts contact, String key) {

    if (contact.getName().toLowerCase().trim().equals(key.toLowerCase().trim()))
      return true;
    if (contact.getSurname().toLowerCase().trim().equals(key.toLowerCase().trim()))
      return true;

    if (contact.getEmailLabel().toLowerCase().trim().equals(key.toLowerCase().trim()))
      return true;

    return false;
  }

}
