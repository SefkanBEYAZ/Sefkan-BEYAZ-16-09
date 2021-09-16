package Sefkan.BEYAZ.TD;

import java.util.HashMap;
public class Dictionary {
    
    private String name;
    private HashMap<String,String> traduction;

    public Dictionary(){}
    public Dictionary(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public String getTranslation(String mot){
        
        if(mot.equals("contre")) return "against";
        else return "pour";
    }

    public boolean isEmpty(){

        if (this.getName().isEmpty()) return true;
        else return false;
    }

}
