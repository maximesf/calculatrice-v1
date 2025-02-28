package fr.esisar.calculatrice.operation;

import fr.esisar.calculatrice.CalculatriceException;

public class Soustraire implements Operation {

	public final String nom = "-";
	
	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public double calculer(Double operande1, Double operande2) throws CalculatriceException {
		return operande1 - operande2;
	}

}
