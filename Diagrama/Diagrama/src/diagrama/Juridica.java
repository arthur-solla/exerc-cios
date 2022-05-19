package diagrama;

public class Juridica extends Pessoa {

	private double renda;
	private int dependentes;

	public Juridica() {
	}

	public Juridica(double renda, int dependentes) {
		this.renda = renda;
		this.dependentes = dependentes;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public int getDependentes() {
		return dependentes;
	}

	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}

	@Override
	public double obterLimiteCredito() {
		return super.obterLimiteCredito();
	}

}
