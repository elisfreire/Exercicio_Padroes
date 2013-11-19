package classes;

import interfaces.TomadaTresPinos;
import interfaces.PlugTresPinos;


public class AdaptadorEuropeu extends PlugComum implements TomadaTresPinos {
	private PlugEuropeu plugE;
	private boolean forneceEnergiaE;

	public AdaptadorEuropeu(PlugTresPinos pEuropeu) {
		this.plugE = (PlugEuropeu) pEuropeu;
		this.fornecerEnergia();
	}

	//serviço fornecerEnergia() está do diagrama de classes
	public void fornecerEnergia() {
		this.forneceEnergiaE = true;
		System.out.println("Adaptador europeu com energia");
	}

	public PlugEuropeu getPlugE() {
		return plugE;
	}

	public boolean estaFornecendo() {
		return forneceEnergiaE;
	}

}
