
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class CapturaEventoBotao {

    private JButton botao, botao2;

    public void janela() {

        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        botao = new JButton("Botão 1");
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Botão 1","Botão", JOptionPane.INFORMATION_MESSAGE);
               
                botao.setFont(new Font("SansSerif", Font.BOLD, 20));
            }
        });
        botao2 = new JButton("Botão 2");
        botao2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(frame, "Botão 2","Botão", JOptionPane.INFORMATION_MESSAGE);

                botao2.setFont(new Font("SansSerif", Font.BOLD, 20));
            }

        });

        panel.add(botao);
        panel.add(botao2);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        CapturaEventoBotao captura = new CapturaEventoBotao();
        captura.janela();
    }
}
