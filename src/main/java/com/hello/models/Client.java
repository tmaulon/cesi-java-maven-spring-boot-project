package com.hello.models;

import javax.persistence.*;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String identifiant;
    private String nom;
    private String prenom;

    /*@OneToOne(cascade =  CascadeType.ALL, mappedBy = "client")*/
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "client")
    private List<CompteCourant> compteCourants;

    public Client() {}
    public Client(String identifiant, String nom, String prenom, List<CompteCourant> compteCourants) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.compteCourants = compteCourants;
    }

    /*public String toString() {
        return "Le client : " + this.nom + " " + this.prenom + " avec l'identifiant " + this.identifiant + " a un compte courant qui s'élève à un montant de : " + this.compteCourant.getSolde() ;
    }*/

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<CompteCourant> getCompteCourants() {
        return compteCourants;
    }
    public void setCompteCourants(List<CompteCourant> compteCourants) {
        this.compteCourants = compteCourants;
    }

}
