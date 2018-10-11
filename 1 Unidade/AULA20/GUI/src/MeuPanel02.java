import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MeuPanel02 extends JFrame {
	
	public MeuPanel02(){
		Container framePane = this.getContentPane();
		framePane.setLayout(new BorderLayout());
		
		// Definindo os paines 
		JPanel botoes = new JPanel();
		botoes.setLayout(new GridLayout(3,1));
		botoes.add(new JButton("Um"));
		botoes.add(new JButton("Dois"));
		botoes.add(new JButton("Três"));
		
		JPanel lateral = new JPanel();
		lateral.add(botoes);
		
		JPanel controle = new JPanel();
		controle.setLayout(new GridLayout(1,2));
		JButton listar = new JButton("Listar");
		JButton close = new JButton("Fechar");
		controle.add(listar);
		controle.add(close);
		
		// inserindo no Container
		framePane.add(BorderLayout.WEST, lateral);
		framePane.add(BorderLayout.CENTER, controle);
		
		setSize(280,220);
		setTitle("Combinando Paineis");
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}


	public static void main(String[] args) {
		MeuPanel02 mp = new MeuPanel02();
		mp.setVisible(true);
	}
}
