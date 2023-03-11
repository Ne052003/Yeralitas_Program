/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursos;

import Vista.*;

/**
 *
 * @author NN
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
    
    
    
    
    
}
