package fr.esisar.calculatrice.operation;

import fr.esisar.calculatrice.CalculatriceException;

public interface Operation {
	
	public String getNom();
	
	public double calculer(Double operande1,Double operande2) throws CalculatriceException;
}
