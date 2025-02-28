package fr.esisar.calculatrice.operation;

public class Ajouter implements Operation {

	public final String nom = "+";
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}

	@Override
	public double calculer(Double operande1, Double operande2) throws ClassCastException{
		return operande1 + operande2;
	}

}
