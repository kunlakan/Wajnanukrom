import java.awt.event.*;
import java.io.*;
/**
 * Write a description of class Controller here.
 * 
 * @author Kunlakan Cherdchusilp
 * @author Vuochly Ky
 * 
 * @version (a version number or a date)
 */
public class Controller implements ActionListener{
    private Model model;
    
    /**
     * Constructor for Controller
     */
    public Controller(Model m) throws FileNotFoundException{
        model = m;
    }
    
    /**
     * Perform an appropriate action
     * @param e is an event
     */
    public void actionPerformed(ActionEvent e){
        //get the input from top view
        //search for that input in the model
        //display the value in the bottom view
        model.updateWords(e.getActionCommand());
    }
}
