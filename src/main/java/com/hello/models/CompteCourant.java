package com.hello.models;

import javax.persistence.*;

@Entity
@Table(name = "compte_courant")
public class CompteCourant {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String numero;
    private String intitule;
    private double solde;
    @Column(name = "montant_decouvert_autorise")
    private double montantDecouvertAutorise;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public CompteCourant() {}

    public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise)
    {
        this.numero = numero;
        this.intitule = intitule;
        this.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    /*public String toString() {
        return "Le compte courant N° " + this.numero + " intitulé " + this.intitule + " a un solde " + this.solde + " avec un montant découvert autorisé de : " + this.montantDecouvertAutorise ;
    }*/


    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }
    public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
}
