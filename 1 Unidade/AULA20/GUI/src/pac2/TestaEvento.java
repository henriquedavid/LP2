import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestaEvento extends JFrame implements ActionListener{
	
	private Toolkit toolkit;
	private JPanel controle;
	private JButton beep;
	private JButton close;
	
	public TestaEvento() {
		Container container = this.getContentPane();
		container.setLayout(new BorderLayout());
		
		controle = new JPanel();
		controle.setLayout(new GridLayout(1,2));
		
		beep = new JButton("Clicar");
		close = new JButton("Fechar");
		controle.add(beep);
		controle.add(close);
		
		// evento dos botões
		beep.addActionListener(this);		
		close.addActionListener(this);
		
		container.add(BorderLayout.CENTER, controle);
		
		setSize(350,230);
		setTitle("Testando Botões 02");
	}

	public static void main(String[] args) {
		TestaEvento te = new TestaEvento();
		te.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == beep){
			toolkit.beep();
		}
		else {
			System.exit(0);
		}
	}
}
