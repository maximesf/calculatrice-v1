package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.CalculatriceException;

/**
 * Interface représentant une opération mathématique.
 * Les classes implémentant cette interface doivent fournir une méthode
 * pour obtenir le nom de l'opération et une méthode pour effectuer le calcul.
 */
public interface OperationBinaire {

    /**
     * Retourne le symbole ou le nom de l'opération.
     *
     * @return le symbole ou le nom de l'opération.
     */
    public String getNom();

    /**
     * Effectue le calcul de l'opération sur deux opérandes.
     *
     * @param operande1 le premier opérande.
     * @param operande2 le second opérande.
     * @return le résultat du calcul.
     * @throws CalculatriceException si une erreur survient lors du calcul,
     *                                par exemple une division par zéro.
     */
    public double calculer(Double operande1, Double operande2) throws CalculatriceException;
    
    
    
}
