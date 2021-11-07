import java.util.ArrayList;

public class Deposito{
	private ArrayList<Produto> produtos;
	
	// Constructors
	public Deposito(){
		this.produtos = new ArrayList<Produto>();
	}
	
	// Adicionar produto.
	public void adicionarProduto(Produto produto){
		this.produtos.add(produto);
	}
	// Remover produto.
	public void removerProduto(Produto produto){
		this.produtos.remove(this.produtos.indexOf(produto));
	}
	// Informar quantidade de produtos no depósito
	public int informarQuantidade(){
		return this.produtos.size();
	}
	// Informar se o depósito está vazio;
	public boolean estaVazio(){
		return this.produtos.isEmpty();
	}
	// Informar o produto com maior preço.
	public Produto informarMaisCaro(){
		int iMaior = 0;
		for (int i = 1; i < produtos.size() ; i++)
			if((produtos.get(i)).getPreco() > (produtos.get(iMaior)).getPreco() )
				iMaior = i;
		return produtos.get(iMaior);
	}
}