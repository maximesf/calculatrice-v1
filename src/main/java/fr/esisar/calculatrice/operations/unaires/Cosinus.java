package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationUnaire;
import fr.esisar.calculatrice.operations.abstractOperation;

/**
 * La classe {@code Cosinus} implémente l'interface {@code OperationUnaire} et permet de calculer
 * le cosinus d'une valeur.
 */
public class Cosinus extends abstractOperation implements OperationUnaire{
	
	public final String nom = "cos";
	
	   /**
  * Retourne le nom de l'opération.
  *
  * @return le nom de l'opération.
  */
	
	
	@Override
	public String getNom() {
		return nom;
	}
	
    /**
     * Calcule le cosinus de l'opérande fourni.
     *
     * @param operande la valeur sur laquelle calculer la tangente.
     * @return le cosinus de l'opérande.
     * @throws CalculatriceException si une erreur survient lors du calcul.
     */
	
	@Override
	public double calculer(Double operande) throws CalculatriceException {
	    if (operande == null) {
	        throw new CalculatriceException("Opérande null");
	    }
	    return Math.cos(operande);
	}

	@Override
	public double calculer(Double... operandes) throws CalculatriceException {
	    if (operandes == null || operandes.length == 0) {
	        throw new CalculatriceException("Aucun opérande fourni");
	    }
	    if (operandes.length != 1) {
	        throw new CalculatriceException("Il faut un opérande");
	    }
	    return Math.cos(operandes[0]);
	}


}
