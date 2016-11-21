package Commands;

//import java.io.File;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * reading of log file
 */
public class Readd{

    /**
     * reading of file
     */
    public void read() {
        File f  = new File(".//result.txt");
        try(FileReader reader = new FileReader(".//result.txt")) {
            char[] buffer = new char[(int)f.length()];
            reader.read(buffer);
            System.out.println(new String(buffer));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
