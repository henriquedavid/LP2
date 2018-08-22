import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args){
		ArrayList<Integer> valor = new ArrayList<Integer>();
		valor.add(4);
		valor.add(2);
		valor.add(3);
		valor.add(5);
		valor.add(1);
		valor.add(0);
	
		Subset sub = new Subset(valor);
		
		ArrayList<Integer> answer = sub.subsetSum(9);
		for( int num : answer ){
			System.out.print(num + " ");
		}
	}
}
