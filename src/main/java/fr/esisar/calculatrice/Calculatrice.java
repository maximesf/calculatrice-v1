package fr.esisar.calculatrice;


import java.util.HashSet;
import java.util.Set;

import fr.esisar.calculatrice.operation.Operation;


public class Calculatrice {

	private Set<Operation> listeOperation;
	
	public Calculatrice(Set<Operation> listeOperation) {
		this.listeOperation = listeOperation;
	}
	
	public Calculatrice() {
		this.listeOperation = new HashSet<>();
	}
	
	public void ajouterOperation(Operation operation) {
		listeOperation.add(operation);
	}
	
	
	public Operation chercherOperation(String nom) {
		
		for (Operation op : listeOperation) {
			if(op.getNom().equals(nom)){
				return op;
			}
		}
		return null;
	
    }
	
	
	public Double calculer (String nom, Double operande1, Double operande2) throws CalculatriceException {
		
		Operation operation = chercherOperation(nom);
		if(operation == null) {
			throw new CalculatriceException("Opération inconnue");
		}
		
		return operation.calculer(operande1,operande2);
		
	}
	
	
	
}
