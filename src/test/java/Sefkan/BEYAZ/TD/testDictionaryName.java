
package Sefkan.BEYAZ.TD;

import org.junit.Before;
import org.junit.Test;

import static org.harmcrest.MatcherAssert.assertThat;
import static org.harmcrest.Matchers.*;

public class testDictionaryName {
    
    @Test public void TestDictionaryName(){
        assertThat(dict.getName(),equalTo("Example"));

    }
}