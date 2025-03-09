package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationBinaire;
import fr.esisar.calculatrice.operations.abstractOperation;

/**
 * La classe Ajouter implémente l'interface Operation et représente l'opération d'addition.
 */
public class Ajouter extends abstractOperation implements OperationBinaire {

    /**
     * Le symbole représentant l'opération d'addition.
     */
    public final String nom = "+";

    /**
     * Retourne le symbole de l'opération d'addition.
     *
     * @return Le symbole de l'opération d'addition.
     */
    @Override
    public String getNom() {
        return nom;
    }

    /**
     * Calcule la somme de deux opérandes.
     *
     * @param operande1 Le premier opérande.
     * @param operande2 Le deuxième opérande.
     * @return La somme des deux opérandes.
     * @throws ClassCastException Si les opérandes ne sont pas des nombres valides.
     */
    @Override
    public double calculer(Double operande1, Double operande2) throws ClassCastException {
        return operande1 + operande2;
    }

	@Override
	public double calculer(Double... operandes) throws CalculatriceException {
		// On vérifie qu'on a bien 2 opérandes
        if (operandes == null || operandes.length != 2) {
            throw new CalculatriceException("Il faut 2 opérandes SVP.");
        }

        // On fait l'opération
        Double a = operandes[0];
        Double b = operandes[1];
        
        return a + b;
	}
	
    
}
