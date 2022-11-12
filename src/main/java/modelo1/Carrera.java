/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ochoa
 */
public class Carrera {
    
    private String nombre;
    private int numeroCiclo;
    private List<Estudiante>estudianteList;

    public Carrera(String nombre, int numeroCiclo) {
        this.nombre = nombre;
        this.numeroCiclo = numeroCiclo;
        this.estudianteList = new ArrayList<>();
    }
    public void nuevoEstudiante(Estudiante e){
        this.estudianteList.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCiclo() {
        return numeroCiclo;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", numeroCiclo=" + numeroCiclo + ", estudianteList=" + estudianteList + '}';
    }
    
}
