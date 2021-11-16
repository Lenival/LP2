public class Veiculo{
	protected String marca;
	protected String modelo;
	protected String placa;
	protected double valorAluguel;
	protected boolean alugado;
	
	
	public Veiculo(String marca, String modelo, String placa, double valorAluguel, boolean alugado){
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.valorAluguel = valorAluguel;
		this.alugado = alugado;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public void setPlaca(String placa){
		this.placa = placa;
	}
	public void setValorDoAluguel(double valorAluguel){
		this.valorAluguel = valorAluguel;
	}
	public void setAlugado(boolean alugado){
		this.alugado = alugado;
	}
	
	public String getMarca(){
		return this.marca;
	}
	public String getModelo(){
		return this.modelo;
	}
	public String getPlaca(){
		return this.placa;
	}
	public double getValorAluguel(){
		return this.valorAluguel;
	}
	public boolean getAlugado(){
		return this.alugado;
	}
}