package fr.esisar.calcultrice.operation;

import fr.esisar.calcultrice.CalculatriceException;

public interface Operation {
	
	public String getNom();
	
	public double calculer(Double operande1,Double operande2) throws CalculatriceException;
}
