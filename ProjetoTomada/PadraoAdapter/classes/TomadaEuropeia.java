package classes;

import interfaces.TomadaTresPinos;

public class TomadaEuropeia implements TomadaTresPinos {
	private PlugEuropeu plugEuropeu;
	private boolean fornecimento;

	public TomadaEuropeia(PlugEuropeu plugE) {
		plugE.conectar();
		this.plugEuropeu = plugE;
		this.fornecerEnergia();
	}

	public PlugEuropeu getPlugEuropeu() {
		return plugEuropeu;
	}

	public void fornecerEnergia() {
		this.fornecimento = true;
		System.out.println("Fornecendo energia para a tomada europeia :)");

	}

	public boolean estaFornecendo() {
		return fornecimento;
	}

	public String toString() {
		return "Tomada Europeia: Plug Europeu -> fornecendo energia !";
	}

	
}
