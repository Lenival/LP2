/*
2. Classe ProdutoDuravel que herda de Produto e que possui um atributo (int durabilidade – expressa em anos). Não esqueça de implementar os métodos sets e gets.
*/
import java.util.Date;

public class ProdutoDuravel extends Produto{
	private int durabilidade;
	
	// Constructor
	public ProdutoDuravel(String nome, double preco, String marca, String descricao, Date dataFabricacao, int durabilidade){
		super(nome, preco, marca, descricao, dataFabricacao);
		this.durabilidade = durabilidade;
	}
	
	// Set methods
	public void setDurabilidade (int durabilidade){
		this.durabilidade = durabilidade;
		}
	
	// Get methods
	public int getDurabilidade (){
		return this.durabilidade;
		}
}