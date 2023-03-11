/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import yeralitas_program.Metodos_generales;

public class Gestor_Venta {
    
     private static LinkedList<Venta> ventas;
     private static Connection conn;
     private int msg=0;
    
    //Constructor
    public Gestor_Venta(){
        Conexion conexion= new Conexion("localhost","Yeralitas_Database","Neoly","SQLSERVERlexis_22");
        conn=conexion.getConexion();
    }
    
    //Método para agregar ventas
    public void Agregar_Venta(Venta venta){
        PreparedStatement ven;
        try {
            ven= conn.prepareStatement("Insert into venta values(?,?,?,?,?,?)");
            ven.setString(1,venta.getId_empl_2());
            ven.setString(2,venta.getId_cli_2()+"");
            ven.setString(3,venta.getId_manufac()+"");
            ven.setString(4,venta.getCantidad_manufac()+"");
            ven.setString(5,venta.getFech_venta());
            ven.setString(6,venta.getPrec_venta()+"");
            ven.executeUpdate();
            msg=JOptionPane.showConfirmDialog(null,"Venta registrada, ¿Desea agregar otro registro?");
            
        }catch(SQLException ex){
            Logger.getLogger(Gestor_Venta.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
    
    public int getMsg(){
        return msg;
    }
    
    //Método para consultar ventas
    public static LinkedList<Venta> Consultar_Venta(int atributo, String dato){
        LinkedList<Venta> resultado= new LinkedList<Venta>();
        String sql="";
            switch(atributo){
                
                case 1:
                  sql="select * from venta where id_manufac='"+dato+"'";
                break;
                case 2:
                    sql= "select * from venta where id_cli_2='"+dato+"'";
                break;
                case 3: 
                    sql= "select * from venta where id_empl_2='"+dato+"'";
                break;
                case 4: 
                    sql= "select * from venta where prec_venta='"+dato+"'";
                break;
                case 5: 
                    sql= "select * from venta where fech_venta='"+dato+"'";
                break;
            }
            
            try{
                Statement st= conn.createStatement();
                ResultSet rs= st.executeQuery(sql);
                while(rs.next()){
                    resultado.add(new Venta(rs.getInt("id_venta"), rs.getString("id_empl_2"), rs.getInt("id_cli_2"),rs.getInt("id_manufac_2"),rs.getInt("cantidad_manufac"),rs.getString("fech_venta"),rs.getFloat("prec_venta")));
                }
                st.close();
            }catch(SQLException e){
                //JOptionPane.showMessageDialog(null, e.getMessage());
                Logger.getLogger(Gestor_Venta.class.getName()).log(Level.SEVERE,null, e);
            }
        
        
        return resultado;
    }
}
