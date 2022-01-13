
package gui;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author RubenManuel
 */
public class EventosEx extends JFrame implements FocusListener {
    JButton botao;
    
    public EventosEx(){
    super("EventosEx");
    
    botao = new JButton("Inicial");
    setContentPane(botao);
    
    botao.addFocusListener(this);
    
    setSize(1000,1000);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
            
    }

    @Override
    public void focusGained(FocusEvent e) {
       botao.setText("ABERTO");
    }

    @Override
    public void focusLost(FocusEvent e) {
       botao.setText("FECHADO");
    }
    
    
    public static void main(String[] args) {
        
        new EventosEx();
        
    }
}
