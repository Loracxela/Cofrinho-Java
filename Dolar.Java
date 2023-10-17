package cofrinho;

public class Dolar extends Moeda{

	public Dolar(double valorAdicionado) {
		super(valorAdicionado);
	}

	@Override
	public void info() {
		System.out.println("Dolar: " + valor);
	}
	
	@Override
	public double converter() {
		double total = valor * 5; 
		return total;
	}

	@Override
	public String toString() {
		return "Inserido $ " + valor + " Dolares. Equivale a R$ " + converter() + " Reais.";
	}
}
