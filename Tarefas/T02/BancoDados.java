import java.util.ArrayList;
import java.util.HashMap;
import oracle.javatools.util.MultiMap;


public class BancoDados{
	private ArrayList<Veiculo> veiculos;
	
	public BancoDados(){
		this.veiculos = new ArrayList<Veiculo>();
	}
	
	// Adicionar veiculo
	public void adicionarVeiculo(Veiculo veiculo){
		this.veiculos.add(veiculo);
	}
	// Remover veiculo
	public void removerVeiculo(Veiculo veiculo){
		this.veiculos.remove(this.veiculos.indexOf(veiculo));
	}
	
	public void exibirVeiculosCadastrados(){
		System.out.println("Veículos cadastrados");
		for(Veiculo	 v : veiculos)
				System.out.println(v.getClass().getName()+ " " + v.getModelo());
	}
	
	public void exibirVeiculosDisponiveis(){
			System.out.println("Veículos disponíveis para aluguel");
			for(Veiculo	 v : veiculos){
				if (!(v.getAlugado()))
					System.out.println(" Veículo: " + v.getModelo()+"\tValor de aluguel: " + v.getValorAluguel());
			}
	}
	
	public double obterMaiorAluguel(){
		System.out.println("Veículos cadastrados");
		double maiorAluguel = 0;
		for(Veiculo	 v : veiculos){
			if(maiorAluguel < v.getValorAluguel())
				maiorAluguel = v.getValorAluguel();
		}
		return maiorAluguel;
	}
	
		
	public void exibirMarcaMaisComum(){
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		HashMap<Integer, ArrayList<String>> multiM = new HashMap<Integer, ArrayList<String>>();
		System.out.println("Marcas mais comuns");
		for(Veiculo	 v : veiculos){
			if (m.containsKey(v.getMarca())){
				m.put(v.getMarca(), m.get(v.getMarca()) + 1);
			}else{
				m.put(v.getMarca(), 1);
			}
		}
		int maior=0;
		for(Integer key : m.keys()){
			if (multiM.containsKey(m.get(key))){
				multiM.put(m.get, m.get(v.getMarca()) + 1);
			}else{
				m.put(v.getMarca(), 1);
			}
		}
		
		System.out.println(m.toString());
		System.out.println(multiM.toString());
	}
}