import java.lang.String;
import java.lang.Integer;
public class Pessoa{
	
	private String nome;
	private String dataNascimento;
	private float altura;

	public String getNome(){ return nome; }
	public String getDataNascimento(){ return dataNascimento; }
	public float getAltura(){ return altura; }

	public void setNome( String nome ){ this.nome = nome; }
	public void setDataNascimento( String data ){ this.dataNascimento = data;}
	public void setAltura( float altura ){ this.altura = altura; }

	public void imprimir(){
		System.out.println("Nome: " + nome +
				   "Data de Nascimento: " + dataNascimento +
				   "Altura: " + altura);
	}

	public int getIdade(){
		String idade_s = "18";
		int idade = Integer.parseInt(idade_s);
		return idade;
	}

} 
