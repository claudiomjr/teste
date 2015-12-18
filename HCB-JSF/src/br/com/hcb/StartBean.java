package br.com.hcb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.bean.Teste;

@ManagedBean
public class StartBean {

	private Teste teste = new Teste();
	private List<Teste> listaTeste = new ArrayList<>();

	public StartBean() {

	}

	public Teste getTeste() {
		return teste;
	}

	public void setTeste(Teste teste) {
		this.teste = teste;
	}

	public List<Teste> getListaTeste() {
		return listaTeste;
	}

	public void setListaTeste(List<Teste> listaTeste) {
		this.listaTeste = listaTeste;
	}


	public void salvar(){
		System.out.println(teste.getNome());
	}
	
}
