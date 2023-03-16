
package Controlador;

import Modelo.Login;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Neoly Alexis 
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
        int verificacion=gestorLogin.Loguear(identificacion, contrasena);
        switch (verificacion) {
            case 1 -> {
                menuEmpl= MenuEmpl_JFrame.getMenu();
                menuEmpl.show();
                loginVista.dispose();
            }
            case 2 -> {
                menuGer= MenuGer_JFrame.getMenu();
                menuGer.show();
                loginVista.dispose();
            }
            case 3 -> {
                menuAdmin= MenuAdmin_JFrame.getMenu();
                menuAdmin.show();
                loginVista.dispose();
            }
            default -> JOptionPane.showMessageDialog(loginVista, "Datos incorrectos");
        }
    }
}
