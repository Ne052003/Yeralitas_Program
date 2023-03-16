
package Controlador;

import Modelo.*;
import Modelo.Producto;
import Vista.Eliminar_JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * Neoly Alexis
 */
public class Eliminar_Control implements ActionListener {
    
    //Se declara la vista que utiliza el controlador y la clase Eliminar donde se encuentran los métodos
    Eliminar_JFrame eliminarVista;
    Eliminar gestorEliminar;
    
    //Constructor
    public Eliminar_Control(Eliminar_JFrame eliminarVista){
        this.eliminarVista= eliminarVista;
        gestorEliminar= new Eliminar();
    }
    
    //Método sobreescrito que según la acción en la vista Eliminar_JFrame, consultará o eliminará registros
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource().equals(eliminarVista.btn_buscar)){
        DefaultTableModel tmodelo;
        
        String tabla= eliminarVista.combox_tabla.getSelectedItem().toString();
        String Dato= eliminarVista.txt_dato.getText();
        String registro[]= new String[2];
        String titulos[]= {"ID", "Nombre"};
        
        tmodelo= new DefaultTableModel();
        tmodelo.setColumnIdentifiers(titulos);
        
        switch(tabla){
            
            case "Cliente" -> {
                LinkedList<Cliente>clientes= gestorEliminar.consultar_Registro_Eliminar(Dato, tabla);
                for(Cliente cli:clientes){
                    registro [0]=cli.getId_cli()+"";
                    registro [1]=cli.getNom_cli();
                    tmodelo.addRow(registro);
                }
                }
            case "Producto" -> {
                LinkedList<Producto> productos= gestorEliminar.consultar_Registro_Eliminar(Dato, tabla);
                for(Producto produ:productos){
                    registro [0]=produ.getId_produ()+"";
                    registro [1]=produ.getNom_produ();
                    tmodelo.addRow(registro);
                }
                }
            case "Venta" -> {
                LinkedList<Venta> ventas= gestorEliminar.consultar_Registro_Eliminar(Dato, tabla);
                for(Venta vent:ventas){
                    registro [0]=vent.getId_venta()+"";
                    registro [1]=vent.getId_manufac()+"";
                    tmodelo.addRow(registro);
                }
                }
            case "Empleado" -> {
                LinkedList<Empleado> empleados= gestorEliminar.consultar_Registro_Eliminar(Dato, tabla);
                for(Empleado empl:empleados){
                    registro [0]=empl.getId_empleado()+"";
                    registro [1]=empl.getNom_empl();
                    tmodelo.addRow(registro);
                }
                }
            
            case "Observación" -> {
                LinkedList<Observacion> observaciones= gestorEliminar.consultar_Registro_Eliminar(Dato, tabla);
                for(Observacion observ:observaciones){
                    registro [0]=observ.getId_observ()+"";
                    registro [1]=observ.getId_produ_2()+"";
                    tmodelo.addRow(registro);
                }
                }
        }
        
        eliminarVista.table_eliminar.setModel(tmodelo);
       
        //Cuando se precione el botón eliminar
       }else if(e.getSource().equals(eliminarVista.btn_eliminar)){
           String tabla= eliminarVista.combox_tabla.getSelectedItem().toString();
           //String registro= eliminarVista.table_eliminar.
           
               int id=Integer.parseInt(eliminarVista.txt_dato.getText());
           
           gestorEliminar.eliminar_Registro(tabla, id);
       }
    }
        
    
}
