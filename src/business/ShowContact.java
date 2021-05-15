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

public class ShowContact implements IShowContact {

  @Override
  public void ShowContactInDisk(String directory){
    Gson g = new Gson();
    try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(directory))) {
      for (Path file : stream) {
        System.out.println("-------------------------------------------------");
        Scanner read = new Scanner(new File(directory + File.separator + file.getFileName().toString()));
        while (read.hasNextLine())
          System.out.println(g.fromJson(read.nextLine(), Contacts.class));
        read.close();
      }
    } catch (IOException | DirectoryIteratorException ex) {
      System.err.println(ex);
    }

  }

}
