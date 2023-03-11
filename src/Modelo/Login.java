/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Recursos.Conexion;
import yeralitas_program.Metodos_generales;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login{
    
    public static String rol="";
    
    private static Connection conn;
    public static String nombre="";
    public static String apellidos="";
    public static String correo="";
    public static String identificacion="";
    public static String numero="";
    public static String fech_nac="";

    public Login(){
        Conexion conexion=new Conexion("localhost","Yeralitas_Database","Neoly","SQLSERVERlexis_22");
        conn=conexion.getConexion();
    }
    
    public int Loguear(String id, String pass){
        int tipolog=0;
        String sql="select * from usuarios where identificacion='"+id+"'";
        String sql1="select * from gerente where id_geren='"+id+"'";
        String sql2="select * from administrador where identificacion='"+id+"'";
        
        try{    
                Statement st= conn.createStatement();
                Statement st1= conn.createStatement();
                Statement st2= conn.createStatement();
                ResultSet rs=st.executeQuery(sql);
                ResultSet rs1=st1.executeQuery(sql1);
                ResultSet rs2=st2.executeQuery(sql2);
                if(rs.next()){
                    rol="usuarios";
                    String contrasena=rs.getString("contraseña");
                    nombre=rs.getString("nombre");
                    identificacion=id;
                    correo=rs.getString("correo");
                    if(pass.equals(contrasena)){
                        //Metodos_generales.Menu(); 
                        tipolog=1;
                    }    
                }
                else if (rs1.next()) {
                rol = "gerente";
                String contrasena = rs1.getString("contraseña");
                apellidos = rs1.getString("ape_geren");
                nombre = rs1.getString("nom_geren");;
                identificacion = id;
                numero = rs1.getString("num_geren");
                correo = rs1.getString("correo");
                fech_nac = rs1.getString("fech_nac_geren");
                if (pass.equals(contrasena)) {
                    //Metodos_generales.Menu(); 
                    tipolog = 2;
                }
            }
                else if(rs2.next()){
                    rol="administrador";
                    String contrasena=rs2.getString("contraseña");
                     nombre=rs2.getString("nombre");
                     identificacion=rs2.getString("identificacion");
                     correo=rs2.getString("correo");
                    if(pass.equals(contrasena)){
                        //Metodos_generales.Menu(); 
                        tipolog=3;
                    }  
                }
                st.close();
                st1.close();
                st2.close();
            }catch(Exception e){
                //JOptionPane.showMessageDialog(null, e.getMessage());
                JOptionPane.showMessageDialog(null, "Error al verificar los datos" + e.getMessage());
            }
        return tipolog;
    }
    
    public static void ModificarGeren(String identificacion, String nombre, String apellido, String numero, String correo, String fech){
        String sql="update gerente set id_geren='"+identificacion+"',nom_geren='"+nombre+"',ape_geren='"+apellido+"',num_geren='"+numero+"',correo='"+correo+"',fech_nac_geren='"+fech+"'";
        try{
            Statement st =conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            JOptionPane.showMessageDialog(null, "Cambio realizado correctamente");
            st.close();
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(null, "Error al verificar los datos"+e.getMessage());
            Logger.getLogger(Gestor_Cliente.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    
    public static void Modificar(String rol, String identificacion, String nombre,String correo){
        String sql="update "+rol+" set identificacion='"+identificacion+"',nombre='"+nombre+"', correo='"+correo+"'";
        try{
            Statement st =conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            JOptionPane.showMessageDialog(null, "Cambio realizado correctamente");
            st.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al verificar los datos"+e.getMessage());
        }
    }
    
    public static String getNombre(){
        return nombre;
    }
    public static String getApellidos(){
        return apellidos;
    }
    public static String getIdentificacion(){
        return identificacion;
    }
    public static String getCorreo(){
        return correo;
    }
    public static String getFechNac(){
        return fech_nac;
    }
    public static  String getNumero(){
        return numero;
    }
    public static String getRol(){
        return rol;
    }
}
