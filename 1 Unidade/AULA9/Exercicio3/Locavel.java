import java.util.ArrayList;

public class Locavel{

	private ArrayList<Automovel> alugados;
	private ArrayList<Automovel> disponiveis;
	private ArrayList<Cliente> clientes;

	public Locavel(){
		alugados = new ArrayList<Automovel>();
		disponiveis = new ArrayList<Automovel>();
	}

	public void mostrarCadastrados(){
		for( Automovel a : alugados ){
			System.out.println("Marca = " + a.getMarca() + " | Modelo = " + a.getModelo());
		}

		for( Automovel a : disponiveis ){
			System.out.println("Marca = " + a.getMarca() + " | Modelo = " + a.getModelo());
		}
	}

	public void mostrarAlugados(){
		System.out.println("ALUGADOS");
		for( Automovel a : alugados ){
			System.out.println("Marca = " + a.getMarca() + " | Modelo = " + a.getModelo() );
		}
	}

	public void mostrarDisponiveis(){
		System.out.println("DISPONÍVEIS");
                for( Automovel a : disponiveis ){
                        System.out.println("Marca = " + a.getMarca() + " | Modelo = " + a.getModelo() );
                }
        }

	public void alugar( String nome, String carteira, Automovel auto){
	
		for( Automovel a : disponiveis ){
			if( a == auto ){
				Cliente cliente = new Cliente(nome, carteira, auto);
				alugados.add(auto);
				disponiveis.remove(a);
			}
		}

		

	}

}
