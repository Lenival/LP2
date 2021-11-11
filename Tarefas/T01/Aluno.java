import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.HashMap;

public class Aluno{
		
	private String cpf;
	private String nome;
	private Date nascimento;
	HashMap<String, String> treino;
	
	public Aluno(String cpf, String nome, Date nascimento){
		this.cpf = cpf;
		this.nome = nome;
		this.nascimento = nascimento;
		this.treino = new HashMap<String, String>();
	}
		
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setNascimento(Date nascimento){
		this.nascimento = nascimento;
	}	
			
	public String getCpf(){
		return this.cpf;
	}
	public String getNome(){
		return this.nome;
	}
	public Date getNascimento(){
		return this.nascimento;
	}
	
	public void adicionarTreino(String horario, String treino){
		this.treino.put(horario, treino);
	}
	
	
	
}