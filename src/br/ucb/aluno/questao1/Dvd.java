package br.ucb.aluno.questao1;

public class Dvd extends Midia{
	private int nFaixas;

	public Dvd(int codigo, double preco, String nome, int nFaixas) {
		super(codigo, preco, nome);
		this.nFaixas = nFaixas;
	}

	public int getnFaixas() {
		return nFaixas;
	}

	public void setnFaixas(int nFaixas) {
		this.nFaixas = nFaixas;
	}
	@Override
	public String getTipo() {
		return "DVD";
	}
	@Override
	public String getDetalhes() {
		return super.getDetalhes() + "\nnFaixas: " + nFaixas;
	}
	@Override
	public void inserirDados() {
		super.inserirDados() ;
		nFaixas = 1;
	}
}
