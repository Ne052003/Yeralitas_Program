
package Controlador;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class Producto_Control implements ActionListener {
    
    AgregarPro_JFrame productoVista;
    Producto productoModelo;
    Gestor_Producto gestorProducto;
    SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
    
    public Producto_Control(AgregarPro_JFrame productoVista){
        this.productoVista= productoVista;
        gestorProducto= new Gestor_Producto();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(productoVista.btn_guardar)){
            String id_geren_2= productoVista.combox_gerente.getSelectedItem().toString();
            String nom_produ= productoVista.txt_nombre.getText();
            Float prec_produ= Float.parseFloat(productoVista.txt_precio.getText());
            String unidad_medid= productoVista.combox_unidad.getSelectedItem().toString();
            String fech_ingreso= formato.format(productoVista.chooser_ingreso.getDate());
            String fech_caducidad= formato.format(productoVista.chooser_caducidad.getDate());
            
            productoModelo= new Producto(id_geren_2, nom_produ, prec_produ, unidad_medid, fech_ingreso, fech_caducidad);
            gestorProducto.Agregar_Producto(productoModelo);
        }
    }
}
