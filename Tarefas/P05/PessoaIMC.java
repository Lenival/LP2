import java.util.Date;

public abstract class PessoaIMC extends Pessoa {

	protected double peso;
	protected double altura;
	
	public PessoaIMC(String nome, Date dataNascimento, double peso, double altura) {
		super(nome, dataNascimento);
		// TODO Auto-generated constructor stub
		this.peso = peso;
		this.altura = altura;
	}

	public double calculaIMC() {
		return this.peso/(this.altura*this.altura);
	}
	
	public abstract String resultIMC();/* {
		//calculaIMC(this.altura, this.peso);
	}*/
	
	public String toString() {
		return super.toString()+"\nPeso: "+ this.peso + "\nAltura: "+this.altura;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
