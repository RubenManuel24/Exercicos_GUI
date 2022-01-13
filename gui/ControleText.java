
package gui;

import com.sun.glass.ui.Size;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.text.StyleConstants.Size;
/**
 *
 * @author RubenMnuel
 */
public class ControleText extends JFrame implements ActionListener{
    
    JTextField texto;
    JPasswordField password;
    JButton ok;
    JButton cancelar;
   
    public ControleText(){
        super("Texto e Senha");
        
        texto = new JTextField();
        password = new JPasswordField();
        ok = new JButton("OK");
        cancelar = new JButton("Cancelar");
        
        ok.addActionListener(this);
        cancelar.addActionListener(this);
        
        Container c = getContentPane();
        c.setLayout(new GridLayout(3,2));
        
       Size site = new Size(15,10);
        c.add(new JLabel("Login:"));
        c.add(texto);
        c.add(new JLabel("Senha:"));
        c.add(password);
        c.add(ok);
        c.add(cancelar);
    
    setVisible(true);
    setSize(400,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==ok){
        
            String s = texto.getText()+"\n"+(new String(password.getPassword()));
            
            JOptionPane.showMessageDialog(null, s);
                
        }
        
        else if(e.getSource()==cancelar){
        
           texto.setText("");
           password.setText("");
        }
        
    }
}
