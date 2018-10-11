import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;


public class MeuConteudo extends JFrame {
	
	public MeuConteudo(){
		Container ct = this.getContentPane();
		ct.setLayout(new FlowLayout());
		
		Icon icone1 = new ImageIcon("imagens/caca.jpg");
		Icon icone2 = new ImageIcon("imagens/carga.jpg");
		Icon icone3 = new ImageIcon("imagens/passageiros.jpg");
		
		JButton b1 = new JButton("Avião de Caça       ", icone1);
		JButton b2 = new JButton("Avião de Carga      ", icone2);
		JButton b3 = new JButton("Avião de Passageiros", icone3);
		
		ct.add(b1);
		ct.add(b2);
		ct.add(b3);
		
		setSize(400,400);
		setTitle("Trabalhando conteúdo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		MeuConteudo mc = new MeuConteudo();
		mc.setVisible(true);
	}

}
