
package Controlador;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Observacion_Control implements ActionListener {
    
    AgregarObs_JFrame observacionVista;
    Observacion observacionModelo;
    Gestor_Observacion gestorObservacion;
    
    public Observacion_Control(AgregarObs_JFrame observacionVista){
        this.observacionVista= observacionVista;
        gestorObservacion= new Gestor_Observacion();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(observacionVista.btn_guardar)){
            int id_produ= Integer.parseInt(observacionVista.combox_producto.getSelectedItem().toString());
            Date fech_obs= observacionVista.chooser_fecha.getDate();
            String observacion= observacionVista.txt_observacion.getText();
            
            observacionModelo= new Observacion(id_produ, fech_obs, observacion);
            gestorObservacion.Agregar_Observacion(observacionModelo);
            
        }
    }
    
}
