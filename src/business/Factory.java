package src.business;

public class Factory {
    public static IEditContact buildEditContact(){
        return new EditContact();
    }
    public static ISaveContact bISaveContact(){
        return new SaveContact();
    }
    public static ISearchContact bISearchContact(){
        return new SearchContact();
    }
    public static IShowContact bIShowContact(){
        return new ShowContact();
    }
    public static ITagContact bITagContact(){
        return new TagContact();
    }
}
