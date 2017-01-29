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
    private Map<String, List<String>> dictionary;
    private List<String> words;
    private BView bview;

    /**
     * Constructor for class Model
     * @throws FileNotFoundException
     */
    public Model() throws FileNotFoundException {
        dictionary = new HashMap<String, List<String>>();
        readFile();
    }

    /**
     * Reads the given file, "vocabulary.txt", and stores information into a Map, dictionary.
     * @throws FileNotFoundException
     */
    private void readFile() throws FileNotFoundException {
        Scanner input = new Scanner(new File("vocabulary.txt"));
        List<String> value;
        
        while(input.hasNextLine()) {
            String key = input.next();
            value = new ArrayList<String>(Arrays.asList(input.next().split(",")));
            
            // Key -> Values
            dictionary.put(key, value);
            
            // Values -> Key
            for(String eachValue: value){
                if(dictionary.containsKey(eachValue)){
                    dictionary.get(eachValue).add(key);
                }
                else{
                    List<String> newList = new ArrayList<String>();
                    newList.add(key);
                    dictionary.put(eachValue, newList);
                }
            }
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
            for(int i = 0; i < words.size(); i++){
                temp += words.get(i) + " ";
            }
            return temp;
        }
        return "";
    }
}
