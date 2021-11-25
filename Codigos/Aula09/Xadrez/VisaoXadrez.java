public class VisaoXadrez{
	public static void main(String args[]){
		Peca p1 = new Peao();
		Peca p2 = new Cavalo();
		Peca p3 = new Bispo();
		
		p1.moverPeca();
		p2.moverPeca();
		p3.moverPeca();
		
		if(p1 instanceof Peca)
			System.out.println("Sim");
		else
			System.out.println("Não");
	}
}