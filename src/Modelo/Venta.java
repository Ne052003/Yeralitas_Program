
package Modelo;

public class Venta {
    
    private int id_venta;
    private String id_empl_2;
    private int id_cli_2;
    private int id_manufac_2;
    private int cantidad_manufac;
    private String fech_venta;
    private float prec_venta;

    public Venta(String id_empl_2, int id_cli_2, int id_manufac_2, int cantidad_manufac, String fech_venta, float prec_venta) {
        this.id_empl_2 = id_empl_2;
        this.id_cli_2 = id_cli_2;
        this.id_manufac_2 = id_manufac_2;
        this.cantidad_manufac = cantidad_manufac;
        this.fech_venta = fech_venta;
        this.prec_venta = prec_venta;
    }
    
    public Venta(int id_venta, String id_empl_2, int id_cli_2, int id_manufac_2, int cantidad_manufac, String fech_venta, float prec_venta) {
        this.id_venta=id_venta;
        this.id_empl_2 = id_empl_2;
        this.id_cli_2 = id_cli_2;
        this.id_manufac_2 = id_manufac_2;
        this.cantidad_manufac = cantidad_manufac;
        this.fech_venta = fech_venta;
        this.prec_venta = prec_venta;
    }
    
    public Venta(int id_manufac_2){
        this.id_manufac_2 =id_manufac_2;
    }
    
    //Métodos getters y setters
    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getId_empl_2() {
        return id_empl_2;
    }

    public void setId_empl_2(String id_empl_2) {
        this.id_empl_2 = id_empl_2;
    }

    public int getId_cli_2() {
        return id_cli_2;
    }

    public void setId_cli_2(int id_cli_2) {
        this.id_cli_2 = id_cli_2;
    }

    public int getId_manufac() {
        return id_manufac_2;
    }

    public void setId_manufac(int id_manufac) {
        this.id_manufac_2 = id_manufac;
    }

    public int getCantidad_manufac() {
        return cantidad_manufac;
    }

    public void setCantidad_manufac(int cantidad_manufac) {
        this.cantidad_manufac = cantidad_manufac;
    }

    public String getFech_venta() {
        return fech_venta;
    }

    public void setFech_venta(String fech_venta) {
        this.fech_venta = fech_venta;
    }

    public float getPrec_venta() {
        return prec_venta;
    }

    public void setPrec_venta(float prec_venta) {
        this.prec_venta = prec_venta;
    }
    
    
    
    
}
