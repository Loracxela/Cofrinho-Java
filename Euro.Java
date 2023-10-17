package cofrinho;

public class Euro extends Moeda {
	
	public Euro(double valorAdicionado) {
		super(valorAdicionado);
	}

	@Override
	public void info() {
		System.out.println("Euro: " + valor);
	}
	
	@Override
	public double converter() {
		double total = valor * 5;
		return total;
	}

	@Override
	public String toString() {
		return "Adicionado $ " + valor + " Euros. Equivale a R$ " + converter() + " Reais.";
	}
}
