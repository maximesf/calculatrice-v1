package fr.esisar.calculatrice;


import java.util.Scanner;

import fr.esisar.calculatrice.operations.binaires.Ajouter;
import fr.esisar.calculatrice.operations.binaires.Diviser;
import fr.esisar.calculatrice.operations.binaires.Multiplier;
import fr.esisar.calculatrice.operations.binaires.Soustraire;
import fr.esisar.calculatrice.operations.ensemblistes.Maximum;
import fr.esisar.calculatrice.operations.ensemblistes.Minimum;
import fr.esisar.calculatrice.operations.unaires.Cosinus;
import fr.esisar.calculatrice.operations.unaires.Sinus;
import fr.esisar.calculatrice.operations.unaires.Tangente;
import fr.esisar.calculatrice.operations.unaires.ValeurAbsolue;

/**
 * Classe principale de l'application de calculatrice.
 * Permet de saisir des opérations et de les exécuter.
 */
public class Calculateur {

    /**
     * Point d'entrée du programme.
     * Gère l'interaction avec l'utilisateur pour effectuer des calculs.
     *
     * @param args Arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {
        Calculatrice calculatrice = new Calculatrice();

        // Ajout des opérations binaires
        calculatrice.ajouterOperation(new Ajouter());
        calculatrice.ajouterOperation(new Soustraire());
        calculatrice.ajouterOperation(new Multiplier());
        calculatrice.ajouterOperation(new Diviser());

        // Ajout des opérations unaires
        calculatrice.ajouterOperation(new Cosinus());
        calculatrice.ajouterOperation(new Sinus());
        calculatrice.ajouterOperation(new Tangente());
        calculatrice.ajouterOperation(new ValeurAbsolue());

        // Ajout des opérations ensemblistes
        calculatrice.ajouterOperation(new Maximum());
        calculatrice.ajouterOperation(new Minimum());

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Entrez une opération (+, -, *, /, cos, sin, tan, abs, max, min) ou 'exit' pour quitter:");
            String operation = scanner.nextLine();

            if ("exit".equalsIgnoreCase(operation)) {
                break;
            }

            try {
                switch (operation) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        System.out.println("Entrez la première valeur :");
                        double a = scanner.nextDouble();
                        System.out.println("Entrez la deuxième valeur :");
                        double b = scanner.nextDouble();
                        System.out.println(a + " " + operation + " " + b + " = " 
                                           + calculatrice.calculer(operation, a, b));
                        break;
                    case "cos":
                    case "sin":
                    case "tan":
                    case "abs":
                        System.out.println("Entrez une valeur :");
                        double valeur = scanner.nextDouble();
                        System.out.println(operation + "(" + valeur + ") = " 
                                           + calculatrice.calculer(operation, valeur));
                        break;
                    case "max":
                    case "min":
                        System.out.println("Entrez trois valeurs séparées par un espace :");
                        double x = scanner.nextDouble();
                        double y = scanner.nextDouble();
                        double z = scanner.nextDouble();
                        System.out.println(operation + "(" + x + ", " + y + ", " + z + ") = " 
                                           + calculatrice.calculer(operation, x, y, z));
                        break;
                    default:
                        System.out.println("Opération invalide.");
                }
            } catch (CalculatriceException e) {
                e.printStackTrace();
            } finally {
                // Pour ignorer le reste de la ligne et éviter tout conflit lors de la prochaine lecture
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
