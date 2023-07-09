package br.ucb.aluno.questao2;

public class Veiculos {
	private String modelo;
	private double preco;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Veiculos(String modelo, double preco) {
		super();
		this.modelo = modelo;
		this.preco = preco;
	}
	public String getTipo() {
		return "Veiculo";
	}
	public String getDetalhes() {
		return "Modelo: " + modelo +
				"Preco: " + preco ;
	}
	public void printDados() {
		System.out.println(getTipo() + getDetalhes());
	}
}
