import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CapturaEvento implements ActionListener {
	
	private JButton botao;
	
	public void janela() {
		
		JFrame frame = new JFrame();
		
		botao = new JButton();
		botao.setText("Esperando click");
		botao.addActionListener(this);
		
		frame.getContentPane().add(botao);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Testando Botão");
		frame.setSize(350,230);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		botao.setFont(new Font("Courier", Font.BOLD, 20));
		botao.setText("Botão foi clicado!");
	}

	public static void main(String[] args) {
		CapturaEvento cpe = new CapturaEvento();
		cpe.janela();
	}

}
