
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author RubenManuel
 */
public class Layout2 extends JFrame{
    
    public Layout2(){
    
        super("LAYOUT2");
        
        Container c = getContentPane();
       
         
        c.setLayout(new BorderLayout());
        c.add(BorderLayout.CENTER, new JButton("CENTER"));
        
        Container c2 = new JPanel();
        setLayout(new GridLayout(4,1));
        c2.add(new JButton("OK"));
        c2.add(new JButton("CANCEL"));
        c2.add(new JButton("SETUP"));
        c2.add(new JButton("HELP"));
        
       
        c.add(BorderLayout.EAST, c2);
        /*
         c.setLayout(new BorderLayout(15,15));
        c.add(BorderLayout.NORTH, new JButton("N"));
        c.add(BorderLayout.SOUTH, new JButton("S"));
        c.add(BorderLayout.CENTER, new JButton("C"));
        c.add(BorderLayout.EAST, new JButton("E"));
        c.add(BorderLayout.WEST, new JButton("W"));
              
        
        c.setLayout(new GridLayout(2,3));
        c.add(new JButton("1"));
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        c.add(new JButton("4"));
        c.add(new JButton("5"));
        c.add(new JButton("6"));  
        */
        
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
