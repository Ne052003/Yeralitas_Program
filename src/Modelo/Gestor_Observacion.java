
package Modelo;

import java.util.LinkedList;

public class Gestor_Observacion {
     private static LinkedList<Observacion> observaciones;
    
    //Constructor
    public Gestor_Observacion(){
        observaciones = new LinkedList<Observacion>();
    }
    
    //Método para agregar observaciones
    public void Agregar_Observacion(Observacion observacion){
        observaciones.add(observacion);
    }
    
    //Método para consultar observacion
    public static LinkedList<Observacion> Consultar_Observacion(int atributo, String valor){
        LinkedList<Observacion> resultado= new LinkedList<Observacion>();
        for(Observacion observ: observaciones){
            switch(atributo){
                //Consultar observación por ID del producto
                case 1: if(observ.getId_produ_2()==Integer.parseInt(valor))
                    resultado.add(observ);
                break;
                
                //Consultar observación por fecha de la observación
                case 2: if(observ.getFech_observ().equals(valor))
                    resultado.add(observ);
                break;
                
                //Consultar observación por ID del producto
                case 3: if(observ.getId_observ()==Integer.parseInt(valor))
                    resultado.add(observ);
                break;
                
            }
        }
        
        return resultado;
    }
}
