//package tarefa_02_LP2;

public class LocaLisa {
	public static void main(String[] args) {
		Veiculo c1 = new Carro("Chevrolet", "modelo11", "AAA1A11", 1.2, 4, 1200);
		Veiculo c2 = new Carro("Fiat", "modelo21", "BBB1B11", 1.0, 4, 1000);
		Veiculo c3 = new Carro("Honda", "modelo31", "CCC1C11", 2.0, 4, 2000);
		Veiculo m1 = new Moto("Honda", "modelo32", "CCC1D11", "manual", 400, 500);
		Veiculo m2 = new Moto("Honda", "modelo33", "CCC1D11", "aumatica", 600, 700);
		Veiculo m3 = new Moto("Yamaha", "modelo41", "DDD1D11", "manual", 300, 100);
		Veiculo m4 = new Moto("Yamaha", "modelo41", "DDD1E11", "manual", 300, 100);
		Veiculo m5 = new Moto("Yamaha", "modelo41", "DDD1F11", "manual", 300, 100);
		
		BancoDados bd = new BancoDados();
		
		bd.adicionarVeiculo(c1);
		bd.adicionarVeiculo(c2);
		bd.adicionarVeiculo(c3);
		bd.adicionarVeiculo(m1);
		bd.adicionarVeiculo(m2);
		bd.adicionarVeiculo(m3);
		bd.adicionarVeiculo(m4);
		bd.adicionarVeiculo(m5);
		
		bd.exibirVeiculos();
		bd.exibirAlugados();
		bd.exibirDisponiveis();
		bd.listarAluguelMaisAlto();
		bd.listarMarcaMaisComum();
		
	}
}
