
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author FATIMA30
 */
public class Layout2Ex1 extends JFrame {
    
    public  Layout2Ex1(){
        
    super("Teste1");
    
    Container c = getContentPane();
    c.setLayout(new BorderLayout());
    c.add(BorderLayout.CENTER, new JButton("STAR"));
    
    Container c2 = new JPanel();
    c2.setLayout(new GridLayout(5,1));
    c2.add(new JButton("OK"));
    c2.add(new JButton("CANCEL"));
    c2.add(new JButton("SETUP"));
    c2.add(new JButton("STOP"));
    c2.add(new JButton("HELP"));
    
    c.add(BorderLayout.EAST, c2);
    
    
    setVisible(true);
    setSize(500,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    
    
}
