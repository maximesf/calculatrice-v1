package fr.esisar.calcultrice.operation;

import fr.esisar.calcultrice.CalculatriceException;

class Divisertest implements Operation {
	
	public final String nom = "/";
			
	@Override
	public String getNom() {
		return nom;
	}
	
	@Override
	public double calculer(Double operande1, Double operande2) throws CalculatriceException {
		
		Double res = null;
		if(operande2==0) {
			new CalculatriceException("Division par 0 interdite !");
		} else {
			res = operande1/operande2;
		}
		return res;
	}
}
