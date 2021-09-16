package Sefkan.BEYAZ.TD;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DictionaryTest {
    
    private Dictionary dict;
    
    @Before
    public void initialize(){
        dict= new Dictionary("Example");
        List<String> traduc = new ArrayList<>();
        dict.addTranslation("mot", "word");
        traduc.add("against");
        traduc.add("versus");
        dict.addMultipleTranslation("contre", traduc);
       
    }
    @Test public void TestDictionaryName(){
        
        assertThat(dict.getName(),equalTo("Example"));

    }

    @Test public void DictionaryVide(){

        assertThat(dict.isEmpty(),equalTo(false));

    } 

    @Test public void testOneTranslation() {

        List<String> traduc = new ArrayList<>();
        traduc.add("against");
        traduc.add("versus");
        assertThat(dict.getTranslation("contre"), equalTo(traduc));
    }

    @Test public void TestMultipleTranslation(){
        dict.setList("against");
        dict.setList("versus");
        dict.addMultipleTranslation("contre", dict.getList());
        assertThat(dict.getTranslation("contre"),equalTo(dict.getList()));
    }
}