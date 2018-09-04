import java.util.ArrayList;

public class Mapa{
	
	private ArrayList<ArrayList<String>> map;

	/**
	 *	The method to read the map is that the user insert
	 *    where is the castel and each caracter in the map. In this
	 *    case the class Mapa just got the map already configured.
	 */

	public Mapa( ArrayList<ArrayList<String>> m ){
		map = m;
	}

	// Return the content in that specific position.
	public String getContent(int x, int y){
		return map.get(x).get(y);
	}

	public String getContent(Movimento pos){
		return map.get(pos.getX()).get(pos.getY());
	}

	// Change the content in some x and y position.
	public void setContent( int x, int y, String v ){
		map.get(x).get(y).set(v);
	}
}
