package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationBinaire;
import fr.esisar.calculatrice.operations.abstractOperation;

/**
 * Classe représentant l'opération de division.
 * Implémente l'interface Operation pour fournir la fonctionnalité de division.
 */
public class Diviser extends abstractOperation implements OperationBinaire {

    /**
     * Le symbole représentant l'opération de division.
     */
    public final String nom = "/";

    /**
     * Retourne le symbole de l'opération de division.
     *
     * @return le symbole de l'opération de division.
     */
    @Override
    public String getNom() {
        return nom;
    }

    /**
     * Effectue la division de deux opérandes.
     *
     * @param operande1 le premier opérande (dividende).
     * @param operande2 le second opérande (diviseur).
     * @return le résultat de la division.
     * @throws CalculatriceException si le diviseur est zéro.
     */
    @Override
    public double calculer(Double operande1, Double operande2) throws CalculatriceException {
        if (operande2 == 0) {
            throw new CalculatriceException("Division par 0 interdite !");
        }
        return operande1 / operande2;
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
        if (b == 0) {
            throw new CalculatriceException("Division par zéro impossible.");
        }
        return a / b;
	}
    
}
