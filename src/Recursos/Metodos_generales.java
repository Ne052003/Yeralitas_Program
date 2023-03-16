
package Recursos;

import Modelo.Login;
import Vista.*;
import javax.swing.JOptionPane;

/**
 * @author Neoly Alexis
 */
public class Metodos_generales extends javax.swing.JFrame{
    
    
    //Abrir ventana agregar empleado
    public static void AgregarEmpl(){
        AgregarEmpl_JFrame empleado= new AgregarEmpl_JFrame();
        empleado.show();
        
    }
    
    //Abrir ventana agregar cliente
    public static void AgregarCli(){
        AgregarCliente_JFrame cliente= new AgregarCliente_JFrame();
        cliente.show();
        
    }
    
    //Abrir ventana agregar venta
    public static void AgregarVenta(){
        AgregarVenta_JFrame venta= new AgregarVenta_JFrame();
        venta.show();
        
    }
    
    //Abrir ventana agregar producto
    public static void AgregarPro(){
        AgregarPro_JFrame producto= new AgregarPro_JFrame();
        producto.show();
        
    }
    
    //Abrir ventana agregar observación
    public static void AgregarObs(){
        AgregarObs_JFrame observacion= new AgregarObs_JFrame();
        observacion.show();
        
    }
    
     //Abrir ventana Consultas empleados
    public static void ConsultasEmpl(){
        ConsultasEmpl_JFrame consulta= new ConsultasEmpl_JFrame();
        consulta.show();
        
    }
    
    //Abrir ventana Consultas clientes
    public static void ConsultasCli(){
        ConsultasCli_JFrame consultaCli= new ConsultasCli_JFrame();
        consultaCli.show();
        
    }
    
    //Abrir ventana Consultas ventas
    public static void ConsultasVen(){
        ConsultasVen_JFrame consultaVen= new ConsultasVen_JFrame();
        consultaVen.show();
        
    }
    
    //Abrir ventana inventario
    public static void Inventario(){
        Inventario_JFrame inventario= new Inventario_JFrame();
        inventario.show();
        
    }
    
    //Abrir ventana eliminar
    public static void Eliminar(){
        Eliminar_JFrame eliminar= new Eliminar_JFrame();
        eliminar.show();
        
    }
    
    //Abrir ventana Menú
    public static void Menu(){
        MenuEmpl_JFrame menu= MenuEmpl_JFrame.getMenu();
        menu.show();
    }
    
    //Abrir ventana Menú
    public static void MenuAdmin(){
        MenuAdmin_JFrame menu= MenuAdmin_JFrame.getMenu();
        menu.show();
    }
    
    //Abrir ventana modificar cliente
    public static void ModificarCli(){
        ModificarCli_JFrame cliente= new ModificarCli_JFrame();
            cliente.show();
    }
    
    //Abrir ventana modificar empleado
    public static void ModificarEmpl(){
        Modificar_JFrame empleado= new Modificar_JFrame();
            empleado.show();
    }
    
    //Abrir ventana modificar producto
    public static void ModificarPro(){
        ModificarPro_JFrame producto= new ModificarPro_JFrame();
            producto.show();
    }
    
    //Abrir ventana modificar observación
    public static void ModificarObs(){
        ModificarObs_JFrame observacion= new ModificarObs_JFrame();
            observacion.show();
    }
    
    //Abrir ventana modificar venta
    public static void ModificarVen(){
        ModificarVen_JFrame venta= new ModificarVen_JFrame();
            venta.show();
    }
    
    //Método para ir al menú según el rol
    public static void RolMenu(){
        String rol=Login.getRol();
        
        switch(rol){
            
            case "usuarios" -> {
                MenuEmpl_JFrame menu = MenuEmpl_JFrame.getMenu();
                menu.show();
            }
            case "gerente" -> {
                MenuGer_JFrame menu1 = MenuGer_JFrame.getMenu();
                menu1.show();
            }
            case "administrador" -> {
                MenuAdmin_JFrame menu2 = MenuAdmin_JFrame.getMenu();
                menu2.show();
            }
            default -> JOptionPane.showMessageDialog(null,"No hay rol definido");
        }
    }
    
    public static void RolConfig(){
        String rol=Login.getRol();
        
        switch(rol){
            
            case "usuarios" -> {
                ConfigUser_JFrame menu = new ConfigUser_JFrame();
                menu.show();
            }
            case "gerente" -> {
                ConfigGeren_JFrame menu1 = new ConfigGeren_JFrame();
                menu1.show();
            }
            case "administrador" -> {
                ConfigAdmin_JFrame menu2 = new ConfigAdmin_JFrame();
                menu2.show();
            }
            default -> JOptionPane.showMessageDialog(null,"No hay rol definido");
        }
    }
    
    
    
    
}
