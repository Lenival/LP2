public class Funcionario{
	
	protected String matricula;
	protected String nome;
	protected double salario;
	
	public Funcionario(String matricula, String nome, double salario){
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public String getMatricula(){
		return this.matricula;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public double getSalario(){
		return this.salario;
	}
}