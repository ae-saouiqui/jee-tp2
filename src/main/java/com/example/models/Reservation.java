package com.example.models;

import java.util.Objects;

public class Reservation{

    private double prix;
    private String type;
    private Client client;
    private String vue;


    public Reservation(Client client ,double prix,String type){
        this.client = client;
        this.prix = prix;
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    
    public String getVue() {
        return vue;
    }

    

    public void setVue(String vue) {
        this.vue = vue;
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
        final Reservation other = (Reservation) obj;
        if (Double.doubleToLongBits(this.prix) != Double.doubleToLongBits(other.prix)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if(this.getVue().equals(other.getVue())){
            return false;
        }
        return Objects.equals(this.client, other.client);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", client=").append(client);
        sb.append("Reservation{");
        sb.append("prix=").append(prix);
        sb.append(", type=").append(type);
        sb.append(",vue=").append(vue);
        sb.append('}');
        return sb.toString();
    }



    

}
