import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class BancoDados {
	private ArrayList<Professor> professores = new ArrayList<Professor>();

	public void adicionarProfessor(Professor a) {
		this.professores.add(a);
	}

	public void removerProfessor(Professor a) {
		this.professores.remove(professores.indexOf(a));
	}

	public void exibirProfessor() {
		System.out.println("Os elementos cadastrados s�o:");
		for (Professor a : professores)
			System.out.println(a.toString());
	}
	
	public void informarNumeroProfessor() {
		System.out.println("O n�mero de professores na escola �: "+ professores.size());
	}
	
	public void informarMaiorSalario() {
		Professor professorTemp = new Professor();
		for (Professor a : professores)
			if (professorTemp.getSalario() < a.getSalario())
				professorTemp = a;
		System.out.println("O maior sal�rio � de " + professorTemp.getSalario() + ", do professor " + professorTemp.getNome());
	}

	public void informarMaisJovem()   throws ParseException {

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Professor professorTemp = new Professor("dummy", "0", formato.parse("01/01/1900"), 10000,
				"Mestrado", "dummy", 0);
		for (Professor a : professores)
			if (professorTemp.getDataNascimento().before(a.getDataNascimento()))
				professorTemp = a;
		System.out.println("O professor mais jovem � " + professorTemp.getNome());
	}
	
	public void informarMaisAntigo()   throws ParseException {

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Professor professorTemp = new Professor("dummy", "0", formato.parse("01/01/2021"), 10000,
				"Mestrado", "dummy", 0);
		for (Professor a : professores)
			if (professorTemp.getDataNascimento().after(a.getDataNascimento()))
				professorTemp = a;
		System.out.println("O professor mais jovem � " + professorTemp.getNome());
	}
	

	public void listarTotalSalario() {
		double salarioTemp = 0;
		for (Professor a : professores)
			salarioTemp += a.getSalario(); 
		System.out.println("O valor total dos sal�rios a serem pagos �: " + salarioTemp);
	}
	

	public void listarMediaHorasHoristas() {
		int horasTrabalhadasTemp = 0;
		int numeroHoristas = 0;
		for (Professor a : professores)
			if (a instanceof ProfessorHorista) {
				horasTrabalhadasTemp += ((ProfessorHorista) a).getHorasTrabalhadas();
				numeroHoristas++;
			} 
		System.out.println("O valor m�dio de horas trabalhadas dos horistas �: " + ((double)horasTrabalhadasTemp/numeroHoristas));
	}
	
	public void listarProfessoresDisciplina(String disciplina) {
		ArrayList<Professor> professoresDisciplina = new ArrayList<Professor>();
		for (Professor a : professores)
			if (a.getDisciplina().equals(disciplina))
				professoresDisciplina.add(a);
		System.out.println("A disciplina " + disciplina + " � ministrada pelos seguintes professores:");
		for (Professor professor : professoresDisciplina) {
			System.out.println(professor.getNome());
		}
	}

	public void listarProfessoresFormacao(String formacao) {
		ArrayList<Professor> professoresDisciplina = new ArrayList<Professor>();
		for (Professor a : professores)
			if (a.getNivelEscolaridade().equals(formacao))
				professoresDisciplina.add(a);
		System.out.println("O professores com " + formacao + " s�o:");
		for (Professor professor : professoresDisciplina) {
			System.out.println(professor.getNome());
		}
	}
	
	public void listarProfessoresPorDisciplinas(ArrayList<String> disciplinas) {
		for (String s : disciplinas)
			listarProfessoresDisciplina(s);
	}
	
	public void listarProfessoresPorFormacoes(ArrayList<String> formacao) {
		for (String s : formacao)
			listarProfessoresFormacao(s);
	}
}
