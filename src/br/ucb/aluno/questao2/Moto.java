package br.ucb.aluno.questao2;

public class Moto extends Veiculos{
	private int ano;

	public Moto(String modelo, double preco, int ano) {
		super(modelo, preco);
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String getTipo() {
		return "MOto";
	}
	@Override
	public String getDetalhes() {
		return super.getDetalhes() + "Ano: " + ano;
	}
}
