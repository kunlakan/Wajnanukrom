import java.io.*;
import java.awt.*;
import javax.swing.*;
/**
 * 
 * 
 * @author Kunlakan Cherdchusilp
 * @author Vuochly Ky
 * 
 * @version (a version number or a date)
 */
public class Frame extends JFrame {
    private TView TopView;
    private BView BottomView;
    private Model model;

    /**
     * Constructor for class Frame
     */
    public Frame() throws FileNotFoundException{
        super("Wajnanukrom Th-Kh Dictionary");
        
        model = new Model();
        TopView = new TView(model);
        BottomView = new BView(model);
        
        model.addObserver(BottomView);
        
        setFrameProperty();
    }
    
    /**
     * Sets property of the frame
     */
    private void setFrameProperty()
    {
        setSize(400, 400);
        setResizable(false);

        getContentPane().add(TopView, BorderLayout.NORTH);
        getContentPane().add(BottomView, BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
