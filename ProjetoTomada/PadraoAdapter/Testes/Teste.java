package Testes;

import classes.AdaptadorComum;
import classes.AdaptadorEuropeu;
import classes.PlugComum;
import classes.PlugEuropeu;
import classes.TomadaComum;
import classes.TomadaEuropeia;

public class Teste {
	public static void main(String[] args) {
		
		PlugEuropeu plugEuropeu = new PlugEuropeu();
		PlugComum plugComum = new PlugComum();
		
		System.out.println(" ");
		AdaptadorEuropeu adaptadorE = new AdaptadorEuropeu(plugEuropeu);
		AdaptadorComum adaptadorC = new AdaptadorComum(plugComum);

		System.out.println(" ");
		TomadaComum tomadaComum = new TomadaComum(adaptadorE);
				
		System.out.println(" ");
		TomadaEuropeia tomadaEuropeia = new TomadaEuropeia(adaptadorC);
		
	
	}
}