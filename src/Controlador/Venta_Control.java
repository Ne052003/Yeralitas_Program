
package Controlador;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import Recursos.Metodos_generales;

public class Venta_Control implements ActionListener{
    
    AgregarVenta_JFrame ventaVista;
    Venta ventaModelo;
    Gestor_Venta gestorVenta;
    SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
    
    public Venta_Control(AgregarVenta_JFrame ventaVista){
        this.ventaVista= ventaVista;
        gestorVenta= new Gestor_Venta();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(ventaVista.btn_guardar)){
            String id_empl= ventaVista.combox_empl.getSelectedItem().toString();
            int id_cli= Integer.parseInt(ventaVista.txt_idcli.getText());
            int id_manufac= Integer.parseInt(ventaVista.combox_manufac.getSelectedItem().toString());
            int cantidad_manufac= Integer.parseInt(ventaVista.txt_manufacturas.getText());
            String fech_venta= formato.format(ventaVista.chooser_venta.getDate());
            Float prec_venta= Float.parseFloat(ventaVista.txt_precio.getText());
            ventaModelo= new Venta(id_empl, id_cli, id_manufac, cantidad_manufac, fech_venta, prec_venta);
            gestorVenta.Agregar_Venta(ventaModelo);
            int msg=gestorVenta.getMsg();
            switch (msg) {
                case JOptionPane.YES_OPTION -> Metodos_generales.AgregarVenta();
                case JOptionPane.NO_OPTION -> Metodos_generales.RolMenu();
                case JOptionPane.CANCEL_OPTION -> Metodos_generales.RolMenu();
                default -> {
                }
            }
            ventaVista.dispose();
            
        }
    }
}
