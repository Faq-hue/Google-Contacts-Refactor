//Facundo Zamora, fzamora994@alumnos.iua.edu.ar

package src.model;

import java.util.ArrayList;
import java.util.Locale;

class Countries {

  static ArrayList<String> getCountries() {

    Locale[] localeCountries = Locale.getAvailableLocales();

    ArrayList<String> countries = new ArrayList<String>();

    for (int j = 0; j < localeCountries.length; j++) {

      if (localeCountries[j].getDisplayCountry() != "") {

        countries.add(localeCountries[j].getDisplayCountry());

      }

    }

    return countries;
  }

  public String selectCountry(int x) {

    ArrayList<String> countries = getCountries();

    return countries.get(x);

  }

}