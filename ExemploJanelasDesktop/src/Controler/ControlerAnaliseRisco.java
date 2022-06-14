package Controler;

import java.util.ArrayList;
import java.util.List;

import model.Impacto;
import model.Probabilidade;

public class ControlerAnaliseRisco {

	public ArrayList<Probabilidade>  getProbabilidades(){
		ArrayList<Probabilidade> lista = new ArrayList<Probabilidade>();
		Probabilidade p = new Probabilidade();
		p.setValor(2);
		p.setDescricao("Baixa");
		lista.add(p);
		
		p = new Probabilidade();
		p.setValor(3);
		p.setDescricao("Média");
		lista.add(p);
		
		p = new Probabilidade();
		p.setValor(4);
		p.setDescricao("Alta");
		lista.add(p);
		
		return lista;
	}
	
	public ArrayList<Impacto>  getImpactos(){
		ArrayList<Impacto> lista = new ArrayList<Impacto>();
		Impacto p = new Impacto();
		p.setValor(1);
		p.setDescricao("Baixo");
		lista.add(p);
		
		p = new Impacto();
		p.setValor(2);
		p.setDescricao("Médio");
		lista.add(p);
		
		p = new Impacto();
		p.setValor(3);
		p.setDescricao("Alto");
		lista.add(p);
		
		return lista;
	}
	
	public int calculaFatorExposicao(Probabilidade p, Impacto i) {
		return p.getValor() * i.getValor();
	}
}
