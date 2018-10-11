import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CriaEvento extends JFrame {
	
	private Toolkit toolkit;

	public CriaEvento() {
		Container container = this.getContentPane();
		container.setLayout(new BorderLayout());
		
		JPanel controle = new JPanel();
		controle.setLayout(new GridLayout(1,2));
		
		JButton beep = new JButton("Clicar");
		JButton close = new JButton("Fechar");
		controle.add(beep);
		controle.add(close);
		
		container.add(BorderLayout.CENTER, controle);
		
		setSize(350,230);
		setTitle("Testando Botões");
		
		// programação dos botões
		toolkit = getToolkit();
		beep.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					toolkit.beep();
			}
		});
				
		close.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);	
				}
		});
	}
	
	public static void main(String[] args) {
		CriaEvento ce = new CriaEvento();
		ce.setVisible(true);
	}
}
