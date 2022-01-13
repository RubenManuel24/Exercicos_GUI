
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author RubenManuel
 */
public class Layout extends JFrame{    
       
    public Layout(){
        
        
     /* Container c = getContentPane();
      
      c.add(BorderLayout.EAST, new JButton("Este"));
      c.add(BorderLayout.NORTH, new JButton("Norte"));
      c.add(BorderLayout.WEST,new JButton("Leste"));
      c.add(BorderLayout.SOUTH,new JButton("Sul"));
      c.add(BorderLayout.CENTER, new JButton("Centro"));
      */
      Container a = getContentPane();
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.add( new JButton("A") );
      c.add( new JButton("B") );
      c.add( new JButton("C") );
      c.add( new JButton("D") );
      c.add( new JButton("E") );
     
      a.add(BorderLayout.SOUTH, new JButton("OK"));
     
      
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(400,200);
      setVisible(true);
    }
  
    
}
