/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Login;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import yeralitas_program.Metodos_generales;

/**
 *
 * @author NN
 */
public class Login_Control implements ActionListener {
    Login_JFrame loginVista;
    Login gestorLogin;
    MenuEmpl_JFrame menuEmpl;
    MenuAdmin_JFrame menuAdmin;
    MenuGer_JFrame menuGer;
    
    public Login_Control(Login_JFrame loginVista){
        this.loginVista=loginVista;
        gestorLogin=new Login();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String identificacion= loginVista.txt_id.getText();
        String contrasena= loginVista.pass_contrasena.getText();
        String rol="";
        int verificacion=gestorLogin.Loguear(identificacion, contrasena);
        if(verificacion==1){
            menuEmpl= MenuEmpl_JFrame.getMenu();
            menuEmpl.show();
            loginVista.dispose();
        } else if(verificacion==2){
            menuGer= MenuGer_JFrame.getMenu();
            menuGer.show();
            loginVista.dispose();
        } else if(verificacion==3){
            menuAdmin= MenuAdmin_JFrame.getMenu();
            menuAdmin.show();
            loginVista.dispose();
        }else{
            JOptionPane.showMessageDialog(loginVista, "Datos incorrectos");
        }
    }
}
