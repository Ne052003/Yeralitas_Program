
package Controlador;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class ConsultaArea_JFrame implements ActionListener{
    
    AgregarArea_JFrame areaVista;
    Gestor_Area gestorArea;
    
    public ConsultaArea_JFrame(AgregarArea_JFrame areaVista){
        this.areaVista= areaVista;
        gestorArea= new Gestor_Area();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        DefaultTableModel tmodelo;
        
        String dato= areaVista.txt_dato.getText();
        LinkedList<Area> areas= Gestor_Area.Consultar_Area(dato);
        
        String registro[]= new String[2];
        String titulos[]= {"Código", "Nombre"};
        
        tmodelo= new DefaultTableModel();
        tmodelo.setColumnIdentifiers(titulos);
        
        for(Area area:areas){
            registro[0]= area.getCodigo_area()+"";
            registro[1]= area.getNom_area();
            tmodelo.addRow(registro);
        }
        
        areaVista.table_area.setModel(tmodelo);
        }
    
    
}
