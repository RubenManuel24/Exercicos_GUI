
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author RubenManuel
 */
public class CalculadoraJavax extends JFrame{
    BorderLayout bor;
    public CalculadoraJavax(){
        
    super(">>CALCULADORA<<");
 
    Container c = getContentPane();
    c.setLayout(new BorderLayout());
    Font f = new Font("font",Font.PLAIN,20);
    JTextField tex = new JTextField();
    
    tex.setFont(f);
    
    c.add(BorderLayout.NORTH,tex);
    
    Container c2 = new JPanel();
    c2.setLayout(new GridLayout(4,4,6,6));
    c2.add(new JButton("7"));
    c2.add(new JButton("8"));
    c2.add(new JButton("9"));
    c2.add(new JButton("/"));
    c2.add(new JButton("4"));
    c2.add(new JButton("5"));
    c2.add(new JButton("6"));
    c2.add(new JButton("*"));
    c2.add(new JButton("1"));
    c2.add(new JButton("2"));
    c2.add(new JButton("3"));
    c2.add(new JButton("-"));
    c2.add(new JButton("0"));
    c2.add(new JButton("."));
    c2.add(new JButton("="));
    c2.add(new JButton("+"));
    
    c.add(BorderLayout.CENTER, c2);
   
    setSize(300,250);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    
    } 
    
    
}
