
package Controlador;
import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class ConsultaGeren_Control implements ActionListener{
    
    ConsultasGeren_JFrame consultaGerenVista;
    Gestor_Gerente gestorGerente;

    public ConsultaGeren_Control(ConsultasGeren_JFrame consultaGerenVista) {
        this.consultaGerenVista = consultaGerenVista;
        gestorGerente= new Gestor_Gerente();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        DefaultTableModel tmodelo;
        
        String dato= consultaGerenVista.txt_dato.getText();
        int atributo=0;
        
        if(consultaGerenVista.combox_filtro.getSelectedItem()=="Identificación"){
            atributo=1;
        }if(consultaGerenVista.combox_filtro.getSelectedItem()=="Nombre"){
            atributo=2;
        }if(consultaGerenVista.combox_filtro.getSelectedItem()=="Apellido"){
            atributo=3;
        }
        
        LinkedList<Gerente> gerentes= Gestor_Gerente.Consultar_Gerente(atributo, dato);
        
        String registro[]= new String[6];
        String titulos[]= {"Identificación", "Nombres", "Apellidos", "Número celular", "Correo electrónico", "Fecha de nacimiento"};
        
        tmodelo= new DefaultTableModel();
        tmodelo.setColumnIdentifiers(titulos);
        
        for(Gerente geren:gerentes){
            registro[0]=geren.getId_geren();
            registro[1]=geren.getNom_geren();
            registro[2]=geren.getApe_geren();
            registro[3]=geren.getNum_geren();
            registro[4]=geren.getCorreo();
            registro[5]=geren.getFech_nac_geren();
            tmodelo.addRow(registro);
        }
        consultaGerenVista.table_geren.setModel(tmodelo);
    }
}
