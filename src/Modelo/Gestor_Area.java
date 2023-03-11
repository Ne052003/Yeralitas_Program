
package Modelo;

import java.util.LinkedList;


public class Gestor_Area {
     private static LinkedList<Area> areas;
    
    //Constructor
    public Gestor_Area(){
        areas = new LinkedList<Area>();
    }
    
    //Método para agregar areas
    public void Agregar_Area(Area area){
        areas.add(area);
    }
    
    //Método para consultar areas
    public static LinkedList<Area> Consultar_Area( String valor){
        LinkedList<Area> resultado= new LinkedList<Area>();
        for(Area area: areas){
             if(area.getNom_area().equals(valor))
                    resultado.add(area);
        }
        return resultado; 
  }
}
