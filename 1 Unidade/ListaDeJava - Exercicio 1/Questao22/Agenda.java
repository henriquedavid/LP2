import java.util.*;
import java.lang.*;
public class Agenda{
	
	private ArrayList<Pessoa> pessoas;

	public Agenda(){
		pessoas = new ArrayList<Pessoa>(10);
	}

	public void armazenaPessoa( String nome, int idade, float altura ){
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setAltura(altura);

		pessoas.add(pessoa);
	}

	public void removePessoa(String nome){
		Pessoa pessoa;
		for( Pessoa p : pessoas ){
			if( p.getNome() == nome ){
				pessoas.remove(p);
				break;	
			}
		}
		
	}

	public int buscaPessoa( String nome ){
		for( int i = 0; i < pessoas.size(); i++ ){
			if(pessoas.get(i).getNome() == nome)
				return i;
		}
		return 0;
	}

	public void imprimeAgenda(){
		for( Pessoa p: pessoas ){
			p.imprimir();
		}
	}

	public void imprimePessoa(int index){
		if( index < 0 || index > pessoas.size() ){
		
		}
		else{
			pessoas.get(index).imprimir();
		}
	}


}
