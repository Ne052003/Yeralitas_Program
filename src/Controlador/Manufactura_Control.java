
package Controlador;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manufactura_Control implements ActionListener {
    
    AgregarManu_JFrame manufacturaVista;
    Manufactura manufacturaModelo;
    Gestor_Manufactura gestorManufactura;
    
    public Manufactura_Control(AgregarManu_JFrame manufacturaVista){
        this.manufacturaVista=manufacturaVista;
        gestorManufactura= new Gestor_Manufactura();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(manufacturaVista.btn_guardar)){
            String nom_manufac= manufacturaVista.txt_nombre.getText();
            Float prec_manufac= Float.parseFloat(manufacturaVista.txt_precio.getText());
            
            manufacturaModelo= new Manufactura(nom_manufac, prec_manufac);
            gestorManufactura.Agregar_Manufactura(manufacturaModelo);
        }
    }
    
}
