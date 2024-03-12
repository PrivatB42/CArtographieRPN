package com.esatic.cartographieprn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String email;
    private String domaineinteret;
    private String competence;
    //private int niveaucompetence;
    private String objappent;

    public Utilisateur() {
    }

    public Utilisateur(String nom, String email, String domaineinteret, String competence, int niveaucompetence, String objappent) {
        this.nom = nom;
        this.email = email;
        this.domaineinteret = domaineinteret;
        this.competence = competence;
        //this.niveaucompetence = niveaucompetence;
        this.objappent = objappent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomaineinteret() {
        return domaineinteret;
    }

    public void setDomaineinteret(String domaineinteret) {
        this.domaineinteret = domaineinteret;
    }

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

    public String getObjappent() {
        return objappent;
    }

    public void setObjappent(String objappent) {
        this.objappent = objappent;
    }
}
