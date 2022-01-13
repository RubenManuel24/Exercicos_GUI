
package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author RubenManuel
 */
public class ControleLabel extends JFrame{
    
    public ControleLabel(){
        
    super("Labek");
    
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    
    ImageIcon image = new ImageIcon(getClass().getResource("imagem.gif"));
    Font fonte = new Font("serif",Font.BOLD|Font.ITALIC,23);
    JLabel l = new JLabel("STREET BREAK");
    l.setToolTipText("Forte como diamante");
    l.setForeground(Color.CYAN);
    l.setFont(fonte);
    l.setIcon(image);
    c.add(l);
    
    setSize(500,500);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    
    
    
    public static void main(String[] args) {
        
        new ControleLabel();
        
    }
}
