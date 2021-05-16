package src.business;

public class Factory {
    public IEditContact buildEditContact(){
        return new EditContact();
    }
    public ISaveContact bISaveContact(){
        return new SaveContact();
    }
    public ISearchContact bISearchContact(){
        return new SearchContact();
    }
    public IShowContact bIShowContact(){
        return new ShowContact();
    }
    public ITagContact bITagContact(){
        return new TagContact();
    }
}
