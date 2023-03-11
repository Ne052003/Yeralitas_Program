/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Manufactura {
    
    private int id_manufac;
    private String nom_manufac;
    private float prec_manufac;

    //Constuctor 

    public Manufactura(String nom_manufac, float prec_manufac) {
        this.nom_manufac = nom_manufac;
        this.prec_manufac = prec_manufac;
    }
    public Manufactura(int id_manufac, String nom_manufac, float prec_manufac) {
        this.id_manufac=id_manufac;
        this.nom_manufac = nom_manufac;
        this.prec_manufac = prec_manufac;
    }
    
    //Métodos setters y getters
    public int getId_manufac() {
        return id_manufac;
    }

    public void setId_manufac(int id_manufac) {
        this.id_manufac = id_manufac;
    }

    public String getNom_manufac() {
        return nom_manufac;
    }

    public void setNom_manufac(String nom_manufac) {
        this.nom_manufac = nom_manufac;
    }

    public float getPrec_manufac() {
        return prec_manufac;
    }

    public void setPrec_manufac(float prec_manufac) {
        this.prec_manufac = prec_manufac;
    }
    
    
}
