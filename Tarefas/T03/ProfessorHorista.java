import java.util.Date;

public class ProfessorHorista extends Professor {

	private int horasTrabalhadas;
	private final double valorPorHora = 55.00;


	public ProfessorHorista(String nome, String matricula, Date dataNascimento, double salario,
			String nivelEscolaridade1, String disciplina, int numeroDependentes) {
		super(nome, matricula, dataNascimento, salario, nivelEscolaridade1, disciplina, numeroDependentes);
		// TODO Auto-generated constructor stub
	}


	public ProfessorHorista(String nome, String matricula, Date dataNascimento, int
			horasTrabalhadas, double salario,
			String nivelEscolaridade1, String disciplina, int numeroDependentes) {
		super(nome, matricula, dataNascimento, salario, nivelEscolaridade1, disciplina, numeroDependentes);
		// TODO Auto-generated constructor stub
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	@Override
	public void setSalario(double salario) {
		// TODO Auto-generated method stub
		this.salario = salario + horasTrabalhadas*valorPorHora + numeroDependentes*super.bonus;
	}

}
