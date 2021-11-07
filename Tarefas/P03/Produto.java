/*
1. Classe Produto que possui os seguintes atributos: (String nome, double preco, String marca, String descricao, Date dataFabricacao). Também será necessário implementar os métodos sets e gets para cada um dos atributos descritos acima.
*/
import java.util.Date;

public class Produto{
	protected String nome;
	protected double preco;
	protected String marca;
	protected String descricao;
	protected Date dataFabricacao;

	public Produto(String nome, double preco, String marca, String descricao, Date dataFabricacao){
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.descricao = descricao;
		this.dataFabricacao = dataFabricacao;
	}
	
	// Set methods
	public void setNome (String nome){
				this.nome = nome;
				}
	public void setPreco (double preco){
				this.preco = preco;
				}
	public void setMarca (String marca){
				this.marca = marca;
				}
	public void setDescricao (String descricao){
				this.descricao = descricao;
				}
	public void setDataFabricacao (Date dataFabricacao){
				this.dataFabricacao = dataFabricacao;
				}
	
	// Get methods
	public String getNome (){
				return this.nome;
				}
	public double getPreco (){
				return this.preco;
				}
	public String getMarca (){
				return this.marca;
				}
	public String getDescricao (){
				return this.descricao;
				}
	public Date getDataFabricacao (){
				return this.dataFabricacao;
				}
	
}