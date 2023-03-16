
package Modelo;

import java.util.LinkedList;

public class Gestor_Observacion {
     private static LinkedList<Observacion> observaciones;
    
    //Constructor
    public Gestor_Observacion(){
        observaciones = new LinkedList<>();
    }
    
    //Método para agregar observaciones
    public void Agregar_Observacion(Observacion observacion){
        observaciones.add(observacion);
    }
    
    //Método para consultar observacion
    public static LinkedList<Observacion> Consultar_Observacion(int atributo, String valor){
        LinkedList<Observacion> resultado= new LinkedList<>();
        for(Observacion observ: observaciones){
            switch(atributo){
                case 1 -> {
                    if(observ.getId_produ_2()==Integer.parseInt(valor))
                        resultado.add(observ);
                }
                case 2 -> {
                    if(observ.getFech_observ().equals(valor))
                        resultado.add(observ);
                }
                case 3 -> {
                    if(observ.getId_observ()==Integer.parseInt(valor))
                        resultado.add(observ);
                }
                
            }
                    }
        
        return resultado;
    }
}
