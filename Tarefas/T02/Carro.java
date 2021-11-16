
public class Carro extends Veiculo {
	
	private double potenciaMotor;
	int quantidadePortas;
	
	public Carro(String marca, String modelo, String placa, double potenciaMotor, int quantidadePortas, int valorAluguel) {
		// TODO Auto-generated constructor stub
		super(marca, modelo, placa, valorAluguel);
	}

	public double getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(double potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	

}
