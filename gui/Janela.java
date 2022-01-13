
package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author RubenManuel
 */
public class Janela extends JFrame{
    
    public Janela(){
        
       
        
    super("Minha Janela");
    
        
    
        setContentPane(new JButton("Ok"));
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    
    }
}
