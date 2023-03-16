    
package Modelo;

public class Empleado {
    
    private String id_empleado;
    private String id_gerente_2;
    private String nom_empl;
    private String ape_empl;
    private String num_empl;
    private String fech_ingreso_empl; 
    private int area_empl;
    private String fech_nac_empl;
    
    //Constructores

    public Empleado(String id_empleado, String id_gerente_2, String nom_empl, String ape_empl, String num_empl, String fech_ingreso_empl, int area_empl, String fech_nac_empl) {
        this.id_empleado= id_empleado;
        this.id_gerente_2 = id_gerente_2;
        this.nom_empl = nom_empl;
        this.ape_empl = ape_empl;
        this.num_empl = num_empl;
        this.fech_ingreso_empl = fech_ingreso_empl;
        this.area_empl = area_empl;
        this.fech_nac_empl = fech_nac_empl;
    }
    
    public Empleado(String id_empleado, String nom_empl){
        this.id_empleado= id_empleado;
        this.nom_empl= nom_empl;
    }
    
    //Se generan los Getters y Setters de los atributos antes declarados

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getId_gerente_2() {
        return id_gerente_2;
    }

    public void setId_gerente_2(String id_gerente_2) {
        this.id_gerente_2 = id_gerente_2;
    }

    public String getNom_empl() {
        return nom_empl;
    }

    public void setNom_empl(String nom_empl) {
        this.nom_empl = nom_empl;
    }

    public String getApe_empl() {
        return ape_empl;
    }

    public void setApe_empl(String ape_empl) {
        this.ape_empl = ape_empl;
    }

    public String getNum_empl() {
        return num_empl;
    }

    public void setNum_empl(String num_empl) {
        this.num_empl = num_empl;
    }

    public String getFech_ingreso_empl() {
        return fech_ingreso_empl;
    }

    public void setFech_ingreso_empl(String fech_ingreso_empl) {
        this.fech_ingreso_empl = fech_ingreso_empl;
    }

    public int getArea_empl() {
        return area_empl;
    }

    public void setArea_empl(int area_empl) {
        this.area_empl = area_empl;
    }

    public String getFech_nac_empl() {
        return fech_nac_empl;
    }

    public void setFech_nac_empl(String fech_nac_empl) {
        this.fech_nac_empl = fech_nac_empl;
    }

}
