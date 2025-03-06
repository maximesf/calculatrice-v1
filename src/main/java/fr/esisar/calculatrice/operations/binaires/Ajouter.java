package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationBinaire;

/**
 * La classe Ajouter implémente l'interface Operation et représente l'opération d'addition.
 */
public class Ajouter implements OperationBinaire {

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
		// TODO Auto-generated method stub
		return 0;
	}
    
}
