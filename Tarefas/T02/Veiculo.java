public class Veiculo {

	protected String marca;
	protected String modelo;
	protected String placa;
	protected double valorAluguel;
	protected boolean alugado;
	protected double diasAlugado;


	public Veiculo(String marca, String modelo, String placa, double valorAluguel) {
		// TODO Auto-generated constructor stub
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.valorAluguel = valorAluguel;
	}
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	
	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}


	public double getDiasAlugado() {
		return diasAlugado;
	}

	public void setDiasAlugado(double diasAlugado) {
		this.diasAlugado = diasAlugado;
	}

	
}
