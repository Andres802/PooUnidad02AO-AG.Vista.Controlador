/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio1;

import java.util.ArrayList;
import java.util.List;
import modelo1.Estudiante;

/**
 *
 * @author ochoa
 */
public class EstudianteService {
    
    private List<Estudiante> estudianteList;

    public EstudianteService() {
        this.estudianteList = new ArrayList<>();
    }
    
    public void crear(Estudiante estudiante){
        this.estudianteList.add(estudiante);
    }
    public List<Estudiante> lista(){
        return this.estudianteList;
    }
    public void eliminarPosicion(int posicion){
        this.estudianteList.remove(posicion);
    }
    
    
}
