
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author RubenManuel
 */
public class EventosEx2 extends JFrame implements ActionListener{
     JButton b0,b1,b2,b3,b4;
    public EventosEx2(){
        
      super("EventosEx2");
      
      Container c = getContentPane();
      c.setLayout(new BorderLayout());
      
      c.add(BorderLayout.CENTER, b0 = new JButton("STAR"));
      
      b0.addActionListener(this);
       
      Container c2 = new JPanel();
      c2.setLayout(new GridLayout(4,1));
      
        c2.add(new JButton("OK"));
        c2.add(new JButton("CANCEL"));
        c2.add( new JButton("SETUP"));
        c2.add(new JButton("HELP"));
        
       c.add(BorderLayout.EAST, c2);
         
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    
      setSize(500,500);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        b0.setText("STAR FEITO");
        b1.setText("OK FEITO");
        b2.setText("UNCANCEL");
        b2.setText("SETUP");
        b4.setText("SETUP FEITO");
    }

    
    public static void main(String[] args) {
        
         EventosEx2 eventosEx2 = new EventosEx2();
    }

}
