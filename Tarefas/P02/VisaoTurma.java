public class VisaoTurma {
	public static void main(String args[]){

		Turma turma = new Turma();
		
		turma.adicionarAluno(6.5, 8.0);
		turma.adicionarAluno(9.5, 3.0);
		turma.adicionarAluno(7.5, 9.0);
 
		System.out.println("A nota da turma é " + turma.calcularMedia());
	}
}