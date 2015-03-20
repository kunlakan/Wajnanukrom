import java.io.*;
import java.util.*;

/**
 * Write a description of class Model here.
 * 
 * @author Kunlakan Cherdchusilp
 * @author Vuochly Ky
 * 
 * @version (a version number or a date)
 */
public class Model
{
    View view;
    Controller controller;

    Map<String, String[]> dictionary;

    /**
     * Constructor for class Model
     */
    public Model() throws FileNotFoundException {
        dictionary = new TreeMap<String, String[]>();
        
        readFile();
    }

    private void readFile() throws FileNotFoundException {
        Scanner input = new Scanner(new File("vocabulary.txt"));
        while(input.hasNextLine()) {
            String key = input.next();
            String[] value = input.next().split(",");
            dictionary.put(key, value);
        }
    }
}
