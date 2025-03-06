package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public interface  Operation {

    /**
     * Retourne le symbole ou le nom de l'opération.
     *
     * @return le symbole ou le nom de l'opération.
     */
    public String getNom();

    /**
     * Effectue le calcul de l'opération sur deux opérandes.
     *
     * @param operandes les opérandes de calcul
     * @return le résultat du calcul.
     * @throws CalculatriceException si une erreur survient lors du calcul,
     *                                par exemple une division par zéro.
     */
    public double calculer(Double... operandes) throws CalculatriceException;
    
    
    
}
