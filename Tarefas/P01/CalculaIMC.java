public class CalculaIMC{
	public static void main(String args[]){
		
		//System.out.println("args => " + args[0]);
		Pessoa p = new Pessoa(129.3600324, 1.8);
		System.out.println("Peso => " + p.getPeso());
		System.out.println("Altura => " + p.getAltura());
		System.out.println("IMC => " + p.calcularIMC());
		System.out.println(p.informarIMC(p.calcularIMC()));
		
	}
}