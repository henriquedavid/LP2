import java.util.ArrayList;
import java.lang.Integer;

public class Subset{

	public ArrayList<Integer> numeros;

	public Subset( ArrayList<Integer> numeros ){
		this.numeros = numeros;
	}

	public ArrayList<Integer> subsetSum(int x){
		ArrayList<Integer> soma_array = new ArrayList<Integer>();
		int soma = 0;
		for( int i = 0; i < numeros.size() ; i++){
			soma += numeros.get(i);
			for( int j = 0; j < numeros.size(); j++){
				soma += numeros.get(j);
				soma_array.add(numeros.get(j));

				if(soma > x){
					i += 1;
					j = 0;
					soma= 0;
					soma_array.clear();
				}
				else if( soma == x){
					return soma_array;
				}
				else{

				}
			}
		}
		return soma_array;
	}
	

}
