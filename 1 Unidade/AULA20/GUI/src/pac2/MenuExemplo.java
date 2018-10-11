import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class MenuExemplo extends JFrame {
	
	JMenu fileMenu;
	JMenu relaMenu;
	JMenu sairMenu;
	
	public MenuExemplo(){
		setSize(350,230);
		setTitle("Menu Exemplo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// cria uma barra de menu
		JMenuBar mnbar = new JMenuBar();
		
		// adiciona a barra de menu
		setJMenuBar(mnbar);
		
		fileMenu = new JMenu("Cadastros");
		relaMenu = new JMenu("Relatórios");
		sairMenu = new JMenu("Sair");
		
		mnbar.add(fileMenu);
		mnbar.add(relaMenu);
		mnbar.add(sairMenu);
		
		fileMenu.addMenuListener(new MenuListener() {
			
			@Override
			public void menuSelected(MenuEvent e) {
				System.out.println("Você selecionou o Menu Cadastros...");
			}
			
			@Override
			public void menuDeselected(MenuEvent e) {
				// 
			}
			@Override
			public void menuCanceled(MenuEvent e) {
				// 
			}
		});
		
		relaMenu.addMenuListener(new MenuListener() {
			
			@Override
			public void menuSelected(MenuEvent e) {
				System.out.println("Você selecionou o Menu Relatórios...");
			}
			
			@Override
			public void menuDeselected(MenuEvent e) {
				// 
			}
			@Override
			public void menuCanceled(MenuEvent e) {
				// 
			}
		});
		
		sairMenu.addMenuListener(new MenuListener() {
			
			@Override
			public void menuSelected(MenuEvent e) {
				System.out.println("Você selecionou o Menu Sair...");
				System.exit(0);
			}
			
			@Override
			public void menuDeselected(MenuEvent e) {
				// 
			}
			@Override
			public void menuCanceled(MenuEvent e) {
				// 
			}
		});
	}
	
	public static void main(String[] args) {
		MenuExemplo menu = new MenuExemplo();
		menu.setVisible(true);
	}
}
