package fr.esisar.calcultrice.operation;

import fr.esisar.calcultrice.CalculatriceException;

public class Diviser implements Operation {
	
	public final String nom = "/";

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public double calculer(Double operande1, Double operande2) throws CalculatriceException {
		if (operande2 == 0) {
	        throw new CalculatriceException("Division par 0 interdite !");
	    } 
	    return operande1 / operande2;
	}
}
