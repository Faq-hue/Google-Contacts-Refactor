//Facundo Zamora, fzamora994@alumnos.iua.edu.ar

package src.model;

import java.util.Random;

public class GenerateContact {

  public static Contacts contactGenerator() {
    Contacts contact = new Contacts();

    contact.setName(generateName());
    contact.setSurname(generateSurname());
    contact.setBusiness(generateBusiness());
    contact.setPosition(generatePosition());
    contact.setListEmailLabel(generateMail(), generateLabel());
    contact.setListEmailLabel(generateMail(), generateLabel());
    contact.setListPhoneLabel(generatePhoneNumber(), generateLabel());
    contact.setListPhoneLabel(generatePhoneNumber(), generateLabel());
    contact.setListPhoneLabel(generatePhoneNumber(), generateLabel());
    contact.setCountry(generateCountry());
    contact.setLabel(generateLabel());

    return contact;
  }

  public static String mail;

  public static String generateName() {

    String name[] = { "Facundo", "Dario", "Santiago", "Kevin", "Thais", "Angelo", "Milagros", "Sofia", "Gabriel",
        "Enzo", "Karen", "Micaela", "Ezequiel", "Yair", "Tomas", "Britney", "Taylor", "Camila", "Joaquin", "Nicolas" };

    Random r = new Random();

    int x = r.nextInt(19);

    mail = name[x];

    return name[x];
  }

  public static String generateSurname() {

    String surname[] = { "Zamora", "Yanes", "Sosa", "Zavala", "Sanabria", "Musa", "Escudero", "Manfredi", "Spears",
        "Swift", "Cortez", "Ikari", "Varela", "Gomez", "Maldonado", "Vega", "Arevalo", "Gomez", "Peralta", "Ponce" };

    Random r = new Random();

    int x = r.nextInt(19);

    mail = mail + surname[x];

    return surname[x];
  }

  public static String generateBusiness() {

    String business[] = { "Apple", "Google", "Sony", "Samsung", "LG", "Rexona", "Lakai", "Ford", "Fiat", "Nerv",
        "Spotify", "McDonalds", "BMW", "SpaceX", "Adidas", "Nestle", "Heineken", "Micrososft", "Subway", "Casio" };

    Random r = new Random();

    int x = r.nextInt(19);

    return business[x];
  }

  public static String generatePosition() {

    String position[] = { "CEO", "Ingeniero", "Lavaplatos", "Cocinero", "Asistente", "Tecnico", "Gerente",
        "RecursosHumanos", "Administrador", "Vendedor", "Analista", "Ejecutivo", "CommunityManager", "Supervisor",
        "Auditor", "Chofer", "LiquidadorDeSueldos", "Consultor", "Webmaster", "Programador" };

    Random r = new Random();

    int x = r.nextInt(19);

    return position[x];
  }

  public static String generatePhoneNumber() {

    Random r = new Random();

    int first = r.nextInt(10000) + 1;
    int second = r.nextInt(10000) + 1;

    String x = first + "" + second;

    return x;
  }

  public static String generateMail() {

    String domain[] = { "@gmail.com", "@hotmail.com", "@protonmail.com", "@alumnos.iua.edu.ar", "@iua.edu.ar" };

    Random r = new Random();

    int x = r.nextInt(4);

    return mail + domain[x];
  }

  public static String generateCountry() {

    Random r = new Random();

    Countries c = new Countries();

    return c.selectCountry(r.nextInt(193) + 1);
  }

  public static String generateLabel() {

    String[] label = { "Friends", "Family", "Work", "School", "Gym" };

    Random r = new Random();

    int x = r.nextInt(4);

    return label[x];
  }

}