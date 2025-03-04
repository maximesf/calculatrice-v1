package fr.esisar.calculatrice;


/**
 * Exception personnalisée pour la gestion de la division par 0.
 * 
 * Cette exception est levée lorsque l'opération demandée est invalide, ou que c'est une division par 0
 * 
 */
public class CalculatriceException extends Exception {

    private static final long serialVersionUID = 1L;

	/**
     * Constructeur par défaut avec un message générique.
     * Indique qu'une erreur s'est produite lors d'un calcul.
     */
    public CalculatriceException() {
        super("Une erreur s'est produite");
    }

    /**
     * Constructeur avec un message personnalisé.
     * 
     * @param message Description de l'erreur rencontrée.
     */
    public CalculatriceException(String message) {
        super(message);
    }
}
