//Facundo Zamora, fzamora994@alumnos.iua.edu.ar

package label;

public class GeneralLabel {

  private String label = new String();

  private String data = new String();

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getData() {
    return this.data;
  }

  public void setData(String data) {
    this.data = data;
  }

  @Override
  public String toString() {

    return this.getData() + " " + this.getLabel();

  }

}
