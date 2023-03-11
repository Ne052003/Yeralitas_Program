
package Modelo;

public class Cliente {
    private int id_cli;
    private String nom_cli;
    private String num_cli;
    private String dir_cli;

    //Constructores
    public Cliente(String nom_cli, String num_cli, String dir_cli) {
        this.nom_cli = nom_cli;
        this.num_cli = num_cli;
        this.dir_cli = dir_cli;
    }
    
    //Constructor para consulta
    public Cliente(int id_cli, String nom_cli, String num_cli, String dir_cli){
        this.id_cli= id_cli;
        this.nom_cli = nom_cli;
        this.num_cli = num_cli;
        this.dir_cli = dir_cli;
    }
    
    public Cliente(int id_cli, String nom_cli){
        this.id_cli=id_cli;
        this.nom_cli=nom_cli;
    }
    
    //Metódo para agregar un cliente
    public void agregarCliente(){
        
    }
    
    //Se generan los setters y getters de los atributos
    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public String getNom_cli() {
        return nom_cli;
    }

    public void setNom_cli(String nom_cli) {
        this.nom_cli = nom_cli;
    }

    public String getNum_cli() {
        return num_cli;
    }

    public void setNum_cli(String num_cli) {
        this.num_cli = num_cli;
    }

    public String getDir_cli() {
        return dir_cli;
    }

    public void setDir_cli(String dir_cli) {
        this.dir_cli = dir_cli;
    }
    
    
}
