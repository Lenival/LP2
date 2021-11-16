public class Moto extends Veiculo{
	private String tipoPartida;//(manual ou elétrica)
	private int cilindradas;
	
	public Moto(String marca, String modelo, String placa, double valorAluguel, boolean alugado, String tipoPartida, int cilindradas){
		super(marca, modelo, placa, valorAluguel, alugado);
		this.tipoPartida = tipoPartida;
		this.cilindradas = cilindradas;
	}
	
	public void setTipoPartida(String tipoPartida){
		this.tipoPartida = tipoPartida;
	}
	public void setCilindradas(int cilindradas){
		this.cilindradas = cilindradas;
	}
	
	public String getTipoPartida(){
		return this.tipoPartida;
	}
	public int getNumeroPortas(){
		return this.cilindradas;
	}
}