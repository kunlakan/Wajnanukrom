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
public class Model extends Observable
{
    //private Controller controller;
    private Map<String, String[]> dictionary;
    private String[]  words;
    private BView bview;

    /**
     * Constructor for class Model
     * @throws FileNotFoundException
     */
    public Model() throws FileNotFoundException {
        dictionary = new TreeMap<String, String[]>();
        readFile();
    }

    /**
     * Reads the given file, "vocabulary.txt", and stores information into a Map, dictionary.
     * @throws FileNotFoundException
     */
    private void readFile() throws FileNotFoundException {
        Scanner input = new Scanner(new File("vocabulary.txt"));
        while(input.hasNextLine()) {
            String key = input.next();
            String[] value = input.next().split(",");
            dictionary.put(key, value);
        }
    }
    
   
    public void updateWords( String key ){
        words = dictionary.get(key);
        setChanged();
        notifyObservers();
    }

    public String getWords(){
        if(words != null){
            String temp = "";
            for(int i = 0; i < words.length; i++){
                temp += words[i] + " ";
            }
            return temp;
        }
        return "";
    }
}
