package Sefkan.BEYAZ.TD;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class Dictionary {
    
    private String name;
    private HashMap<String,String> traduction;
    private HashMap<String,List<String>> traduction_multiple;
    private List<String> list;


    public Dictionary(){}
    public Dictionary(String name){
        this.name=name;
        this.traduction= new HashMap<>();
        this.traduction_multiple= new HashMap<>();
        this.list= new ArrayList<String>();
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

    public List getMultipleTranslation(String mot){
        
        return this.traduction_multiple.get(mot);
    }

    public List getList(){
        return this.list;
    }
    public void setList(String mot){
        this.list.add(mot);
    }

    public boolean isEmpty(){

        if (this.traduction.isEmpty()) return true;
        else return false;
    }

    public void addTranslation(String mot, String traduction){
            this.traduction.put(mot, traduction);
        
    }

    public void addMultipleTranslation(String mot, List<String> traductions){
            this.traduction_multiple.put(mot, traductions);
    
    }

}
