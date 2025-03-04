package fr.esisar.calculatrice.operations.binaires;

/**
 * La classe Ajouter implémente l'interface Operation et représente l'opération d'addition.
 */
public class Ajouter extends abstractOperationBinaire {

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
    
}
