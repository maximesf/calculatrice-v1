package fr.esisar.calcultrice.operation;

class Multipliertest implements Operation {
	
	public final String nom = "*";
	
	@Override
	public String getNom() {
		return nom;
	}
	@Override
	public double calculer(Double operande1, Double operande2) {
		return operande1 * operande2;
	}
}