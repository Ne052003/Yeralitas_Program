/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import yeralitas_program.Metodos_generales;

public class Empleado_Control implements ActionListener{

    AgregarEmpl_JFrame empleadoVista;
    Empleado empleadoModelo;
    Gestor_Empleado gestorEmpleado;
    SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
    
    public Empleado_Control(AgregarEmpl_JFrame empleadoVista){
        this.empleadoVista= empleadoVista;
        gestorEmpleado= new Gestor_Empleado();
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(empleadoVista.btn_guardar)) {
            String id_empleado = empleadoVista.txt_identificacion.getText();
            String id_gerente = empleadoVista.combox_gerente.getSelectedItem().toString();
            String nom_empl = empleadoVista.txt_nombre.getText();
            String ape_empl = empleadoVista.txt_apellidos.getText();
            String num_empl = empleadoVista.txt_celular.getText();
            String fech_ingreso_empl = formato.format(empleadoVista.choose_ingreso.getDate());
            String fech_nac_empl = formato.format(empleadoVista.choose_nacimiento.getDate());
            int area_empl = Integer.parseInt(empleadoVista.combox_area.getSelectedItem().toString());

            empleadoModelo = new Empleado(id_empleado, id_gerente, nom_empl, ape_empl, num_empl, fech_ingreso_empl, area_empl, fech_nac_empl);
            gestorEmpleado.Agregar_Empleado(empleadoModelo);
            int msg= gestorEmpleado.getMsg();
            if(msg==JOptionPane.YES_OPTION){
                Metodos_generales.AgregarEmpl();
                empleadoVista.dispose();
            }else if(msg==JOptionPane.NO_OPTION){
                Metodos_generales.RolMenu();
                empleadoVista.dispose();
            }else if(msg==JOptionPane.CANCEL_OPTION){
                Metodos_generales.RolMenu();
                empleadoVista.dispose();
            }

        }
    }
}
