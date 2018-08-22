import java.util.*;
import java.lang.*;

public class HugeInteger{
	private ArrayList<Integer> digitos;

	public HugeInteger(){
		digitos = new ArrayList(40);
	}

	public HugeInteger( String numeros ){
		digitos = new ArrayList(40);
		int valor = Integer.parseInt(numeros);
		for( int i = 0; i < numeros.length(); i++){
			digitos.add(Integer.parseInt(String.valueOf(numeros.charAt(i))));
		}
	}

	public void inputHugeInteger( String valor_ ){
		for( int i = 0 ; i < valor_.length(); i++){
			digitos.add(Integer.parseInt(String.valueOf(valor_.charAt(i))));
		}

	
	}

	public void printValor(){
		for( int i : digitos ){
			System.out.print(String.valueOf(i)+"");
		}

		System.out.println("");
	}

	public String outputHugeInteger(){
		String saida = "";	
		for( int i = 0; i < digitos.size(); i++ ){
			saida += digitos.get(i).toString();
		}

		return saida;
	}

	public String addHugeIntegers( HugeInteger n2 ){
		String sum = "";
		int escorrega = 0;
		for( int i = digitos.size()-1; i >= 0; i--){
			int v = digitos.get(i) + n2.digitos.get(i) + escorrega;
			if(i >= 10){
				escorrega = v/10;
				v = v%10;
			}
			else
				escorrega = 0;
			sum = String.valueOf(v);  
		}
		
		return sum;
	}

/*	public HugeInteger subtractHugeIntegers( HugeInteger n1, HugeInteger n2 ){
		HugeInteger sub = n1 + n2;
		return sub;
	}
*/
}
