import java.awt.*;
import java.io.*;
import javax.swing.*;
/**
 * Write a description of class BottomView here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BView extends JPanel
{
    private Model model;

    /**
     * Constructor for objects of class BottomView
     */
    public BView() throws FileNotFoundException 
    {
        super();
        
        model = new Model();
        setBackground(Color.white);
    }
}
