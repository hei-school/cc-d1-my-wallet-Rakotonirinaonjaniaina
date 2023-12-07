package org.example;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Portefeuille portefeuille = new Portefeuille();

        while (true) {
            System.out.println("\n1. Ajouter des fonds");
            System.out.println("2. Retirer des fonds");
            System.out.println("3. Afficher le solde");
            System.out.println("4. Afficher l'historique des transactions");
            System.out.println("5. Transférer des fonds");
            System.out.println("6. Quitter");

            System.out.print("Entrez le numéro de votre choix: ");
            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    System.out.print("Entrez le montant à ajouter: ");
                    double montantAjout = scanner.nextDouble();
                    scanner.nextLine();
                    portefeuille.ajouterFonds(montantAjout);
                    break;
                case "2":
                    System.out.print("Entrez le montant à retirer: ");
                    double montantRetrait = scanner.nextDouble();
                    scanner.nextLine();
                    portefeuille.retirerFonds(montantRetrait);
                    break;
                case "3":
                    portefeuille.afficherSolde();
                    break;
                case "4":
                    portefeuille.afficherHistoriqueTransactions();
                    break;
                case "5":
                    System.out.print("Entrez le montant à transférer: ");
                    double montantTransfert = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Entrez le destinataire du transfert: ");
                    String destinataire = scanner.nextLine();
                    portefeuille.transfererFonds(montantTransfert, destinataire);
                    break;
                case "6":
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un numéro valide.");
            }
        }
    }
}
