
package Modelo;

import java.util.Date;

public class Observacion {
    
    private int id_observ;
    private int id_produ_2;
    private Date fech_observ;
    private String obervacion;
    
    //Constructor

    public Observacion( int id_produ_2, Date fech_observ, String obervacion) {
        this.id_produ_2 = id_produ_2;
        this.fech_observ = fech_observ;
        this.obervacion = obervacion;
    }
    
    public Observacion(int id_produ_2){
        this.id_produ_2=id_produ_2;
    }
    
    //Setter y getters
    public int getId_observ() {
        return id_observ;
    }

    public void setId_observ(int id_observ) {
        this.id_observ = id_observ;
    }

    public int getId_produ_2() {
        return id_produ_2;
    }

    public void setId_produ_2(int id_produ_2) {
        this.id_produ_2 = id_produ_2;
    }

    public Date getFech_observ() {
        return fech_observ;
    }

    public void setFech_observ(Date fech_observ) {
        this.fech_observ = fech_observ;
    }

    public String getObervacion() {
        return obervacion;
    }

    public void setObervacion(String obervacion) {
        this.obervacion = obervacion;
    }
    
    
    
}
