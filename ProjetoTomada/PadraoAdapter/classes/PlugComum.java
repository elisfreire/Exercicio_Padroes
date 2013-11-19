package classes;

import interfaces.PlugDoisPinos;

public class PlugComum implements PlugDoisPinos {

	private boolean conectado;

	public PlugComum() {
		conectado = false;
	}

	public void conectar() {
		conectado = true;
	}

	public boolean estaConectado() {
		return conectado;
	}
	
	public void desconectar() {
		conectado = false;
		System.out.println("O plug comum está desconectado :( ");
	}

	

}
