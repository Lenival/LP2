public class Moto extends Veiculo {

	private int cilindrada;
	private String partida;

	public Moto(String marca, String modelo, String placa, String partida, int cilindrada, int valorAluguel) {
		super(marca, modelo, placa, valorAluguel);
		this.partida = partida;
		this.cilindrada = cilindrada;
		// TODO Auto-generated constructor stub
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}
	
	
}
