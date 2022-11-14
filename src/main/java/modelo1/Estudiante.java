/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo1;

/**
 *
 * @author ochoa
 */
public class Estudiante {
    
    private int codigo;
    private String cedula;
    private String nombre;

    public Estudiante(int codigo,String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    

    @Override
    public String toString() {
        return "Estudiante{" + "Codigo =" + codigo +", cedula=" + cedula + ", nombre=" + nombre + '}';
    }
    
    
}
