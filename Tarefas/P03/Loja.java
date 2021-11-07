import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Loja{
	public static void main(String args[]) throws ParseException{
		Deposito deposito = new Deposito();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		if (deposito.estaVazio())
			System.out.println("O depósito está vazio.");
		else
			System.out.println("Existem " + deposito.informarQuantidade() + " produtos no depósito.");
		
		// Adicionar produtos ao deposito
		// ProdutoDuravel : String nome, double preco, String marca, String descricao, Date dataFabricacao, int durabilidade
		deposito.adicionarProduto(new ProdutoDuravel("carro", 100000, "Toyota", "Veículo automotivo corola", formato.parse("01/01/2021"), 10));
		deposito.adicionarProduto(new ProdutoDuravel("livro", 20, "Elementos", "Livro mais lido", formato.parse("10/03/2020"), 100));
		deposito.adicionarProduto(new ProdutoDuravel("celular", 4500, "Samsung", "Smartphone Galaxy Note 9", formato.parse("24/08/2018"), 2));
		
		// ProdutoNaoDuravel : String nome, double preco, String marca, String descricao, Date dataFabricacao, Date dataValidade, String genero
		deposito.adicionarProduto(new ProdutoNaoDuravel("chocolate", 10, "Garoto", "Chocolate Talento 90g", formato.parse("31/12/2020"), formato.parse("31/12/2022"), "alimentício"));
		deposito.adicionarProduto(new ProdutoNaoDuravel("toalha", 30, "Teka", "Toalha de banho Teka", formato.parse("31/05/2018"), formato.parse("31/05/2030"), "vestuário"));
		deposito.adicionarProduto(new ProdutoNaoDuravel("sabonete", 4, "Granado", "Sabone com lavanda", formato.parse("15/07/2021"), formato.parse("15/07/2023"), "higiene pessoal"));
		
		System.out.println("Existem "+ deposito.informarQuantidade() + " produtos no depósito.");
		System.out.println("O produto mais caro é o "+ deposito.informarMaisCaro().getNome() + " da marca "+ deposito.informarMaisCaro().getMarca() +" que custa R$ " + deposito.informarMaisCaro().getPreco() );
		
		if (deposito.estaVazio())
			System.out.println("O depósito está vazio.");
		else
			System.out.println("Existem " + deposito.informarQuantidade() + " produtos no depósito.");
		
		deposito.removerProduto(deposito.informarMaisCaro());
		
		if (deposito.estaVazio())
			System.out.println("O depósito está vazio.");
		else
			System.out.println("Existem " + deposito.informarQuantidade() + " produtos no depósito.");
		
		System.out.println("O produto mais caro é o "+ deposito.informarMaisCaro().getNome() + " da marca "+ deposito.informarMaisCaro().getMarca() +" que custa R$ " + deposito.informarMaisCaro().getPreco() );

		
	}
}