import java.awt.*;
import javax.swing.*;
import java.io.*;
/**
 * View for Wajnanukrom Dictionary
 * 
 * @author Kunlakan Cherdchusilp
 * @author Vuochly Ky
 * 
 * @version March 21, 2015
 */
public class TView extends JPanel{
    private Model model;
    /**
     * Constructor for class View
     */
    public TView(Model m) throws FileNotFoundException {
        super();
        model = m; 
        setBackground(Color.LIGHT_GRAY);
        Font khmerFont = new Font("Khmer MN", Font.PLAIN, 14);
        
        JTextField text = new JTextField(30);
        text.setFont(khmerFont);
        text.addActionListener(new Controller(model));
        
        add(text);
        
    }
}
