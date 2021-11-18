import java.text.ParseException;
import java.util.ArrayList;


public class BancoDados {
	private ArrayList<Professor> professores = new ArrayList<Professor>();

	public void adicionarProfessor(Professor a) {
		this.professores.add(a);
	}

	public void removerProfessor(Professor a) {
		this.professores.remove(professores.indexOf(a));
	}

	public void exibirProfessor() {
		System.out.println("Os elementos cadastrados são:");
		for (Professor a : professores)
			System.out.println(a.toString());
	}
	
	public void informarNumeroProfessor() {
		System.out.println("O número de professores na escola é: "+ professores.size());
	}
	
	public void informarMaiorSalario() {
		Professor professorTemp = new Professor();
		for (Professor a : professores)
			if (professorTemp.getSalario() < a.getSalario())
				professorTemp = a;
		System.out.println("O maior salário é de " + professorTemp.getSalario() + ", do professor " + professorTemp.getNome());
	}

	public void informarMaisJovem()   throws ParseException {
		
		ArrayList<Professor> maisJovens = new ArrayList<Professor>();
		for (Professor a : professores) {
			if (!maisJovens.isEmpty()) {
				if ((maisJovens.get(0)).getDataNascimento().equals(a.getDataNascimento()) )
					maisJovens.add(a);
				if ((maisJovens.get(0)).getDataNascimento().before(a.getDataNascimento())) {
					//professorTemp = a;
					maisJovens = new ArrayList<Professor>();
					maisJovens.add(a);
				}
			}else {
				maisJovens = new ArrayList<Professor>();
				maisJovens.add(a);
			}
		}
		System.out.println("Os professores mais jovens são:");
		for (Professor professor : maisJovens) {
			System.out.println(professor.getNome());
		}
	}
	
	public void informarMaisAntigo()   throws ParseException {
		
		ArrayList<Professor> maisAntigo = new ArrayList<Professor>();
		for (Professor a : professores) {
			if (!maisAntigo.isEmpty()) {
				if ((maisAntigo.get(0)).getDataNascimento().equals(a.getDataNascimento()) )
					maisAntigo.add(a);
				if ((maisAntigo.get(0)).getDataNascimento().after(a.getDataNascimento())) {
					//professorTemp = a;
					maisAntigo = new ArrayList<Professor>();
					maisAntigo.add(a);
				}
			}else {
				maisAntigo = new ArrayList<Professor>();
				maisAntigo.add(a);
			}
		}
		System.out.println("Os professores mais antigos são:");
		for (Professor professor : maisAntigo) {
			System.out.println(professor.getNome());
		}
		
	}
	

	public void listarTotalSalario() {
		double salarioTemp = 0;
		for (Professor a : professores)
			salarioTemp += a.getSalario(); 
		System.out.println("O valor total dos salários a serem pagos é: " + salarioTemp);
	}
	

	public void listarMediaHorasHoristas() {
		int horasTrabalhadasTemp = 0;
		int numeroHoristas = 0;
		for (Professor a : professores)
			if (a instanceof ProfessorHorista) {
				horasTrabalhadasTemp += ((ProfessorHorista) a).getHorasTrabalhadas();
				numeroHoristas++;
			} 
		System.out.println("O valor médio de horas trabalhadas dos horistas é: " + ((double)horasTrabalhadasTemp/numeroHoristas));
	}
	
	public void listarProfessoresDisciplina(String disciplina) {
		ArrayList<Professor> professoresDisciplina = new ArrayList<Professor>();
		for (Professor a : professores)
			if (a.getDisciplina().equals(disciplina))
				professoresDisciplina.add(a);
		System.out.println("A disciplina " + disciplina + " é ministrada pelos seguintes professores:");
		for (Professor professor : professoresDisciplina) {
			System.out.println(professor.getNome());
		}
	}

	public void listarProfessoresFormacao(String formacao) {
		ArrayList<Professor> professoresDisciplina = new ArrayList<Professor>();
		for (Professor a : professores)
			if (a.getNivelEscolaridade().equals(formacao))
				professoresDisciplina.add(a);
		System.out.println("O professores com " + formacao + " são:");
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
