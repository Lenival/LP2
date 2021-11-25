import java.text.DecimalFormat;
import java.util.Date;

public class Mulher extends PessoaIMC {
	
	public Mulher(String nome, Date dataNascimento, double peso, double altura) {
		super(nome, dataNascimento, peso, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String resultIMC() {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("##.##");
		double imc = calculaIMC();
		if (imc < 19)
			return df.format(imc) + " Abaixo do peso ideal";
		if (imc > 25.8)
			return df.format(imc) + " Acima do peso ideal";
		return df.format(imc) + " Peso ideal";
	}

}
