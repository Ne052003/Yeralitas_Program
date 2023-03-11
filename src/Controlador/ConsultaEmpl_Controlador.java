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


public class ConsultaEmpl_Controlador implements ActionListener{
    
    ConsultasEmpl_JFrame consultarEmpl;
    Gestor_Empleado gestor_empl;
    
    public ConsultaEmpl_Controlador(ConsultasEmpl_JFrame consultarEmpl){
        this.consultarEmpl= consultarEmpl;
        gestor_empl= new Gestor_Empleado();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        DefaultTableModel tmodelo;
        String dato= consultarEmpl.txt_dato.getText().toString();
        int atributo=0;
        String filtro=consultarEmpl.combox_filtro.getSelectedItem().toString();
        
        if(filtro=="Identificación"){
            atributo=1;
        }if(filtro=="Nombre"){
            atributo=2;
        }if(filtro=="Número de celular"){
            atributo=3;
        }if(filtro=="Fecha de ingreso"){
            atributo=4;
        }
        
        LinkedList<Empleado> empleados= gestor_empl.Consultar_Empleado(atributo, dato);
        
        String registro[]= new String[8];
        String titulos[]={"Identificación", "ID Gerente", "Nombres", "Apellidos", "Celular", "Fecha de ingreso", "Fecha de nacimiento", "Area"};
        
        tmodelo= new DefaultTableModel();
        tmodelo.setColumnIdentifiers(titulos);
        
        for(Empleado empl:empleados){
            registro[0]=empl.getId_empleado();
            registro[1]=empl.getId_gerente_2();
            registro[2]=empl.getNom_empl();
            registro[3]=empl.getApe_empl();
            registro[4]=empl.getNum_empl();
            registro[5]=empl.getFech_ingreso_empl();
            registro[6]=empl.getFech_nac_empl();
            registro[7]=empl.getArea_empl()+"";
            
            tmodelo.addRow(registro);
        }
        
        consultarEmpl.table_empl.setModel(tmodelo);
    }
    
}
