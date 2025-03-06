package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationUnaire;

/**
 * La classe {@code Sinus} implémente l'interface {@code OperationUnaire} et permet de calculer
 * le sinus d'une valeur.
 */
public class Sinus implements OperationUnaire {
	
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
		// TODO Auto-generated method stub
		return 0;
	}
}
