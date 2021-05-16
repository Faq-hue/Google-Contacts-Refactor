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

    
    TagContact tg = new TagContact();
    
    Scanner scanner = new Scanner(System.in);
    String string;
    String string2;
    System.out.println("------------------------------");
    System.out.print("Input For tag: ");
    string = scanner.nextLine();
    System.out.println();
    System.out.print("Input For key: ");
    string2 = scanner.nextLine();
    tg.tag("data", string2, string);
    
    
    System.out.println("------------------------------");
    System.out.print("Input For Search: ");
    string = scanner.nextLine();

    SearchContact sr = new SearchContact();

    
    
    
    
    sr.searchAndShow("data", string);





    scanner.close();
  }
}
