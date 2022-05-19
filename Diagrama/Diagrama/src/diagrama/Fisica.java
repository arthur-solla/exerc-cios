package diagrama;

public class Fisica extends Pessoa {

	private String razaoSocial;
	private double faturamento;

	public Fisica() {
	}

	public Fisica(String razaoSocial, double faturamento) {
		this.razaoSocial = razaoSocial;
		this.faturamento = faturamento;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}

	@Override
	public double obterLimiteCredito() {
		return super.obterLimiteCredito();
	}

}
