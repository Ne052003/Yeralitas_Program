/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Gerente {
    
    private String id_geren;
    private String nom_geren;
    private String ape_geren;
    private String num_geren;
    private String contrasena;
    private String correo;
    private String fech_nac_geren;
    

    //Constructor
    public Gerente( String id_geren, String nom_geren,  String ape_geren, String num_geren, String correo, String fech_nac_geren, String contrasena) {
        this.correo= correo;
        this.fech_nac_geren= fech_nac_geren;
        this.id_geren= id_geren;
        this.nom_geren= nom_geren;
        this.ape_geren= ape_geren;
        this.num_geren= num_geren;
        this.contrasena= contrasena;
    }
    
   public Gerente( String id_geren, String nom_geren,  String ape_geren, String num_geren, String correo, String fech_nac_geren) {
        this.correo= correo;
        this.fech_nac_geren= fech_nac_geren;
        this.id_geren= id_geren;
        this.nom_geren= nom_geren;
        this.ape_geren= ape_geren;
        this.num_geren= num_geren;
    }
    
    //Métodos getters y setters

    public String getId_geren() {
        return id_geren;
    }

    public void setId_geren(String id_geren) {
        this.id_geren = id_geren;
    }

    public String getNom_geren() {
        return nom_geren;
    }

    public void setNom_geren(String nom_geren) {
        this.nom_geren = nom_geren;
    }

    public String getApe_geren() {
        return ape_geren;
    }

    public void setApe_geren(String ape_geren) {
        this.ape_geren = ape_geren;
    }

    public String getNum_geren() {
        return num_geren;
    }

    public void setNum_geren(String num_geren) {
        this.num_geren = num_geren;
    }

    public String getContraseña() {
        return contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFech_nac_geren() {
        return fech_nac_geren;
    }

    public void setFech_nac_geren(String fech_nac_geren) {
        this.fech_nac_geren = fech_nac_geren;
    }
   
    
    
}
