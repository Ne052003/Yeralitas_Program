
package Modelo;
import Recursos.Conexion;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Eliminar {
    private static Connection conn;
    
    public Eliminar(){
        Conexion conexion= new Conexion("localhost","Yeralitas_Database","Neoly","SQLSERVERlexis_22");
        conn = conexion.getConexion();
    }
    
    //Método para consultar los campos ID y NOMBRE de la tabla producto
    public LinkedList consultar_Registro_Eliminar(String dato, String tabla){
        LinkedList resultado=new LinkedList();
        String sql="";
        switch(tabla){
        
            case "Producto" -> {
                sql="select id_produ, nom_produ from producto where id_produ='"+dato+"'";
                resultado= new LinkedList<Producto>();
                try{
                    Statement st= conn.createStatement();
                    ResultSet rs= st.executeQuery(sql);
                    while(rs.next()){
                        resultado.add(new Producto(rs.getInt("id_produ"),rs.getString("nom_produ")));
                    }
                    st.close();
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                return resultado;
            }
            
            case "Cliente" -> {
                sql="select id_cli, nom_cli from cliente where id_cli='"+dato+"'";
                resultado= new LinkedList<Cliente>();
                try{
                    Statement st= conn.createStatement();
                    ResultSet rs= st.executeQuery(sql);
                    while(rs.next()){
                        resultado.add(new Cliente(Integer.parseInt(rs.getString("id_cli")),rs.getString("nom_cli")));
                    }
                    st.close();
                }catch(NumberFormatException | SQLException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
            
            case "Empleado" -> {
                sql="select id_empl, nom_empl from empleado where id_empl='"+dato+"'";
                resultado= new LinkedList<Empleado>();
                try{
                    Statement st= conn.createStatement();
                    ResultSet rs= st.executeQuery(sql);
                    while(rs.next()){
                        resultado.add(new Empleado(rs.getString("id_empl"),rs.getString("nom_empl")));
                    }
                    st.close();
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                return resultado;
            }
            
            case "Observación" -> {
                sql="select id_observ, id_produ_2 from producto where id_observ='"+dato+"'";
                resultado= new LinkedList<Observacion>();
                try{
                    Statement st= conn.createStatement();
                    ResultSet rs= st.executeQuery(sql);
                    while(rs.next()){
                        resultado.add(new Observacion(Integer.parseInt(rs.getString("id_produ_2"))));
                    }
                    st.close();
                }catch(NumberFormatException | SQLException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                return resultado;
            }
            
            case "Venta" -> {
                sql="select id_venta, id_manufac_2 from venta where id_venta='"+dato+"'";
                resultado= new LinkedList<Venta>();
                try{
                    Statement st= conn.createStatement();
                    ResultSet rs= st.executeQuery(sql);
                    while(rs.next()){
                        resultado.add(new Venta(Integer.parseInt(rs.getString("id_manufac_2"))));
                    }
                    st.close();
                }catch(NumberFormatException | SQLException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
            
        }
        return resultado;
    }
    
    //Método para eliminar registros según su id y la tabla a la que pertenezcan
    public void eliminar_Registro(String tabla,int id){
        String sql="";
        String campo="";
        
        switch(tabla){
            case "Cliente" -> campo="id_cli";
            
            case "Producto" -> campo="id_produ";
            case "Empleado" -> campo="id_empl";
            case "Venta" -> campo="id_venta";
            
            case "Observacion" -> campo="id_observ";
        }
        sql="delete from "+tabla+" where "+campo+"="+id;
        try{
                Statement st= conn.createStatement();
                ResultSet rs= st.executeQuery(sql);
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                st.close();
            }catch(HeadlessException | SQLException e){
            }
    }
}
