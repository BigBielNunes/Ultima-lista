package br.ucb.aluno.questao2;

public class Carro extends Veiculos{
	private double km;
	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public Carro(String modelo, double preco, double km) {
		super(modelo, preco);
		this.km = km;
	}
	public String getTipo() {
		return "Carro";
	}
	@Override
	public String getDetalhes() {
		return super.getDetalhes() + "KM: " + km;
	}
}
