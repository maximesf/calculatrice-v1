package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationUnaire;

/**
 * La classe {@code ValeurAbsolue} implémente l'interface {@code OperationUnaire}.
 * Elle calcule la valeur absolue d'un opérande numérique.
 */
public class ValeurAbsolue implements OperationUnaire {

    public static final String nom = "abs";

    /**
     * Retourne le nom de l'opération.
     *
     * @return le nom de l'opération.
     */
    @Override
    public String getNom() {
        return nom;
    }

    /**
     * Calcule la valeur absolue de l'opérande fourni.
     *
     * @param operande l'opérande sur lequel appliquer l'opération.
     * @return la valeur absolue de l'opérande.
     * @throws CalculatriceException si une erreur de calcul survient (exception
     *         personnalisée selon vos besoins).
     */
    @Override
    public double calculer(Double operande) throws CalculatriceException {
        return Math.abs(operande);
    }

	@Override
	public double calculer(Double... operandes) throws CalculatriceException {
		// TODO Auto-generated method stub
		return 0;
	}
}
