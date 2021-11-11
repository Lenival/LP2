import java.util.HashSet;

public class Professor extends Funcionario{
	private String tipo;
	private HashSet<Aluno> listaAlunos;
	
	public Professor(String matricula, String nome, double salario, String tipo){
		super(matricula, nome, salario);
		this.tipo = tipo;
		listaAlunos = new HashSet<Aluno>();
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public void adicionarAluno(Aluno aluno){
		this.listaAlunos.add(aluno);
	}
	
	public String getTipo(){
		return this.tipo;
	}
	
	public HashSet<Aluno> getListaAlunos(){
		return this.listaAlunos;
	}

}