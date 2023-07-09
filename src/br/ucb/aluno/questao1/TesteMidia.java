package br.ucb.aluno.questao1;

import java.util.ArrayList;
import java.util.List;

public class TesteMidia {
	public static void main(String[] args) {
		List<Midia> midias = new ArrayList<>();
		midias.add(new Midia(45, 20, "jogo\n"));
		midias.add(new Cd(34, 15, "Back", 3));
		midias.add(new Dvd(12, 5, "sertanejo", 10));
		for (Midia midia : midias) {
			midia.printDados();
		}
	}
}
