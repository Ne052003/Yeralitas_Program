/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursos;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion{
    
    public Connection conexion;
    
        private String usr;
        private String pass;
        private String bd;
        private String ip;
        private String puerto;
        //private String cadena;
        private String driver;
        private String url;
        
    public Conexion(String ip, String bd, String usr, String pass){
        driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        this.usr=usr;
        this.pass=pass;
        this.bd=bd;
        url= "jdbc:sqlserver://localhost:"+"1433"+";"+"databaseName="+bd;
        try{
            Class.forName(driver).newInstance(); 
            conexion = DriverManager.getConnection(url,usr,pass);
        }catch(Exception e){    
            JOptionPane.showMessageDialog(null,"Error al intentar conectarse a la base de datos" + e.toString());
        }
    }
    
    //Constructor para conectarse a base de datos remota en Azure
    /*public Conexion(){
        driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        usr="Neoly";
        pass="SQLSERVERlexis_22";
        bd="Yeralitas_Program";
        url= "jdbc:sqlserver://yeralitasqlserver.database.windows.net:"+"1433"+";"+"databaseName="+bd;
        try{
            Class.forName(driver).newInstance(); 
            conexion = DriverManager.getConnection(url,usr,pass);
        }catch(Exception e){    
            JOptionPane.showMessageDialog(null,"Error al intentar conectarse a la base de datos" + e.toString());
        }
    }*/
    
    /*jdbc:sqlserver://yeralitasqlserver.database.windows.net:1433;
    database=Yeralitas_Program;
    user=Neoly@yeralitasqlserver;
    password={your_password_here};
    encrypt=true;
    trustServerCertificate=false;
    hostNameInCertificate=*.database.windows.net;loginTimeout=30;
    */
    public Connection getConexion(){
        return conexion;
    }
    
    public Connection desconectarDB(){
        try{
           conexion.close(); 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No fue posible finalizar la conexión"+e);
        }
        
        conexion=null;
        return conexion;
    }
    
}
