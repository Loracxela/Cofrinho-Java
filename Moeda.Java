package cofrinho;

import java.util.Objects;

public abstract class Moeda {
	
	protected double valor;
	
	public Moeda(double valorAdicionado) {
		
		super();
		this.valor = valorAdicionado;
		
	}
	
	public void info() {
		
	}
	
	public double converter() {
		return valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda outro = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(outro.valor);
	}
}