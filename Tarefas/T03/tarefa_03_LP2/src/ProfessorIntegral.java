import java.util.Date;

public class ProfessorIntegral extends Professor {

	private Date dataInicio;

	public ProfessorIntegral(String nome, String matricula, Date dataNascimento, double salario,
			String nivelEscolaridade1, String disciplina, int numeroDependentes) {
		super(nome, matricula, dataNascimento, salario, nivelEscolaridade1, disciplina, numeroDependentes);
		// TODO Auto-generated constructor stub
		
	}

	public ProfessorIntegral(String nome, String matricula, Date dataNascimento, double salario,
			String nivelEscolaridade1, String disciplina, Date
			dataInicio, int numeroDependentes) {
		super(nome, matricula, dataNascimento, salario, nivelEscolaridade1, disciplina, numeroDependentes);
		// TODO Auto-generated constructor stub
		this.dataInicio = dataInicio;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	@Override
	public void setSalario(double salario) {
		// TODO Auto-generated method stub
		this.salario = salario + numeroDependentes*super.bonus;
	}
	
	
	
}
