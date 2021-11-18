import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Escola {

	public static void main(String[] args)  throws ParseException{
		// TODO Auto-generated method stub
		

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Professor pi1 = new  ProfessorIntegral("pi1", "1", formato.parse("10/03/1992"), 10000,
				"Doutorado", "Matemática",formato.parse("10/03/2010"), 1);
		pi1.setSalario(10000);
		Professor pi2 = new  ProfessorIntegral("pi2", "2", formato.parse("10/03/1991"), 10000,
				"Doutorado", "Português",formato.parse("10/03/2010"), 2);
		pi2.setSalario(10000);
		Professor pi3 = new  ProfessorIntegral("pi3", "3", formato.parse("10/03/1990"), 10000,
				"Doutorado", "SO",formato.parse("10/03/2010"), 4);
		pi3.setSalario(10000);
		

		Professor ph1 = new  ProfessorHorista("ph1", "100001", formato.parse("10/03/1997"), 25, 10000,
				"Mestrado", "Português", 0);
		ph1.setSalario(1000);
		Professor ph2 = new  ProfessorHorista("ph2", "100002", formato.parse("10/03/1996"), 40, 10000,
				"Especialização", "AC", 0);
		ph2.setSalario(1000);
		Professor ph3 = new  ProfessorHorista("ph3", "100003", formato.parse("10/03/1995"), 30, 10000,
				"Superior", "Matemática", 2);
		ph3.setSalario(1000);
		
		BancoDados bd = new BancoDados();
		
		bd.adicionarProfessor(pi1);
		bd.adicionarProfessor(pi2);
		bd.adicionarProfessor(pi3);
		bd.adicionarProfessor(ph1);
		bd.adicionarProfessor(ph2);
		bd.adicionarProfessor(ph3);
		
		bd.informarNumeroProfessor();
		bd.informarMaiorSalario();
		bd.informarMaisJovem();
		bd.informarMaisAntigo();
		bd.listarTotalSalario();
		bd.listarMediaHorasHoristas();
		//bd.listarProfessoresDisciplina("Português");
		//bd.listarProfessoresDisciplina("Matemática");
		ArrayList<String> tempDisciplinas = new ArrayList<String>();
		tempDisciplinas.add("Português");
		tempDisciplinas.add("Matemática");
		bd.listarProfessoresPorDisciplinas(tempDisciplinas);
		//bd.listarProfessoresFormacao("Mestrado");
		//bd.listarProfessoresFormacao("Doutorado");
		ArrayList<String> tempFormacoes = new ArrayList<String>();
		tempFormacoes.add("Mestrado");
		tempFormacoes.add("Doutorado");
		bd.listarProfessoresPorFormacoes(tempFormacoes);
		
	}

}
