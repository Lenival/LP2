//package tarefa_02_LP2;
import java.util.ArrayList;
import java.util.HashMap;

public class BancoDados {
	private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	
	public void adicionarVeiculo(Veiculo v) {
		this.veiculos.add(v);
	}
	
	public void removerVeiculo(Veiculo v) {
		this.veiculos.remove(veiculos.indexOf(v));
	}

	public void exibirVeiculos() {
		// TODO Auto-generated method stub
		System.out.println("Os veículos cadastrados são:");
		for(Veiculo v : veiculos)
			System.out.println(v.getModelo());
	}

	public void exibirAlugados() {
		// TODO Auto-generated method stub
		for(Veiculo v : veiculos)
			if (v.isAlugado())
				System.out.println("O veiculo " + v.getModelo() + " está alugado por " + v.getValorAluguel()*v.getDiasAlugado());		
	}
	
	public void exibirDisponiveis() {
		// TODO Auto-generated method stub
		for(Veiculo v : veiculos)
			if (!v.isAlugado())
				System.out.println("O veiculo " + v.getModelo() + " está disponivel por " + v.getValorAluguel() + "/dia");		
	}
	
	public void listarAluguelMaisAlto() {
		double maior = 0;
		for(Veiculo v : veiculos)
			if(maior < v.getValorAluguel())
				maior = v.getValorAluguel();
		System.out.println("O aluguel mais alto é no valor de R$ "+maior);
	}

	public void listarMarcaMaisComum() {
		// TODO Auto-generated method stub
		HashMap<String,Integer> marcaPorPresenca = new HashMap<String,Integer>();
		HashMap<Integer,ArrayList<String>> presencaPorMarca = new HashMap<Integer,ArrayList<String>>();
		ArrayList<String> listaMarca;
		int maisPresente = 0;
		
		for(Veiculo v : veiculos) {
			if(marcaPorPresenca.containsKey(v.getMarca())) {
				marcaPorPresenca.replace(v.getMarca(), 1+marcaPorPresenca.get(v.getMarca()));
			}else {
				marcaPorPresenca.put(v.getMarca(), 1);
			}
		}
		
		
		for (HashMap.Entry<String,Integer> entry : marcaPorPresenca.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			if(presencaPorMarca.containsKey(val)) {
				listaMarca = presencaPorMarca.get(val);
				listaMarca.add(key);
				presencaPorMarca.replace(val, listaMarca);
			}else {
				listaMarca = new ArrayList<String>();
				listaMarca.add(key);
				presencaPorMarca.put(val, listaMarca );
			}
			if(maisPresente < val)
				maisPresente = val;
		}
		
		System.out.println("A lista de marcas mais presentes é:\n"+presencaPorMarca.get(maisPresente).toString());
		
	}
	
}
