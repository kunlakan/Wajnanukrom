//import java.util.*;
import java.awt.*;
import javax.swing.*;
/**
 * View for Wajnanukrom Dictionary
 * 
 * @author Kunlakan Cherdchusilp
 * @author Vuochly Ky
 * 
 * @version March 21, 2015
 */
public class TView extends JPanel
{
    /**
     * Constructor for class View
     */
    public TView()
    {
        super();
        
        setBackground(Color.LIGHT_GRAY);
        
        JTextField text = new JTextField(30);
        text.addActionListener(new Controller());
        
        add(text);
    }
}
