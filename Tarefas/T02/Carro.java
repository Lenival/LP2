public class Carro extends Veiculo{
	private double potenciaMotor;
	private int numeroPortas;
	
	public Carro(String marca, String modelo, String placa, double valorAluguel, boolean alugado, double potenciaMotor, int numeroPortas){
		super(marca, modelo, placa, valorAluguel, alugado);
		this.potenciaMotor = potenciaMotor;
		this.numeroPortas = numeroPortas;
	}
	
	public void setPotenciaMotor(int potenciaMotor){
		this.potenciaMotor = potenciaMotor;
	}
	public void setNumeroPortas(int numeroPortas){
		this.numeroPortas = numeroPortas;
	}
	
	public double getPotenciaMotor(){
		return this.potenciaMotor;
	}
	public int getNumeroPortas(){
		return this.numeroPortas;
	}
}