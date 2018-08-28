public class ProfessorHorista extends Professor{
	private int total_horas;
	private String salario_hora;

	public ProfessorHorista( String nome, String matricula, int idade, int total_horas, String salario_hora){
		super(nome, matricula, idade);
		this.total_horas = total_horas;
		this.salario_hora = salario_hora;
	}

	public int getTotalHoras(){
		return total_horas;
	}

	public void setTotalHoras(){
		this.total_horas = total_horas;
	}

	public String getSalarioHora(){
		return salario_hora;
	}

	public void setSalarioHora( String salario ){
		this.salario_hora = salario;
	}
}
