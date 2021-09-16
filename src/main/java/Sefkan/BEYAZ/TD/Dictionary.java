package Sefkan.BEYAZ.TD;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class Dictionary {
    
    private String name;
    private HashMap<String,List<String>> traduction_multiple;
    private List<String> list;


    public Dictionary(){}
    public Dictionary(String name){
        this.name=name;
        this.traduction_multiple= new HashMap<>();
        this.list= new ArrayList<String>();
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public List<String> getTranslation(String mot){
        
        return this.traduction_multiple.get(mot);
    }

    public List getList(){
        return this.list;
    }
    public void setList(String mot){
        this.list.add(mot);
    }

    public boolean isEmpty(){

        if (this.traduction_multiple.isEmpty()) return true;
        else return false;
    }

    public void addTranslation(String mot, String traduction){
            list.clear();
            list.add(traduction);
            this.traduction_multiple.put(mot,list);
        
    }

    public void addMultipleTranslation(String mot, List<String> traductions){
            this.traduction_multiple.put(mot, traductions);
    
    }

    public String GetInverse(String traduction){
        String ret= null;
        for(String key: this.traduction_multiple.keySet())
            for(String i: this.getTranslation(key)){
                if(i == traduction){
                    ret=key;
                }
            }
            return ret;
    }

}
