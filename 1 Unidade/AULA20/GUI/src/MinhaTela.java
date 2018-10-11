import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MinhaTela extends  JFrame{
	
	private JLabel lnome 	= new JLabel("Nome.: ");;
	private JLabel lidade	= new JLabel("Idade: ");;
	private JLabel lcpf		= new JLabel("CPF..: ");;
	private JLabel lrg		= new JLabel("RG...: ");
	
	private Font f	= new Font("Courier", Font.PLAIN, 12);
	
	private JTextField tnome  = new JTextField();
	private JTextField tidade = new JTextField();
	private JTextField tcpf   = new JTextField();
	private JTextField trg    = new JTextField();
	
	private JButton b1 = new JButton("Submeter");
	private JButton b2 = new JButton("Limpar");
	
	public MinhaTela(){
		Container ct = this.getContentPane();
		ct.setLayout(null);
		
		lnome.setFont(f);
		lidade.setFont(f);
		lcpf.setFont(f);
		lrg.setFont(f); 
		
		// campos
		lnome.setBounds(10,10,100,30);
		tnome.setBounds(55,10,200,25);
		lidade.setBounds(10,40,100,30);
		tidade.setBounds(55,40,22,25);
		lcpf.setBounds(10,70,100,30); 
		tcpf.setBounds(55,70,100,25);
		lrg.setBounds(10,100,100,30);
		trg.setBounds(55,100,60,25);
		
		// botoes
		b1.setBounds(10,140,100,30);
		b2.setBounds(150,140,100,30);
		
		// adicionando componentes
		ct.add(lnome);
		ct.add(tnome);
		ct.add(lidade);
		ct.add(tidade);
		ct.add(lcpf);
		ct.add(tcpf);
		ct.add(lrg);
		ct.add(trg);
		ct.add(b1);
		ct.add(b2);
		
		setSize(280,220);
		setTitle("Formulário");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MinhaTela mt = new MinhaTela();
		mt.setVisible(true);
	}
}
