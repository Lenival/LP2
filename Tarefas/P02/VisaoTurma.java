import java.util.ArrayList;

public class VisaoTurma {
	public static void main(String args[]){

		Turma turma = new Turma();
		
		// Inicializa turma com notas das duas avalia��es de 3 alunos 
		turma.adicionarAluno(6.5, 8.0);
		turma.adicionarAluno(9.5, 3.0);
		turma.adicionarAluno(7.5, 9.0);
		
		// Mostrar alunos e notas
		ArrayList<Aluno> alunos = new ArrayList<Aluno>(turma.getAlunos());
		for (int i=0; i < alunos.size(); i++)
			System.out.println("A m�dia do aluno " + i + " � " +  (alunos.get(i)).calcularMedia());
		
		// Mostrar m�dia da turma
		System.out.println("A m�dia da turma � " + turma.calcularMedia());
	}
}