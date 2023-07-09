package br.ucb.aluno.questao1;

public class Cd extends Midia{
	private int nMusicas;

	public int getnMusicas() {
		return nMusicas;
	}

	public void setnMusicas(int nMusicas) {
		this.nMusicas = nMusicas;
	}

	public Cd(int codigo, double preco, String nome, int nMusicas) {
		super(codigo, preco, nome);
		this.nMusicas = nMusicas;
	}
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "CD";
	}
	@Override
	public String getDetalhes() {
		return super.getDetalhes() + "nMusicas: " + nMusicas;
	}
	@Override
	public void inserirDados() {
		super.inserirDados();
		nMusicas = 10;
	}
}
