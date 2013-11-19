package classes;

import interfaces.PlugTresPinos;

public class PlugEuropeu implements PlugTresPinos {
	
	private boolean conectado;

	public PlugEuropeu() {
		conectado = false;
	}
	
	public boolean estaConectado() {
		return conectado;
	}
	
	public void conectar(){
		conectado = true;
	}	
	
	public void desconectar(){
		conectado = false;
		System.out.println("O plug europeu está desconectado :( ");
	}

	

}
