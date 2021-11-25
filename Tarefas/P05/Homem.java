import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Date;
import java.util.Locale;

public class Homem extends PessoaIMC {

	
	public Homem(String nome, Date dataNascimento, double peso, double altura) {
		// TODO Auto-generated constructor stub
		super(nome, dataNascimento, peso, altura);
	}

	/*
	 * IMC < 20.7 : Abaixo do peso ideal
	 * 20.7 < IMC < 26.4: Peso ideal
	 * IMC > 26.4 : Acima do peso ideal */
	@Override
	public String resultIMC() {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.##",DecimalFormatSymbols.getInstance(Locale.US));
		double imc = calculaIMC();
		if (imc < 20.7)
			return df.format(imc) + " Abaixo do peso ideal";
		if (imc > 26.4)
			return df.format(imc) + " Acima do peso ideal";
		return df.format(imc) + " Peso ideal";
	}
	
	
}
