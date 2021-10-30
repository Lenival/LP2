import java.util.ArrayList;

public class Turma{
	private ArrayList<Aluno> alunos;
	
	public Turma(){
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void adicionarAluno(double notaProva1, double notaProva2){
		this.alunos.add( new Aluno(notaProva1, notaProva2 ));
	}
	
	public ArrayList<Aluno> getAlunos(){
		return this.alunos;
	}
	
	public double calcularMedia(){
		double media = 0;
		for (Aluno aluno : this.alunos){
			media += aluno.calcularMedia();
		}
		media = media/this.alunos.size();
		return media;
	}
}