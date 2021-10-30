import static java.lang.Math.*;
public class Pessoa {
	
	// Atributos de Pessoa
	private double peso;
	private double altura;
	
	// Refer�ncia para diagn�stico baseado no IMC
	/*
		Menor que 18.5 - Abaixo do peso ;
		Entre 18.5 e 24.9 - Peso normal ;
		Entre 25.0 e 29.9 - Pr�-obesidade ;
		Entre 30.0 e 34.9 - Obesidade Grau 1 ;
		Entre 35.0 e 39.9 - Obesidade Grau 2 ;
		Acima de 40 - Obesidade Grau 3
	*/
	private String diagnostico[] = {"Abaixo do peso", "Peso normal", "Pr�-obesidade", "Obesidade Grau 1", "Obesidade Grau 2", "Obesidade Grau 3"};
	
	// Construtor
	public Pessoa(double peso, double altura){
		this.peso = peso;
		this.altura = altura;
	}
	
	// Atribui��o de valores
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	// Obten��o de valores
	public double getPeso(){
		return this.peso;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	// M�todos de processamento de dados
	public double calcularIMC(){
		return peso/pow(altura,2);
	}
	
	public String informarIMC(double imc){
		double parametro = ((int) (10*imc))/10;
		if (imc < 18.5)
			return diagnostico[0];
		if (imc < 25.0)
			return diagnostico[1];
		if (imc < 30.0)
			return diagnostico[2];
		if (imc < 35.0)
			return diagnostico[3];
		if (imc < 40.0)
			return diagnostico[4];
		return diagnostico[5];
	}
}