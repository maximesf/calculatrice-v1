package fr.esisar.calculatrice;

import java.util.Scanner;

import fr.esisar.calculatrice.operation.Ajouter;
import fr.esisar.calculatrice.operation.Diviser;
import fr.esisar.calculatrice.operation.Multiplier;
import fr.esisar.calculatrice.operation.Soustraire;

/**
 * Classe principale du programme permettant d'effectuer des calculs mathématiques
 * en utilisant différentes opérations (+, -, *, /)
 * 
 * 
 * Elle instancie une {@link Calculatrice}, lui ajoute des opérations,
 * et exécute quelques calculs en affichant les résultats
 * 
 * @author BLANC - COULIBALY
 * @version 1.1
 */

public class Calculateur {
	
	  /**
     * 
     * Initialise une calculatrice, ajoute les opérations disponibles,
     * et effectue des calculs en gérant les exceptions possibles.
     *
     * @param args Arguments de la ligne de commande (non utilisés ici).
     */
	
	public static void main(String[] args) {
		
        Calculatrice mycalc = new Calculatrice();
        mycalc.ajouterOperation(new Diviser());
		mycalc.ajouterOperation(new Ajouter());
		mycalc.ajouterOperation(new Soustraire());
		mycalc.ajouterOperation(new Multiplier());

        Scanner scanner = new Scanner(System.in);
        System.out.print("CALCULATRICE");
        while (true) {
        	
            System.out.print("> Entrez la première valeur : ");
            String input = scanner.nextLine();
            double a;
            
            try {
                a = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("> Valeur invalide. Veuillez entrer un nombre.");
                continue;
            }

            System.out.print("Entrez l'opération (+, -, *, /): ");
            String operation = scanner.nextLine();

            System.out.print("> Entrez la deuxième valeur : ");
            
            double b;
            try {
                b = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("> Valeur invalide. Veuillez entrer un nombre.");
                continue;
            }

            try {
                double result = mycalc.calculer(operation, a, b);
                System.out.println("> Résultat: " + result);
            } catch (CalculatriceException e) {
                System.out.println("> Erreur: " + e.getMessage());
            }
        }
	}
}
