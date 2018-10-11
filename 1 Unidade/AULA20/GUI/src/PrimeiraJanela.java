
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class PrimeiraJanela {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha Primeira Janela");

        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        //JLabel label = new JLabel("Hello World!! Say Hello!");
        
        JButton btn1  = new JButton("OK1");
        JButton btn2  = new JButton("OK2");
        JButton btn3  = new JButton("OK3");
        JButton btn4  = new JButton("OK4");
        JButton btn5  = new JButton("OK5");
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        //frame.add(label);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
