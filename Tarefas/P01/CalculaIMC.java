public class CalculaIMC{
	public static void main(String args[]){
		
		Pessoa p = new Pessoa(81.5, 1.8);
		System.out.println("Peso => " + p.getPeso());
		System.out.println("Altura => " + p.getAltura());
		double imc = p.calcularIMC();
		System.out.println("IMC => " + imc);
		System.out.println(p.informarIMC(imc));
	}
}