import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class BancoDeDados{
	private ArrayList<Funcionario> funcionarios;
	
	public BancoDeDados(){
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	// Adicionar funcionario
	public void adicionarFuncionario(Funcionario funcionario){
		this.funcionarios.add(funcionario);
	}
	// Remover funcionario
	public void removerFuncionario(Funcionario funcionario){
		this.funcionarios.remove(this.funcionarios.indexOf(funcionario));
	}
	
	// Lista de funcionários contendo a matrícula, o nome e o tipo
	public void listarFuncionarios(){
		String temp;
		System.out.println("########################### Funcionários ###########################");
		for(Funcionario f : funcionarios){
			if (f instanceof Professor)
				temp = "Professor [" + ((Professor) f).getTipo() +"]";
			else
				temp = "Funcionario";
			System.out.println(" Matriccula: " + f.getMatricula() +" Nome: " + f.getNome() +"\tTipo: " + temp);
		}
		System.out.println("###################################################################");
	}
	// Lista de atividades (alunos) contendo o nome do professor e a atividade exercida(horário e descrição) e o respectivo aluno
	public void listarAtividades(){
		String temp;
		System.out.println("########################### Professores ###########################");
		for(Funcionario	 f : funcionarios){
			if (f instanceof Professor){
				System.out.println(" Professor [" + f.getNome() + "]");
				for(Aluno a : ((Professor) f).getListaAlunos()){
					System.out.println(" Aluno >>> " + a.getNome()+ " " + a.treino.toString());
				}
			}
		}
		System.out.println("###################################################################");
	}
	
	// Lista de alunos contendo CPF, Nome e Idade
	public void listarAlunos(){
		System.out.println("########################### Alunos ###############################");
		for(Funcionario	 f : funcionarios){
			if (f instanceof Professor){
				//System.out.println(" Nome: " + f.getNome());
				for(Aluno a : ((Professor) f).getListaAlunos()){
					System.out.println(" CPF.: " + a.getCpf()+"\tNome.: " + a.getNome()+"\tIdade.: " + (121-(a.getNascimento()).getYear()));
				}
			}
		}
		System.out.println("###################################################################");
	}
}