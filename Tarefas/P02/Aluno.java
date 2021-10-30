public class Aluno{
	
	private Prova provas;
	
	public Aluno(double notaParte1, double notaParte2){
		this.provas = new Prova(notaParte1, notaParte2);
	}
	
	public double calcularMedia(){
		return provas.calcularNotaTotal();
	}
}