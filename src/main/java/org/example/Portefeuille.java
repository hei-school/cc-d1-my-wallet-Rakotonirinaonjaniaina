package org.example;

import java.util.ArrayList;
import java.util.List;

public class Portefeuille {
    private double solde;
    private List<String> transactions;
    private List<String> historiqueTransactions;

    public Portefeuille() {
        this.solde = 0;
        this.transactions = new ArrayList<>();
        this.historiqueTransactions = new ArrayList<>();
    }

    public void ajouterFonds(double montant) {
        this.solde += montant;
        this.transactions.add("+" + montant + " €");
        this.historiqueTransactions.add("Ajout de fonds: +" + montant + " €");
    }

    public void retirerFonds(double montant) {
        if (this.solde >= montant) {
            this.solde -= montant;
            this.transactions.add("-" + montant + " €");
            this.historiqueTransactions.add("Retrait de fonds: -" + montant + " €");
        } else {
            System.out.println("Solde insuffisant pour ce retrait.");
        }
    }

    public void afficherSolde() {
        System.out.println("Solde actuel: " + this.solde + " €");
    }

    public void afficherHistoriqueTransactions() {
        System.out.println("Historique des transactions:");
        for (String transaction : this.historiqueTransactions) {
            System.out.println(transaction);
        }
    }

    public void transfererFonds(double montant, String destinataire) {
        if (this.solde >= montant) {
            this.solde -= montant;
            this.transactions.add("-" + montant + " €");
            this.historiqueTransactions.add("Transfert de fonds: -" + montant + " € vers " + destinataire);
        } else {
            System.out.println("Solde insuffisant pour ce transfert.");
        }
    }
}