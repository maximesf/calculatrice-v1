package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationUnaire;
import fr.esisar.calculatrice.operations.abstractOperation;

/**
 * La classe {@code ValeurAbsolue} implémente l'interface {@code OperationUnaire}.
 * Elle calcule la valeur absolue d'un opérande numérique.
 */
public class ValeurAbsolue extends abstractOperation implements OperationUnaire {

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

		if (operandes == null || operandes.length == 0) {
			throw new CalculatriceException("Aucun opérande fourni");
		}
		if (operandes.length != 1) {
			throw new CalculatriceException("Il faut un opérande");
		}
		return Math.abs(operandes[0]);
	}
}
