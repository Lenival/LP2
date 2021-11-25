import java.util.Date;

public class Pessoa {

	protected String nome;
	protected Date dataNascimento;
	
	public Pessoa(String nome, Date dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String toString() {
		return "Nome: " + this.nome +"\nData de Nascimento: " + dataNascimento.getDate() + "/"+ (1+dataNascimento.getMonth()) + "/"+ (1900+dataNascimento.getYear());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
}
