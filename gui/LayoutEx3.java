
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
public class LayoutEx3 extends JFrame {
    
    public LayoutEx3(){
    
        super("Teste3");
        
        Container c = getContentPane();
        
        c.setLayout(new BorderLayout(20,20));
        
        c.add(BorderLayout.CENTER, new JButton("OK"));
        
        
        Container c2 = new JPanel();
        c.setLayout(new GridLayout(5,5));
        c.add(new JButton("A"));
        c.add(new JButton("A"));
        c.add(new JButton("A"));
        c.add(new JButton("A"));
        c.add(new JButton("A"));
        c.add(new JButton("A"));
        c.add(new JButton("A"));  
        c.add(new JButton("A"));                 
        c.add(new JButton("A"));                     
        c.add(new JButton("A"));                        
        c.add(new JButton("A"));               
        c.add(new JButton("A"));
        c.add(new JButton("A"));
        c.add(new JButton("A"));
        c.add(new JButton("A"));
                       
        
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
       
        
        
    
    }
    
}
