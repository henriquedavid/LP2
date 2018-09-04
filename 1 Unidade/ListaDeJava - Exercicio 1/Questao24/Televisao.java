public class Televisao{

	private int canal;
	private int canalAtual;
	private int volume;

	public Televisao( int total, int atual ){
		canal = total;
		canalAtual = atual;
		volume = 0;
	}

	public int getCanalAtual(){ return canalAtual; }
	public int getCanalTotal(){ return canal; }
	public void setCanalAtual( int canal ){ canalAtual = canal; }
	public void setCanalTotal(int quant){ canal = quant; }
	public void setVolume(int qnt){ this.volume = qnt; }
	public int getVolume(){ return volume; }
}
