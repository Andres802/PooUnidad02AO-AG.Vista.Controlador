/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalpoounidad1.ao_ag.trabajoclases;

/**
 *
 * @author ochoa
 */
public class Dueno {
    private String nombre;
    private String direccion;
    private int edad;

    public Dueno(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
  
    
    public String mostrarInfo(){
        
        return "Su nombre es " + this.getNombre() + " vive en " + this.getDireccion() + " y tiene " + this.getEdad() + " year";
        
    }
    
}
