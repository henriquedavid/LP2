public class ControleRemoto{

	private Televisao televisao;

	public ControleRemoto(){
		televisao = new Televisao(100, 0);
	}

	public void aumentarVolume(){
		int volume = televisao.getVolume();
		if( volume < 100 ){
			televisao.setVolume(volume++);
		}
	}

	public void diminuirVolume(){
		int volume = televisao.getVolume();
		if(volume > 0){
			televisao.setVolume(volume--);
		}
	}

	public void aumentarCanal(){
		int canal = televisao.getCanalAtual();
		if( canal < televisao.getCanalTotal())
			televisao.setCanalAtual(canal++);
	}

	public void diminuirCanal(){
		int canal = televisao.getCanalAtual();
		if( televisao.getCanalAtual() > 1){
			televisao.setCanalAtual(canal++);
		}
	}

	public void trocarCanal(int canal){
		if( canal > 0 && canal <= televisao.getCanalTotal())
			televisao.setCanalAtual(canal);
	}

	public void printInfo(){
		System.out.println("Volume: " + televisao.getVolume() +
				   "\nCanal: " + televisao.getCanalAtual());
	}


}
