/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Recursos.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Gestor_Gerente {
     private static LinkedList<Gerente> gerentes;
     private static Connection conn;
     private int msg=0;
     
    //Constructor
    public Gestor_Gerente(){
        Conexion conexion= new Conexion("localhost","Yeralitas_Database","Neoly","SQLSERVERlexis_22");
        conn= conexion.getConexion();
        //gerentes = new LinkedList<Gerente>();
    }
    
    //Método para agregar gerentes
    public void Agregar_Gerente(Gerente gerente){
        PreparedStatement ger;
        try{
            ger= conn.prepareStatement("Insert into gerente values(?,?,?,?,?,?,?)");
            ger.setString(1,gerente.getId_geren());
            ger.setString(2,gerente.getNom_geren());
            ger.setString(3,gerente.getApe_geren());
            ger.setString(4,gerente.getContraseña());
            ger.setString(5,gerente.getNum_geren());
            ger.setString(6,gerente.getCorreo());
            ger.setString(7,gerente.getFech_nac_geren());
            ger.executeUpdate();
            msg= JOptionPane.showConfirmDialog(null, "Gerente registrado, ¿Desea agregar otro registro?");
        }catch(SQLException e){
            Logger.getLogger(Gestor_Venta.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    public int getMsg(){
        return msg;
    }
    
    //Método para consultar gerentes
    public static LinkedList<Gerente> Consultar_Gerente(int atributo, String dato){
        LinkedList<Gerente> resultado= new LinkedList<Gerente>();
        String sql="";
            switch(atributo){
                case 1:
                  sql="select * from gerente where id_geren='"+dato+"'";
                break;
                case 2:
                    sql= "select * from geren where nom_geren='"+dato+"'";
                break;
                case 3: 
                    sql= "select * from geren where num_geren='"+dato+"'";
                break;
            }
            try{
                Statement st= conn.createStatement();
                ResultSet rs= st.executeQuery(sql);
                while(rs.next()){
                    resultado.add(new Gerente(rs.getString("id_geren"), rs.getString("nom_geren"), rs.getString("ape_geren"),rs.getString("num_geren"),rs.getString("correo"),rs.getString("fech_nac_geren")));
                }
                st.close();
            }catch(SQLException e){
                //JOptionPane.showMessageDialog(null, e.getMessage());
                Logger.getLogger(Gestor_Venta.class.getName()).log(Level.SEVERE,null, e);
            }
        return resultado;
    }
}
