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

public class Gestor_Producto {
     private static Connection conn;
    
    //Constructor
    public Gestor_Producto(){
        Conexion conexion= new Conexion("localhost","Yeralitas_Database","Neoly","SQLSERVERlexis_22");
        conn = conexion.getConexion();
        //productos = new LinkedList<Producto>();
    }
    
    //Método para agregar productos
    public void Agregar_Producto(Producto producto){
    PreparedStatement produ;
        try {
            produ= conn.prepareStatement("Insert into PRODUCTO values(?,?,?,?,?,?)");
            produ.setString(1,producto.getId_geren_2());
            produ.setString(2,producto.getNom_produ());
            produ.setString(3,producto.getPrec_produ()+"");
            produ.setString(4,producto.getUnidad_medida_2());
            produ.setString(5, producto.getFech_ingreso_produ());
            produ.setString(6, producto.getFech_caducidad());
            produ.executeUpdate();
            JOptionPane.showMessageDialog(null,"Producto registrado");
        }catch(SQLException ex){
            Logger.getLogger(Gestor_Cliente.class.getName()).log(Level.SEVERE,null, ex);
        }
    //productos.add(producto);
    }
    
    
    
    //Método para consultar productos
    public static LinkedList<Producto> Consultar_Producto(int atributo, String valor){
        LinkedList<Producto> resultado= new LinkedList<Producto>();
        String sql="";
            switch(atributo){
                
                //Consulta por ID
                case 1: 
                    sql="select * from Producto where id_produ='"+valor+"'";
                break;
                
                //Consulta por nombre
                case 2: 
                    sql="select * from Producto where nom_produ='"+valor+"'";
                break;
                
                //Consulta por precio
                case 3: 
                    sql="select * from Producto where prec_produ='"+valor+"'";
                break;
                
                //Consulta por fecha de ingreso
                case 4: 
                    sql="select * from Producto where fech_ingreso_produ='"+valor+"'";
                break;
                
            } try{
                Statement st= conn.createStatement();
                ResultSet rs= st.executeQuery(sql);
                while(rs.next()){
                    resultado.add(new Producto(rs.getInt("id_produ"),rs.getString("id_geren_2"), rs.getString("nom_produ"), rs.getFloat("prec_produ"), rs.getString("unidad_medida_2"), rs.getString("fech_ingreso_produ"),rs.getString("fech_caducidad")));
                }
                st.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
        
        return resultado;
    }
    
    //Método para obtener todos los productos
    /*public  static LinkedList<Producto> ConsultarTodosPro(){
        LinkedList <Producto> todoproducto= new LinkedList<Producto>();
        String sql1="select * from producto";
        try{
            Statement st= conn.createStatement();
            ResultSet rs= st.executeQuery(sql1);
            while(rs.next()){
                    todoproducto.add(new Producto(rs.getInt("id_produ"),rs.getString("id_geren_2"), rs.getString("nom_produ"), rs.getFloat("prec_produ"), rs.getString("unidad_medida_2"), rs.getString("fech_ingreso_produ"),rs.getString("fech_caducidad")));
                }
            st.close();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return todoproducto;
    }*/
}
