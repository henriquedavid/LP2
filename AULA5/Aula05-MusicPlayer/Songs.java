import java.util.*;
import java.lang.*;

public class Songs{
	
	private ArrayList<String> names;
	private SoundEngine se;

	public Songs(){
		names = new ArrayList<String>();
		se = new SoundEngine();
	}

	public void addFile(String file){
		names.add(file);
	}

	public int getNumberOfFiles(){
		return names.size();
	}

	public void listFiles(){
		for( int i = 0; i < names.size(); i++ ){
			System.out.println( i + ": \"" + names.get(i) + "\".");
		}
	}

	public void removeFile(int file){
		if( file < names.size() && file >= 0 ){
			names.remove(file);
		} else{
			System.out.println("Index inválido!");
		}
	}

	public void playFile(String file){
		se.playCompletely(file);
	}

	public void playAll(){
		for( String file : names ){
			se.playCompletely(file);
		}
	}

	public void removeFile(String file){
		for( int i = 0; i < names.size() ; i++ ){
			if(file.compareTo(names.get(i)) == 0){
				names.remove(names.get(i));
				return;
			}
		}
	}

}
