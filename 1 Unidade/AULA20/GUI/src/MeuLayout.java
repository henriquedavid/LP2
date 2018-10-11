import java.awt.Container;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuLayout extends JFrame{
	
	public MeuLayout(){
		Container ct = this.getContentPane();
		ct.setLayout(null);
		
		Icon icone1 = new ImageIcon("imagens/caca.jpg");
		Icon icone2 = new ImageIcon("imagens/carga.jpg");
		Icon icone3 = new ImageIcon("imagens/passageiros.jpg");
		
		JButton b1 = new JButton("Avião de Caça", icone1);
		JButton b2 = new JButton("Avião de Carga", icone2);
		JButton b3 = new JButton("Avião de Passageiros", icone3);
		
		b1.setBounds(10,20,330,80);
		b2.setBounds(10,110,330,80);
		b3.setBounds(10,200,330,80);
		
		ct.add(b1);
		ct.add(b2);
		ct.add(b3);
		
		setSize(380,350);
		setTitle("Organizando o layout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MeuLayout ml = new MeuLayout();
		ml.setVisible(true);
	}

}
