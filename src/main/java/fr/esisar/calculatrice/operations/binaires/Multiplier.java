package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationBinaire;

/**
 * Classe représentant l'opération de multiplication.
 * Implémente l'interface Operation pour fournir la fonctionnalité de multiplication.
 */
public class Multiplier implements OperationBinaire {

    /**
     * Le symbole représentant l'opération de multiplication.
     */
    public final String nom = "*";

    /**
     * Retourne le symbole de l'opération de multiplication.
     *
     * @return le symbole de l'opération de multiplication.
     */
    @Override
    public String getNom() {
        return nom;
    }

    /**
     * Effectue la multiplication de deux opérandes.
     *
     * @param operande1 le premier opérande.
     * @param operande2 le second opérande.
     * @return le résultat de la multiplication.
     * @throws CalculatriceException si une erreur survient lors du calcul.
     */
    @Override
    public double calculer(Double operande1, Double operande2) throws CalculatriceException {
        return operande1 * operande2;
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
        
        return a * b;

	}
    
}
