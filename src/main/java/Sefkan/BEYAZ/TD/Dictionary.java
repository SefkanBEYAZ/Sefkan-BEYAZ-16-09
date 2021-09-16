package Sefkan.BEYAZ.TD;

import java.util.HashMap;
public class Dictionary {
    
    private String name;
    private HashMap<String,String> traduction;

    public Dictionary(){}
    public Dictionary(String name){
        this.name=name;
        this.traduction= new HashMap<>();
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public String getTranslation(String mot){
        
        return this.traduction.get(mot);
    }

    public boolean isEmpty(){

        if (this.getName().isEmpty()) return true;
        else return false;
    }

    public void addTranslation(String mot, String traduction){
        this.traduction.put(mot,traduction);
    }

}
