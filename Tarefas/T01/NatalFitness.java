import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class NatalFitness{
	public static void main(String args[]) throws ParseException{
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		BancoDeDados BD = new BancoDeDados();
		
		Funcionario f1 = new Funcionario("001","Bernardo",0);
		Professor p1 = new Professor("002","Popeye",0,"Musculação");
		Professor p2 = new Professor("003","Phelps",0,"Natação");
		Professor p3 = new Professor("004","Arnold",0,"Musculação");
		
		
		
		Aluno a1 = new Aluno("584.659.745-62","Neymar",formato.parse("10/03/1992"));
		a1.adicionarTreino("10:00","Hipertrofia");
		a1.adicionarTreino("11:00","Ergometria");
		p1.adicionarAluno(a1);
		Aluno a2 = new Aluno("234.897.954-78","Marta",formato.parse("10/03/1986"));
		a2.adicionarTreino("08:00","Nado de Costas");
		a2.adicionarTreino("07:00","Nado Livre");
		a2.adicionarTreino("09:00","Nado Borboleta");
		p2.adicionarAluno(a2);
		Aluno a3 = new Aluno("345,234,954-13","Bruninho do volei",formato.parse("10/03/1986"));
		a3.adicionarTreino("11:00","Hipertrofia");
		a3.adicionarTreino("07:00","Ergometria");
		p3.adicionarAluno(a3);
		
		BD.adicionarFuncionario(p1);
		BD.adicionarFuncionario(p2);
		BD.adicionarFuncionario(p3);
		BD.adicionarFuncionario(f1);
		
		System.out.println("\n");
		BD.listarFuncionarios();
		System.out.println("\n");
		BD.listarAtividades();
		System.out.println("\n");
		BD.listarAlunos();
		
		//System.out.println(p3.getClass().getSimpleName());
	
	}

}