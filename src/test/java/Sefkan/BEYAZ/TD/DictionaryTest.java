package Sefkan.BEYAZ.TD;

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
        dict.addTranslation("contre", "against");
        dict.setList("against");
        dict.setList("versus");
        dict.addMultipleTranslation("contre", dict.getList());
    }
    @Test public void TestDictionaryName(){
        
        assertThat(dict.getName(),equalTo("Example"));

    }

    @Test public void DictionaryVide(){

        assertThat(dict.isEmpty(),equalTo(false));

    } 

    @Test public void testOneTranslation() {
        assertThat(dict.getTranslation("contre"), equalTo("against"));
    }

    @Test public void TestMultipleTranslation(){
        assertThat(dict.getMultipleTranslation("contre"),equalTo(dict.getList()));
    }
}