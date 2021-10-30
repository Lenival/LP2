public class Prova{
	
	private double notaParte1 = 0;
	private double notaParte2 = 0;
	
	public Prova(double notaParte1, double notaParte2){
		this.notaParte1 = notaParte1;
		this.notaParte2 = notaParte2;
	}
	
	public double calcularNotaTotal(){
		double notaTotal = notaParte1+notaParte2;
		if (notaTotal > 10){
			notaTotal = 10;
		}
		return notaTotal;
	}
}