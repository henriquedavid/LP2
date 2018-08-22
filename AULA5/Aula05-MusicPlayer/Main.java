public class Main{

	public static void main(String[] args){
	
		Songs songs = new Songs();
		
		songs.addFile("audio/Beck-HitInTheUsa.mp3");
		
		songs.playFile("audio/Beck-HitInTheUsa.mp3");

		System.out.println(songs.getNumberOfFiles());	

		songs.listFiles();

		

		//songs.playAll();	
	}

}
