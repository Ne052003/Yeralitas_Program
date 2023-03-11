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

public class Gestor_Manufactura {
    
    LinkedList<Manufactura> manufacturas;
    private static Connection conn;
    
    public Gestor_Manufactura(){
        Conexion conexion= new Conexion("localhost","Yeralitas_Database","Neoly","SQLSERVERlexis_22");
        conn = conexion.getConexion();
        //manufacturas= new LinkedList<Manufactura>();
    }
    
    public void Agregar_Manufactura(Manufactura manufactura){
        PreparedStatement manu;
        try {
            manu= conn.prepareStatement("Insert into manufactura values(?,?)");
            manu.setString(1,manufactura.getNom_manufac());
            manu.setString(2,manufactura.getPrec_manufac()+"");
            manu.executeUpdate();
            JOptionPane.showMessageDialog(null,"Manufactura guardada");
        }catch(SQLException ex){
            Logger.getLogger(Gestor_Manufactura.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
    
    //Método para consultar 
    public LinkedList<Manufactura> Consultar_Manufactura(int atributo, String dato){
        LinkedList<Manufactura> resultado= new LinkedList<Manufactura>();
        String sql="";
        
            switch(atributo){
                
                case 1:
                  sql="select * from manufactura where id_manufac='"+dato+"'";
                break;
                case 2:
                    sql= "select * from manufactura where nom_manufac='"+dato+"'";
                break;
                case 3: 
                    sql= "select * from manufactura where prec_manufac='"+dato+"'";
                break;
            }
            
            try{
                Statement st= conn.createStatement();
                ResultSet rs= st.executeQuery(sql);
                while(rs.next()){
                    resultado.add(new Manufactura(rs.getInt("id_manufac"), rs.getString("nom_manufac"), rs.getFloat("prec_manufac")));
                }
                st.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
        
        return resultado;
    }
    
}
