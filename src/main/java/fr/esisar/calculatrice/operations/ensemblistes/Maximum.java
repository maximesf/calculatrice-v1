package fr.esisar.calculatrice.operations.ensemblistes;

import java.util.Collections;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationEnsembliste;

import java.util.Arrays;

/**
 * La classe {@code Maximum} implémente l'interface {@code OperationEnsembliste}
 * et permet de calculer le maximum d'un ensemble de valeurs.
 */
public class Maximum implements OperationEnsembliste {

    /**
     * Le nom de l'opération, ici "max".
     */
    public final String nom = "max";

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
     * Calcule le maximum des opérandes fournis.
     *
     * @param operandes les valeurs sur lesquelles déterminer le maximum.
     * @return le maximum des opérandes.
     * @throws CalculatriceException si aucun opérande n'est fourni.
     */
    @Override
    public double calculer(Double... operandes) throws CalculatriceException {
        if (operandes == null || operandes.length == 0) {
            throw new CalculatriceException("Aucun opérande fourni");
        }
        // operandes est un tableau !! donc l'ajout direct dans une liste intermédiaire non !
        return Collections.max(Arrays.asList(operandes));
    }

	@Override
	public double calculer(Double operande1, Double operande2) throws CalculatriceException {
		// TODO Auto-generated method stub
		return 0;
	}
}
