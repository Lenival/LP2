/*
3. Classe ProdutoNaoDuravel que também herda de Produto e que possui os seguintes atributos: (Date dataValidade, String genero – alimentício, limpeza, vestuário, higiene pessoal).
*/
import java.util.Date;

public class ProdutoNaoDuravel extends Produto{
	private Date dataValidade;
	private String genero; //alimentício, limpeza, vestuário, higiene pessoal
	
	// Constructor
	public ProdutoNaoDuravel(String nome, double preco, String marca, String descricao, Date dataFabricacao, Date dataValidade, String genero){
		super(nome, preco, marca, descricao, dataFabricacao);
		this.dataValidade = dataValidade;
		this.genero = genero;
	}
	
	// Set methods
	public void setDataValidade (Date dataValidade){
		this.dataValidade = dataValidade;
	}
	public void setGenero (String genero){
		this.genero = genero;
	}
	
	// Get methods
	public Date getDataValidade(){
		return this.dataValidade;
	}
	public String getGenero(){
		return this.genero;
	}
	
}