public class LocaLisa{
	public static void main(String args[]){
		
		Carro c1 = new Carro("Fiat", "modelo11", "AAA1A11", 1000, false, 1.0, 4);
		Carro c2 = new Carro("Fiat", "modelo12", "AAA1B11", 1200, false, 1.2, 4);
		Carro c3 = new Carro("Honda", "modelo21", "BBB1A11", 3000, false, 2.0, 4);
		Moto m1 = new Moto("Honda", "modelo25", "CCC1A11", 500, false, "manual", 500);
		Moto m2 = new Moto("Honda", "modelo25", "CCC1B11", 500, false, "manual", 500);
		Moto m3 = new Moto("Yamaha", "modelo3", "DDD1D11", 1000, false, "elétrica", 1000);
		
		BancoDados bd= new BancoDados();
		
		bd.adicionarVeiculo(c1);
		bd.adicionarVeiculo(c2);
		bd.adicionarVeiculo(c3);
		bd.adicionarVeiculo(m1);
		bd.adicionarVeiculo(m2);
		bd.adicionarVeiculo(m3);
		
		bd.exibirVeiculosCadastrados();
		
		bd.exibirVeiculosDisponiveis();
		
		System.out.println("O maior valor de aluguel é: R$ " + bd.obterMaiorAluguel());
		
		bd.exibirMarcaMaisComum();
	}
}