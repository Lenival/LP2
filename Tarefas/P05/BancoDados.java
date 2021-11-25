import java.util.ArrayList;

public class BancoDados {
	
	private ArrayList<PessoaIMC> pessoas = new ArrayList<PessoaIMC>();

	public void adicionarPessoa(PessoaIMC a) {
		this.pessoas.add(a);
	}

	public void removerPessoa(PessoaIMC a) {
		this.pessoas.remove(pessoas.indexOf(a));
	}

	public void exibirPessoas() {
		System.out.println("\nAs pessoas cadastradas são:\n------------------------------------------------------------------");
		for (PessoaIMC a : pessoas)
			System.out.println(a.toString()+"\n------------------------------------------------------------------");
	}
	
	public void exibirPessoasIMC() {
		System.out.println("\nAs pessoas cadastradas e seus respectivos IMC são:\n------------------------------------------------------------------");
		for (PessoaIMC a : pessoas)
			System.out.println(a.toString() + "\nIMC: " +a.resultIMC()+"\n------------------------------------------------------------------");
	}


}
