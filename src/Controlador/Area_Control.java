
package Controlador;

import java.awt.event.ActionListener;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;


public class Area_Control implements ActionListener{

    AgregarArea_JFrame areaVista;
    Area areaModelo;
    Gestor_Area gestorArea;
    
    public Area_Control(AgregarArea_JFrame areaVista){
        this.areaVista= areaVista;
        gestorArea= new Gestor_Area();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(areaVista.btn_guardar)){
            String nom_area= areaVista.txt_nombre.getText();
            
            areaModelo= new Area(nom_area);
            gestorArea.Agregar_Area(areaModelo);
        }
    }
    
    
}
