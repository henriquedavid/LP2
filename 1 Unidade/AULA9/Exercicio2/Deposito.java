import java.util.*;
import java.lang.*;

public class Deposito{
	
	public ArrayList<Produto> produtos;

	public Deposito(){
		produtos = new ArrayList<Produto>();
	}

	public void addProduct( Produto prod ){
		produtos.add(prod);
	}

	public void removeProduct( Produto prod ){
		produtos.remove(prod);
	}

	public int quantidade(){
		return produtos.size();
	}

	public boolean vazio(){
		return produtos.isEmpty();
	}

	public void maiorValor(){
		double maior = 0;

		for( Produto i : produtos ){
			if( i.getPreco() >= maior)
				maior = i.getPreco();
		}

		System.out.println("O maior valor é " + maior);
	}
}
