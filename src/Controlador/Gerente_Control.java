
package Controlador;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import Recursos.Metodos_generales;

public class Gerente_Control implements ActionListener{
    
    AgregarGeren_JFrame gerenteVista;
    Gerente gerenteModelo;
    Gestor_Gerente gestorGerente;
    SimpleDateFormat formato=new SimpleDateFormat ("dd/MM/yyyy");
    
    public Gerente_Control(AgregarGeren_JFrame gerenteVista){
        this.gerenteVista=gerenteVista;
        gestorGerente= new Gestor_Gerente();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(gerenteVista.btn_guardar)){
            String id_geren= gerenteVista.txt_identificacion.getText();
            String nom_geren= gerenteVista.txt_nombre.getText();
            String ape_geren= gerenteVista.txt_apellidos.getText();
            String num_geren= gerenteVista.txt_celular.getText();
            String correo= gerenteVista.txt_correo.getText();
            String fech_nac_geren= formato.format(gerenteVista.chooser_nac.getDate());
            String contrasena= gerenteVista.password.getText();
            String confirmar= gerenteVista.password_confirmar.getText();
            
            if(contrasena.equals(confirmar)){
                gerenteModelo= new Gerente(id_geren, nom_geren, ape_geren,num_geren,correo, fech_nac_geren, contrasena);
                gestorGerente.Agregar_Gerente(gerenteModelo);
            }else{
                JOptionPane.showMessageDialog(null, "La confirmación de contraseña es incorrecta");
            }
            int msg=gestorGerente.getMsg();
            switch (msg) {
                case JOptionPane.YES_OPTION -> Metodos_generales.AgregarVenta();
                case JOptionPane.NO_OPTION -> Metodos_generales.RolMenu();
                case JOptionPane.CANCEL_OPTION -> Metodos_generales.RolMenu();
            }
            gerenteVista.dispose();
        }
    }
}
