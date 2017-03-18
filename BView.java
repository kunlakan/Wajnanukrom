import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

/**
 * Write a description of class BottomView here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BView extends JPanel implements Observer
{
    private Model model;
    private String message;
    /**
     * Constructor for objects of class BottomView
     */
    public BView(Model m) throws FileNotFoundException {
        super();
        
        model = m;
        setBackground(Color.white);
        Font thaiFont = new Font("Roboto", Font.PLAIN, 20);
        setFont(thaiFont);
    }
    //public void updateMessage(String msg){
    //    message = msg;
    //}
    
    public void update(Observable m, Object o){
        repaint();
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString(model.getWords(), 0, 20);
        
        //g.fillRect(150, 5, 5, 445);
    }
}

