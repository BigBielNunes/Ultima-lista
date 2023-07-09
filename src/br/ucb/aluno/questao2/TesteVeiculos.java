package br.ucb.aluno.questao2;

import java.util.ArrayList;
import java.util.List;

public class TesteVeiculos {
	public static void main(String[] args) {
		List<Veiculos> veiculos = new ArrayList<>();
		
		veiculos.add(new Moto("CG", 5000, 2012));
		veiculos.add(new Carro("T-cross", 120000, 120000));
		
		for (Veiculos v : veiculos) {
			if(v instanceof Moto && ((Moto) v).getAno()>= 2008) {
				v.setPreco(v.getPreco() * 1.1);
			}
			if(v instanceof Carro && ((Carro) v).getKm()> 100000) {
				v.setPreco(v.getPreco() * 0.92);
			}
			v.printDados();
		}
	}
}
