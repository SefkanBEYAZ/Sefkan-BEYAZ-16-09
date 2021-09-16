package Sefkan.BEYAZ.TD;

import java.io.IOException;
import java.io.Reader;

public class BufferedReader {
    private BufferedReader reader;
    private Reader readered;
    

    public BufferedReader(Reader readered){
        this.readered=readered;
    }
    public String readLine() throws IOException {
        return reader.readLine();
        }

}
