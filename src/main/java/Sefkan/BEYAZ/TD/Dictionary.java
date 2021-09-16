package Sefkan.BEYAZ.TD;

public class Dictionary {
    
    private String name;

    public Dictionary(){}
    public Dictionary(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public String getTranslation(String mot){
        return "against";
    }

    public boolean isEmpty(){

        if (this.getName().isEmpty()) return true;
        else return false;
    }

}
