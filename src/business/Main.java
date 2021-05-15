package src.business;

import java.util.Scanner;

import src.model.Contacts;
import src.model.GenerateContact;

public class Main {
  public static void main(String[] args) {
    Contacts[] c = new Contacts[3];
    for (int i = 0; i < c.length; i++) {
      c[i] = GenerateContact.contactGenerator();
    }

    SaveContact sv = new SaveContact();
    
    sv.SaveContactInDisc("data",c);

    ShowContact sh = new ShowContact();

    sh.ShowContactInDisk("data");

    Scanner scanner = new Scanner(System.in);
    String string;
    System.out.println("------------------------------");
    System.out.print("Input For Search: ");
    string = scanner.nextLine();

    SearchContact sr = new SearchContact();

    sr.searchAndShow("data", string);


    scanner.close();
  }
}
