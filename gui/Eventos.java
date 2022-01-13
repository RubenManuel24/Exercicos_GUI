

package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author RubenManuel
 */

public class Eventos extends JFrame implements ActionListener{
    JButton b;
    public Eventos(){
      super("Eventos");
      
      b = new JButton("OK");
      b.addActionListener(this);
      setContentPane(b);
      
      setSize(500,500);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       b.setText("Já Clicaste");
       System.out.println("Clicou");
    }
    
    
}
