import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import pac2.*;

public class MenuExemplo02 extends JFrame implements ActionListener{
	
	JMenu fileMenu;
	JMenu relaMenu;
	JMenu sairMenu;
	
	JMenuItem mItem1;
	JMenuItem mItem2;
	JMenuItem mItem3;
	JMenuItem mItem4;
	
	public MenuExemplo02(){
		setTitle("Menu Exemplo 02");
	    setSize(500,500);
	     
	    // Cria uma barra de menu para o JFrame
	    JMenuBar menuBar = new JMenuBar();
	        
	    // Adiciona a barra de menu ao  frame
	    setJMenuBar(menuBar);
	    
	    fileMenu = new JMenu("Cadastros");
		relaMenu = new JMenu("Relatórios");
		sairMenu = new JMenu("Sair");
        
        menuBar.add(fileMenu);
        menuBar.add(relaMenu);
        menuBar.add(sairMenu);
        
        // definindo os itens de menu
        mItem1 = new JMenuItem("Clientes", 69);
        mItem2 = new JMenuItem("Fornecedores", 67);
        mItem3 = new JMenuItem("Produtos", 68);
        mItem4 = new JMenuItem("Geral");
        
        fileMenu.add(mItem1);
        fileMenu.add(mItem2);
        fileMenu.add(mItem3);
        relaMenu.add(mItem4);
        
        mItem1.addActionListener(this);
        mItem2.addActionListener(this);
        mItem3.addActionListener(this);
        mItem4.addActionListener(this);
	}

	public static void main(String[] args) {
		MenuExemplo02 menu = new MenuExemplo02();
		menu.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		MinhaJanela tela = new MinhaJanela();
		tela.setVisible(true);
		
		if (evento.getSource() == mItem1){
			tela.setTitle("Clientes");
		}
		if (evento.getSource() == mItem2){
			tela.setTitle("Fornecedores");
		}
		if (evento.getSource() == mItem3){
			tela.setTitle("Produtos");
		}
		if (evento.getSource() == mItem4){
			tela.setTitle("Relatório Geral"); 
		}
	}
}

