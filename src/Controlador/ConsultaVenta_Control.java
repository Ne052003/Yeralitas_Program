
package Controlador;
import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class ConsultaVenta_Control implements ActionListener{
    ConsultasVen_JFrame consultaVenVista;
    Gestor_Venta gestorVenta;

    public ConsultaVenta_Control(ConsultasVen_JFrame consultaVenVista) {
        this.consultaVenVista = consultaVenVista;
        gestorVenta= new Gestor_Venta();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
         DefaultTableModel tmodelo;
         
         String dato= consultaVenVista.txt_dato.getText();
         int atributo=0;
         
         if(consultaVenVista.combox_filtro.getSelectedItem()=="ID Mnufactura"){
             atributo=1;
             
         }if(consultaVenVista.combox_filtro.getSelectedItem()=="ID Cliente"){
             atributo=2;
         }if(consultaVenVista.combox_filtro.getSelectedItem()=="ID Empleado"){
             atributo=3;
         }if(consultaVenVista.combox_filtro.getSelectedItem()=="Precio"){
             atributo=4;
         }if(consultaVenVista.combox_filtro.getSelectedItem()=="Fecha"){
             atributo=5;
         }
         
         LinkedList<Venta> ventas= Gestor_Venta.Consultar_Venta(atributo, dato);
         
         String registro[]= new String[7];
         String titulos[]={"ID", "ID Empleado", "ID Cliente", "ID Manufactura", "Cantidad de manufacturas","Fecha", "Precio"};
         
         tmodelo = new DefaultTableModel();
         tmodelo.setColumnIdentifiers(titulos);
         
         for(Venta ven:ventas){
             registro[0]= ven.getId_venta()+"";
             registro[1]= ven.getId_empl_2()+"";
             registro[2]= ven.getId_cli_2()+"";
             registro[3]= ven.getId_manufac()+"";
             registro[4]= ven.getCantidad_manufac()+"";
             registro[5]= ven.getFech_venta()+"";
             registro[6]= ven.getPrec_venta()+"";
             tmodelo.addRow(registro);
         }
         
         consultaVenVista.table_venta.setModel(tmodelo);
    }
    
}
