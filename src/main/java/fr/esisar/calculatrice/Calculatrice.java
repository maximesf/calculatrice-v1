package fr.esisar.calculatrice;


import java.util.HashSet;
import java.util.Set;

import fr.esisar.calculatrice.operations.Operation;


/**
 * Classe représentant une calculatrice capable d'effectuer des opérations +,/,-,* etc.
 * Elle stocke un ensemble d'opérations disponibles et permet d'exécuter un calcul en fonction d'un nom d'opération.
 * 
 */

public class Calculatrice {

    
	/** Ensemble des opérations disponibles dans la calculatrice. */
	private Set<Operation> listeOperation;
	
	 /**
     * Constructeur initialisant la calculatrice avec un ensemble d'opérations donné.
     * 
     * @param listeOperation Ensemble des opérations de la calculatrice
     */
	public Calculatrice(Set<Operation> listeOperation) {
		this.listeOperation = listeOperation;
	}
	
	 /**
     * Constructeur par défaut initialisant une calculatrice vide (sans opérations).
     */
	
	public Calculatrice() {
		this.listeOperation = new HashSet<>();
	}
	
	/**
     * Ajoute une opération à la liste des opérations prises en charge par la calculatrice.
     * 
     * @param operation Opération à ajouter.
     */
	
	public void ajouterOperation(Operation operation) {
		listeOperation.add(operation);
	}
	
	/**
	 * Retire une opération de la liste des opérations prises en charge par la calculatrice.
	 * 
	 * @param operation Opération à retirer.
	 */
	public void retirerOperation(Operation operation) {
	    listeOperation.remove(operation);
	}

	 /**
     * Recherche une opération dans la liste des opérations disponibles.
     * 
     * @param nom Nom de l'opération à rechercher.
     * @return L'opération correspondante si elle est trouvée, sinon {@code null}.
     */
	
	public Operation chercherOperation(String nom) {
		
		for (Operation op : listeOperation) {
			if(op.getNom().equals(nom)){
				return op;
			}
		}
		return null;
	
    }
	
	/**
     * Effectue un calcul en utilisant l'opération spécifiée.
     * 
     * @param nom Nom de l'opération à exécuter
     * @param operande1 Première opérande.
     * @param operande2 Deuxième opérande.
     * @return Le résultat du calcul.
     * @throws CalculatriceException Si l'opération demandée est inconnue.
     */
	
	public Double calculer (String nom, Double... operandes) throws CalculatriceException {
		
		Operation operation = chercherOperation(nom);
		
		if(operation == null) {
			throw new CalculatriceException("Opération inconnue");
		}
		
		return operation.calculer(operandes);
		
	}
	
	/**
     * Retourne le nombre d'opérations de la calculatrice.
     */
	public int getNombreOperation() {
		return listeOperation.size();
	}
	
	
	
}