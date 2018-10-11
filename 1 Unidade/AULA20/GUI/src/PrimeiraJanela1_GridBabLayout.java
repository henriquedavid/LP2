
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class PrimeiraJanela1_GridBabLayout {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha Primeira Janela");

        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        //JLabel label = new JLabel("Hello World!! Say Hello!");
        
        JButton btn1  = new JButton("Botão 1");
        JButton btn2  = new JButton("Botão 2");
        JButton btn3  = new JButton("Botão 3");
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(btn1, gbc);
        
        gbc.gridx = 3;
        panel.add(btn2, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(btn3, gbc);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
