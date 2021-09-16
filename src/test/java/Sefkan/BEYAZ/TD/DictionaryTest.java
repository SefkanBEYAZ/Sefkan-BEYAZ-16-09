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
    }
    @Test public void TestDictionaryName(){
        
        assertThat(dict.getName(),equalTo("Example"));

    }

    @Test public void DictionaryVide(){

        assertThat(dict.isEmpty(),equalTo(false));

    } 

    @Test public void testOneTranslation() {
        dict.addTranslation("contre", "against");
        assertThat(dict.getTranslation("contre"), equalTo("against"));
}
}