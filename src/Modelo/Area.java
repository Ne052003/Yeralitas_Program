
package Modelo;

public class Area {
    
    private int codigo_area;
    private String nom_area;

    //Constructor
    public Area(String nom_area) {
        this.nom_area = nom_area;
    }
    
    //Getters y setters
    public int getCodigo_area() {
        return codigo_area;
    }

    public void setCodigo_area(int codigo_area) {
        this.codigo_area = codigo_area;
    }

    public String getNom_area() {
        return nom_area;
    }

    public void setNom_area(String nom_area) {
        this.nom_area = nom_area;
    }
    
    
}
