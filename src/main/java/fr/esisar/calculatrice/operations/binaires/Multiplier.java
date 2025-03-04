package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.CalculatriceException;

/**
 * Classe représentant l'opération de multiplication.
 * Implémente l'interface Operation pour fournir la fonctionnalité de multiplication.
 */
public class Multiplier extends abstractOperationBinaire {

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
    
}
