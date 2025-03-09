package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

/**
 * Classe abstraite fournissant une implémentation par défaut de {@code equals} et {@code hashCode}
 * pour les opérations. Les sous-classes doivent implémenter {@code getNom()} et
 * {@code calculer(Double...)}.
 */
public abstract class abstractOperation implements Operation {

    /**
     * Deux instances sont considérées égales si elles appartiennent à la même classe.
     *
     * @param obj l'objet à comparer
     * @return {@code true} si l'objet appartient à la même classe, {@code false} sinon
     */
    @Override
    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    /**
     * Le hashCode est basé sur la classe, garantissant que toutes les instances
     * d'une même opération ont le même hashCode.
     *
     * @return le hashCode basé sur la classe
     */
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    /**
     * Retourne le symbole ou le nom de l'opération.
     *
     * @return le symbole ou le nom de l'opération.
     */
    @Override
    public abstract String getNom();

    /**
     * Effectue le calcul de l'opération sur un (ou plusieurs) opérandes.
     *
     * @param operandes les opérandes de calcul
     * @return le résultat du calcul
     * @throws CalculatriceException si une erreur survient lors du calcul
     */
    @Override
    public abstract double calculer(Double... operandes) throws CalculatriceException;
}
