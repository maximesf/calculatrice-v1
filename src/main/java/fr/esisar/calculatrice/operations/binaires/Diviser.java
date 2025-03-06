package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationBinaire;

/**
 * Classe représentant l'opération de division.
 * Implémente l'interface Operation pour fournir la fonctionnalité de division.
 */
public class Diviser implements OperationBinaire {

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
		// TODO Auto-generated method stub
		return 0;
	}
    
}
