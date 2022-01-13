
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
public class LayoutEx2 extends JFrame{
    
    public LayoutEx2(){
    
        super("Teste2");
        
        Container c = getContentPane();
        
        c.setLayout(new BorderLayout());
        c.add(BorderLayout.CENTER, new JButton("OK"));
    
        Container c2 = new JPanel();
        c2.setLayout(new GridLayout(4,5));
        c2.add(new JButton("1"));
        c2.add(new JButton("2"));
        c2.add(new JButton("3"));
        c2.add(new JButton("4"));
        c2.add(new JButton("5"));
        c2.add(new JButton("6"));
        c2.add(new JButton("7"));
        c2.add(new JButton("8")); 
        c2.add(new JButton("9"));
        c2.add(new JButton("10"));
        c2.add(new JButton("11")); 
        c2.add(new JButton("12"));
        c2.add(new JButton("13"));
        c2.add(new JButton("14"));
        c2.add(new JButton("15"));
        c2.add(new JButton("16"));
        c2.add(new JButton("17"));
        c2.add(new JButton("14"));
        c2.add(new JButton("15"));
        c2.add(new JButton("16"));
        c2.add(new JButton("17"));
        c2.add(new JButton("18"));
        c2.add(new JButton("19"));
        c2.add(new JButton("20"));
        
        c.add(BorderLayout.NORTH, c2);

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
