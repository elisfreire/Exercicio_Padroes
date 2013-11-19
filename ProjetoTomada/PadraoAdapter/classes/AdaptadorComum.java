package classes;

import interfaces.PlugDoisPinos;
import interfaces.TomadaDoisPinos;
import interfaces.TomadaTresPinos;


public class AdaptadorComum extends PlugEuropeu implements TomadaDoisPinos {
	private PlugComum plugC;
	private boolean forneceEnergiaC;


	public AdaptadorComum(PlugDoisPinos pComum) {
		this.plugC = (PlugComum) pComum;
		this.fornecerEnergia();
	}

	//serviço fornecerEnergia() está do diagrama de classes
	public void fornecerEnergia() {
		this.forneceEnergiaC = true;
		System.out.println("Adaptador comum com energia");
	}

	public PlugComum getPlugC() {
		return this.plugC;
	}

	public boolean estaFornecendo() {
		return forneceEnergiaC;
	}

}
