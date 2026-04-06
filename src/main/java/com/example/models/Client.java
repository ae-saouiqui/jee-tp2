package com.example.models;

import java.util.Objects;

public class Client {
    private String nom;
    private String prenom;
    private String telephone;
    private String email;

    public Client(String email, String nom, String prenom, String telephone) {
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
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
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client{");
        sb.append("nom=").append(nom);
        sb.append(", prenom=").append(prenom);
        sb.append(", telephone=").append(telephone);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.telephone, other.telephone)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
    }

    

}
