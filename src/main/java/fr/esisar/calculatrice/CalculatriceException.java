package fr.esisar.calculatrice;


public class CalculatriceException extends Exception {
	
	public CalculatriceException() {
		super("Une erreur s'est produite");
	}
	
	public CalculatriceException(String message) {
		super(message);
	}
}