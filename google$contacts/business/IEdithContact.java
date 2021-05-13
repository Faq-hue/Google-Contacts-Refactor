package business;

import model.Contacts;

public interface IEdithContact {
    
    public void edith ( String directory, Contacts contact, Contacts contactEdithed );

    public void delete ( Contacts contact );

    public void replace ();

}
