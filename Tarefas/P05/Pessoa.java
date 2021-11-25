import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {

	protected String nome;
	protected Date dataNascimento;
	
	public Pessoa(String nome, Date dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return "Nome: " + this.nome +"\nData de Nascimento: " + formatter.format(dataNascimento);
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
