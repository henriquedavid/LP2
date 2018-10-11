package pac2;

import javax.swing.JFrame;

public class MinhaJanela extends JFrame {
	
	public MinhaJanela() {
		setSize(400,350);
		setTitle("Minha Primeira Janela");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		MinhaJanela mj = new MinhaJanela();
		mj.setVisible(true);
	}	
}

