package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationUnaire;
import fr.esisar.calculatrice.operations.abstractOperation;

/**
 * La classe {@code Sinus} implémente l'interface {@code OperationUnaire} et
 * permet de calculer le sinus d'une valeur.
 */
public class Sinus extends abstractOperation implements OperationUnaire {

	public final String nom = "sin";

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
	 * Calcule le sinus de l'opérande fourni.
	 *
	 * @param operande la valeur sur laquelle calculer la tangente.
	 * @return le sinus de l'opérande.
	 * @throws CalculatriceException si une erreur survient lors du calcul.
	 */

	@Override
	public double calculer(Double operande) throws CalculatriceException {
		return Math.sin(operande);
	}

	@Override
	public double calculer(Double... operandes) throws CalculatriceException {

		if (operandes == null || operandes.length == 0) {
			throw new CalculatriceException("Aucun opérande fourni");
		}
		if (operandes.length != 1) {
			throw new CalculatriceException("Il faut un opérande");
		}
		return Math.sin(operandes[0]);
	}

}
