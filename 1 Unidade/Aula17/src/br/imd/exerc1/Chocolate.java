package br.imd.exerc1;
public class Chocolate extends ProdutoNaoDuravel{

	private String tipo;

        public Chocolate( int id, String nome, double preco, String marca, String descricao, String data, String validade, String genero){
                super(id, nome, preco, marca, descricao, data, validade, genero);
        }

	public void setTipo( String tipo ){
		this.tipo = tipo;
	}

	public String getTipo(){
		return tipo;
	}
        
        public boolean isInValid(){
            if( getDataValidade().equals(2018) )
                return true;
            else
                return false;
        }
        
        public boolean isDisponivel(){
            return true;
        }

}

