/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.ActionListener;
import Vista.*;
import Modelo.*;
import static Modelo.Gestor_Cliente.Consultar_Cliente;
import java.awt.event.ActionEvent;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NN
 */
public class ConsultaCli_Controlador implements ActionListener {
    
    ConsultasCli_JFrame consultarCli;
    Gestor_Cliente gestor_cli;

    public ConsultaCli_Controlador(ConsultasCli_JFrame consultarCli) {
        this.consultarCli = consultarCli;
        gestor_cli = new Gestor_Cliente();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        DefaultTableModel tmodelo;
        String filtro=consultarCli.combox_filtro.getSelectedItem().toString();
        String dato = consultarCli.txt_dato.getText().toString();
       
        int atributo=0;
        
        if(filtro=="ID"){
            atributo=1;
        }if(filtro=="Nombre"){
            atributo=2;
        }if(filtro=="Numero celular"){
            atributo=3;
        }
        
        LinkedList<Cliente>clientes= gestor_cli.Consultar_Cliente(atributo, dato);
        
        String registro[]= new String[4];
        String titulos[]= {"ID", "Nombre", "Número de celular", "Dirección"};
        
        tmodelo= new DefaultTableModel();
        tmodelo.setColumnIdentifiers(titulos);
        
        for(Cliente cli:clientes){
            registro [0]=cli.getId_cli()+"";
            registro [1]=cli.getNom_cli();
            registro [2]=cli.getNum_cli();
            registro [3]=cli.getDir_cli();
            tmodelo.addRow(registro);
        }
        
        consultarCli.table_cli.setModel(tmodelo);
    }  
    
}
