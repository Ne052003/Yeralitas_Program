/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class ConsultaProdu_Control implements ActionListener {
    
    Inventario_JFrame consultarCliVista;
    Gestor_Producto gestorProducto;
    Gestor_Observacion gestorObservacion;
    
    public ConsultaProdu_Control(Inventario_JFrame consultarCliVista){
        this.consultarCliVista=consultarCliVista;
        gestorProducto= new Gestor_Producto();
    }
    
    //Método que recibe la acción de consulta con su atributo para filtrar
    @Override
    public void actionPerformed(ActionEvent e){
        
        DefaultTableModel tmodelo;
        
        String dato=consultarCliVista.dato_txt.getText();
        int atributo=0;
        
        if(consultarCliVista.combox_filtro.getSelectedItem()=="ID"){
            atributo=1;
        }if(consultarCliVista.combox_filtro.getSelectedItem()=="Nombre"){
            atributo=2;
        }if(consultarCliVista.combox_filtro.getSelectedItem()=="Gerente"){
            atributo=3;
        }if(consultarCliVista.combox_filtro.getSelectedItem()=="Fecha de ingreso"){
            atributo=4;
        }
        //Se crea el linkedList con los productos que cumplen la consulta
        LinkedList<Producto> productos= gestorProducto.Consultar_Producto(atributo, dato);
        //LinkedList<Observacion> observaciones= new LinkedList<Observacion>();
        
        String registro[]= new String[7];
        String titulos[]= {"ID Gerente","ID", "Nombre", "Precio", "Unidad de medida", "Fecha de ingreso", "Fecha de vencimiento"};
        
        //Se inicializa la tabla 
        tmodelo= new DefaultTableModel();
        tmodelo.setColumnIdentifiers(titulos);
        
        //For each para agregar a la tabla los registros que cumplan con la consulta
        for(Producto produ: productos){
            registro[0]= produ.getId_produ()+"";
            //String dato1= produ.getId_produ()+"";observaciones= gestorObservacion.Consultar_Observacion(atributo1,dato1);
            registro[0]= produ.getId_geren_2();
            registro[1]= produ.getId_produ()+"";
            registro[2]= produ.getNom_produ();
            registro[3]= produ.getPrec_produ()+"";
            registro[4]= produ.getUnidad_medida_2()+"";
            registro[5]= produ.getFech_ingreso_produ();
            registro[6]= produ.getFech_caducidad();
            //registro[7]= observaciones.getLast().getObervacion();
            tmodelo.addRow(registro);
        }
        
        consultarCliVista.table_inventario.setModel(tmodelo);
    }
}
