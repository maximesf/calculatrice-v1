package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.CalculatriceException;

/**
 * Classe représentant l'opération de soustraction.
 * Implémente l'interface Operation pour fournir la fonctionnalité de soustraction.
 */
public class Soustraire extends abstractOperationBinaire {

    /**
     * Le symbole représentant l'opération de soustraction.
     */
    public final String nom = "-";

    /**
     * Retourne le symbole de l'opération de soustraction.
     *
     * @return le symbole de l'opération de soustraction.
     */
    @Override
    public String getNom() {
        return nom;
    }

    /**
     * Effectue la soustraction de deux opérandes.
     *
     * @param operande1 le premier opérande (minuende).
     * @param operande2 le second opérande (soustrayende).
     * @return le résultat de la soustraction.
     * @throws CalculatriceException si une erreur survient lors du calcul.
     */
    @Override
    public double calculer(Double operande1, Double operande2) throws CalculatriceException {
        return operande1 - operande2;
    }
}
