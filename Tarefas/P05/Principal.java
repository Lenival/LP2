import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		/*
		 * Nome: Zé Lezin
		 * Data de Nascimento: 20/01/1945
		 * Peso: 74.8
		 * Altura: 1.75
		 * IMC: 24.42 - peso ideal
		 * ------------------------------------------------------------------
		 * Nome: Frida Kahlo
		 * Data de Nascimento: 06/07/1907
		 * Peso: 50.2
		 * Altura: 1.69
		 * IMC: 17.57 - abaixo do peso
		 * ------------------------------------------------------------------*/

		PessoaIMC h1 = new Homem("Zé Lezin",formato.parse("20/01/1945"),74.8, 1.75);
		PessoaIMC m1 = new Mulher("Frida Kahlo",formato.parse("06/07/1907"),50.2, 1.69 );
		
		BancoDados bd = new BancoDados();
		bd.adicionarPessoa(h1);
		bd.adicionarPessoa(m1);
		bd.exibirPessoas();
		bd.exibirPessoasIMC();
		
		
	}

}
