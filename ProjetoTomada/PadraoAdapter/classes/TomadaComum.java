package classes;

import interfaces.TomadaDoisPinos;

public class TomadaComum implements TomadaDoisPinos {
	private PlugComum plugComum;
	private boolean fornecimento;


	public TomadaComum(PlugComum plugC) {
		plugC.conectar();
		this.plugComum = plugC;
		this.fornecerEnergia();
	}

	public PlugComum getPlugComum() {
		return this.plugComum;
	}

	public void fornecerEnergia() {
		fornecimento = true;
		System.out.println("Fornecendo energia para a tomada comum :)");
	}

	public boolean estaFornecimento() {
		return fornecimento;
	}
	
	public String toString() {
		return "Tomada Comum: plug comum -> fornecendo energia !";
	}
	
	
	
}
