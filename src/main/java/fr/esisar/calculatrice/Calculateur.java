package fr.esisar.calculatrice;


import fr.esisar.calculatrice.operation.Ajouter;
import fr.esisar.calculatrice.operation.Diviser;
import fr.esisar.calculatrice.operation.Multiplier;
import fr.esisar.calculatrice.operation.Soustraire;

public class Calculateur {
	public static void main(String[] Args) {
		Calculatrice mycalc = new Calculatrice();
		mycalc.ajouterOperation(new Diviser());
		mycalc.ajouterOperation(new Ajouter());
		mycalc.ajouterOperation(new Soustraire());
		mycalc.ajouterOperation(new Multiplier());
		
		double a = 5;
		double b = 5;
		double c = 0;
		
		try {
			System.out.println(mycalc.calculer("+", a, b));
			
		} catch (CalculatriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(mycalc.calculer("/", a, b));
		} catch (CalculatriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(mycalc.calculer("*", a, b));
		} catch (CalculatriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(mycalc.calculer("-", a, b));
		} catch (CalculatriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			mycalc.calculer("/", a, c);
		} catch (CalculatriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
