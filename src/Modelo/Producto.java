
package Modelo;

public class Producto {
    
    private int id_produ;
    private String id_geren_2;
    private Float prec_produ;
    private String nom_produ;
    private String unidad_medida_2;
    private String fech_ingreso_produ;
    private String fech_caducidad;
    
    //Constructor

    public Producto(String id_geren_2, String nom_produ, Float prec_produ, String unidad_medida_2, String fech_ingreso_produ, String fech_caducidad) {
        this.id_geren_2 = id_geren_2;
        this.nom_produ = nom_produ;
        this.prec_produ= prec_produ;
        this.unidad_medida_2 = unidad_medida_2;
        this.fech_ingreso_produ = fech_ingreso_produ;
        this.fech_caducidad = fech_caducidad;
    }
    
    public Producto(int id_produ, String nom_produ){
        this.id_produ=id_produ;
        this.nom_produ= nom_produ;
    }
    public Producto(int id_produ,String id_geren_2, String nom_produ, Float prec_produ, String unidad_medida_2, String fech_ingreso_produ, String fech_caducidad){
        this.id_produ=id_produ;
        this.id_geren_2 = id_geren_2;
        this.nom_produ = nom_produ;
        this.prec_produ= prec_produ;
        this.unidad_medida_2 = unidad_medida_2;
        this.fech_ingreso_produ = fech_ingreso_produ;
        this.fech_caducidad = fech_caducidad;
    }
    
    //Métodos getters ans setters

    public int getId_produ() {
        return id_produ;
    }

    public void setId_produ(int id_produ) {
        this.id_produ = id_produ;
    }

    public String getId_geren_2() {
        return id_geren_2;
    }

    public void setId_geren_2(String id_geren_2) {
        this.id_geren_2 = id_geren_2;
    }

    public String getNom_produ() {
        return nom_produ;
    }

    public void setNom_produ(String nom_produ) {
        this.nom_produ = nom_produ;
    }

    public String getUnidad_medida_2() {
        return unidad_medida_2;
    }

    public void setUnidad_medida_2(String unidad_medida_2) {
        this.unidad_medida_2 = unidad_medida_2;
    }

    public Float getPrec_produ() {
        return prec_produ;
    }

    public void setPrec_produ(Float prec_produ) {
        this.prec_produ = prec_produ;
    }

    public String getFech_ingreso_produ() {
        return fech_ingreso_produ;
    }

    public void setFech_ingreso_produ(String fech_ingreso_produ) {
        this.fech_ingreso_produ = fech_ingreso_produ;
    }

    public String getFech_caducidad() {
        return fech_caducidad;
    }

    public void setFech_caducidad(String fech_caducidad) {
        this.fech_caducidad = fech_caducidad;
    }
    
    
}
