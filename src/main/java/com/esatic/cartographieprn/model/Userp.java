package com.esatic.cartographieprn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Userp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iduser;
    private String nom;
    private String mail;
    private String password;

    public Userp() {
    }

    public Userp(String nom, String mail, String password) {
        this.nom = nom;
        this.mail = mail;
        this.password = password;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int id) {
        this.iduser = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + iduser +
                ", nom='" + nom + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
