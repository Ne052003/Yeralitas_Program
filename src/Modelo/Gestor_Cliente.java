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
import yeralitas_program.Metodos_generales;

public class Gestor_Cliente {
    
    //Se declara la lista de clientes
    private static LinkedList <Cliente> clientes;
    private static Connection conn;
    
    //Constructor
    public Gestor_Cliente() {
        Conexion conexion= new Conexion("localhost","Yeralitas_Database","Neoly","SQLSERVERlexis_22");
        conn = conexion.getConexion();
        //clientes = new LinkedList<Cliente>();
    }
    
    //Método para agregar clientes
    public void Agregar_Cliente(Cliente cliente){
        PreparedStatement cli;
        try {
            cli= conn.prepareStatement("Insert into CLIENTE values(?,?,?)");
            //cli.setString(1,cliente.getId_cli()+"");
            cli.setString(1,cliente.getNom_cli());
            cli.setString(2,cliente.getNum_cli());
            cli.setString(3,cliente.getDir_cli());
            cli.executeUpdate();
            int msg=JOptionPane.showConfirmDialog(null,"Cliente registrado, ¿Desea agregar otro registro?");
            if(msg==JOptionPane.YES_OPTION){
                Metodos_generales.AgregarCli();
            }else if(msg==JOptionPane.NO_OPTION){
                Metodos_generales.RolMenu();
            }else if(msg==JOptionPane.CANCEL_OPTION){
                Metodos_generales.RolMenu();
            }
        }catch(SQLException ex){
            Logger.getLogger(Gestor_Cliente.class.getName()).log(Level.SEVERE,null, ex);
        }
        //clientes.add(cliente);
    }
    
    //Método para obtener todos los clientes
    public static LinkedList<Cliente> ObtenerClientes(){
        return clientes;
    }
    
    //Método para consultar cliente por parámetros
    public static LinkedList<Cliente> Consultar_Cliente(int atributo, String valor){
        LinkedList<Cliente> resultado= new LinkedList<Cliente>();
        String sql="";
        
            switch(atributo){
                
                case 1:
                  sql="select * from cliente where id_cli='"+valor+"'";
                break;
                case 2:
                    sql= "select * from cliente where nom_cli='"+valor+"'";
                break;
                case 3: 
                    sql= "select * from cliente where num_cli='"+valor+"'";
                break;
            }
            
            try{
                Statement st= conn.createStatement();
                ResultSet rs= st.executeQuery(sql);
                while(rs.next()){
                    resultado.add(new Cliente(Integer.parseInt(rs.getString("id_cli")), rs.getString("nom_cli"), rs.getString("num_cli"), rs.getString("dir_cli")));
                }
                st.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
        
        return resultado;
    }
    
    
}
