//Facundo Zamora, fzamora994@alumnos.iua.edu.ar

package src.model;

import java.util.ArrayList;
import java.util.Objects;

public class Contacts {

  // general label
  private ArrayList<GeneralLabel> phoneLabel = new ArrayList<GeneralLabel>();
  private ArrayList<GeneralLabel> emailLabel = new ArrayList<GeneralLabel>();
  private GeneralLabel eventsLabel = new GeneralLabel();
  private GeneralLabel webLabel = new GeneralLabel();
  private GeneralLabel webCallLabel = new GeneralLabel();
  private GeneralLabel relationshipLabel = new GeneralLabel();
  private GeneralLabel chatLabel = new GeneralLabel();
  private GeneralLabel personalizedLabel = new GeneralLabel();

  // name, surname, etc
  private String name;
  private String surname;
  private String nickname;

  // personal dates
  private String birth;
  private String relationship;

  // country
  private String country;

  // business
  private String business;
  private String position;
  private String departament;

  // direction
  private String direction;
  private String direction2;
  private String postalCode;
  private String city;
  private String province;
  private String postalMail;

  // weird things
  private String preffix;
  private String suffix;
  private String phoneticName;
  private String phoneticSecondName;
  private String phoneticSurname;
  private String fileAs;

  // string things
  private String notes;

  // label
  private String label;

  // methods
  public String getPhoneLabel() {
    return phoneLabel.toString();
  }

  public void setListPhoneLabel(String data, String label) {

    GeneralLabel a = new GeneralLabel();

    a.setData(data);
    a.setLabel(label);

    phoneLabel.add(a);

  }

  public String getEmailLabel() {
    return emailLabel.toString();
  }

  public void setListEmailLabel(String data, String label) {

    GeneralLabel e = new GeneralLabel();

    e.setData(data);
    e.setLabel(label);

    emailLabel.add(e);

  }

  public String getEventsLabel() {
    return eventsLabel.toString();
  }

  public void setEventsLabel(String data, String label) {

    try {

      validation(data);
      eventsLabel.setData(data);

    } catch (Exception e) {
      System.out.println(e);
    }

    try {

      validation(label);
      eventsLabel.setLabel(label);

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getWebLabel() {
    return webLabel.toString();
  }

  public void setWebLabel(String data, String label) {

    try {

      validation(data);
      webLabel.setData(data);

    } catch (Exception e) {
      System.out.println(e);
    }

    try {

      validation(label);
      webLabel.setLabel(label);

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getWebCallLabel() {
    return webCallLabel.toString();
  }

  public void setWebCallLabel(String data, String label) {

    try {

      validation(data);
      webCallLabel.setData(data);

    } catch (Exception e) {
      System.out.println(e);
    }

    try {

      validation(label);
      webCallLabel.setLabel(label);

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getRelationshipLabel() {
    return relationshipLabel.toString();
  }

  public void setRelationshipLabel(String data, String label) {

    try {

      validation(data);
      relationshipLabel.setData(data);

    } catch (Exception e) {
      System.out.println(e);
    }

    try {

      validation(label);
      relationshipLabel.setLabel(label);

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getChatLabel() {
    return chatLabel.toString();
  }

  public void setChatLabel(String data, String label) {

    try {

      validation(data);
      chatLabel.setData(data);

    } catch (Exception e) {
      System.out.println(e);
    }

    try {

      validation(label);
      chatLabel.setLabel(label);

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getPersonalizedLabel() {
    return personalizedLabel.toString();
  }

  public void setPersonalizedLabel(String data, String label) {

    try {

      validation(data);
      personalizedLabel.setData(data);

    } catch (Exception e) {
      System.out.println(e);
    }

    try {

      validation(label);
      personalizedLabel.setLabel(label);

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {

    try {

      validation(label);
      this.label = label;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {

    try {

      validation(name);

      this.name = name;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getSurname() {
    return this.surname;
  }

  public void setSurname(String surname) {

    try {

      validation(surname);

      this.surname = surname;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {

    this.country = country;

  }

  public String getNickname() {
    return this.nickname;
  }

  public void setNickname(String nickname) {

    try {

      validation(nickname);
      this.nickname = nickname;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getBirth() {
    return this.birth;
  }

  public void setBirth(String birth) {

    try {

      validation(birth);
      this.birth = birth;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getRelationship() {
    return this.relationship;
  }

  public void setRelationship(String relationship) {

    try {

      validation(relationship);
      this.relationship = relationship;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getBusiness() {
    return this.business;
  }

  public void setBusiness(String business) {

    try {

      validation(business);

      this.business = business;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getPosition() {
    return this.position;
  }

  public void setPosition(String position) {

    try {

      validation(position);
      this.position = position;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getDepartament() {
    return this.departament;
  }

  public void setDepartament(String departament) {

    try {

      validation(departament);
      this.departament = departament;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getDirection() {
    return this.direction;
  }

  public void setDirection(String direction) {

    try {

      validation(direction);
      this.direction = direction;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getDirection2() {
    return this.direction2;
  }

  public void setDirection2(String direction2) {

    try {

      validation(direction2);
      this.direction2 = direction2;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getPostalCode() {
    return this.postalCode;
  }

  public void setPostalCode(String postalCode) {

    try {

      validation(postalCode);
      this.postalCode = postalCode;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {

    try {

      validation(city);
      this.city = city;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getProvince() {
    return this.province;
  }

  public void setProvince(String province) {

    try {

      validation(province);
      this.province = province;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getPostalMail() {
    return this.postalMail;
  }

  public void setPostalMail(String postalMail) {

    try {

      validation(postalMail);
      this.postalMail = postalMail;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getPreffix() {
    return this.preffix;
  }

  public void setPreffix(String preffix) {

    try {

      validation(preffix);
      this.preffix = preffix;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getSuffix() {
    return this.suffix;
  }

  public void setSuffix(String suffix) {

    try {

      validation(suffix);
      this.suffix = suffix;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getPhoneticName() {
    return this.phoneticName;
  }

  public void setPhoneticName(String phoneticName) {

    try {

      validation(phoneticName);
      this.phoneticName = phoneticName;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getPhoneticSecondName() {
    return this.phoneticSecondName;
  }

  public void setPhoneticSecondName(String phoneticSecondName) {

    try {

      validation(phoneticSecondName);
      this.phoneticSecondName = phoneticSecondName;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getPhoneticSurname() {
    return this.phoneticSurname;
  }

  public void setPhoneticSurname(String phoneticSurname) {

    try {

      validation(phoneticSurname);
      this.phoneticSurname = phoneticSurname;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getFileAs() {
    return this.fileAs;
  }

  public void setFileAs(String fileAs) {

    try {

      validation(fileAs);
      this.fileAs = fileAs;

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  public String getNotes() {
    return this.notes;
  }

  public void setNotes(String notes) {

    this.notes = notes;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name,emailLabel,surname);
  }

  public void validation(String word) {

    for (int i = 0; i < word.length(); i++) {

      char c = word.trim().charAt(i);

      if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {

        throw new IllegalArgumentException(
            "Invalid parameter: " + word + ". Only English alphabet characters are allowed.");
      }
    }

  }

  @Override
  public String toString() {

    String ts = "Name: " + this.getName() + "\nSurname: " + this.getSurname() + "\nPhone and label: "
        + this.phoneLabel.toString() + "\nCountry: " + this.country + "\nEmail and label: " + this.emailLabel.toString()
        + "\nContact label: " + this.label;

    return ts;
  }

}
