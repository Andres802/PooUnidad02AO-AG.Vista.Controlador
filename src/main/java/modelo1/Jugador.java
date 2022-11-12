/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo1;

import java.time.LocalDate;

/**
 *
 * @author ochoa
 */
public class Jugador {
    private double peso;
    private int estatura;
    private String nombre;
    private LocalDate fechaNacimiento;
    

    public Jugador(double peso, int estatura, String nombre, LocalDate fechaNacimiento) {
        this.peso = peso;
        this.estatura = estatura;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int calcularEdad(){
       
        int edadMes, edadYear, edadDia ; 
        var resultado = 0;
        int yearActual = LocalDate.now().getYear();
        int mesActual = LocalDate.now().getMonthValue();
        int diaActual = LocalDate.now().getDayOfMonth();
        String cumple;
        edadMes =  mesActual - this.fechaNacimiento.getMonthValue();
        edadYear = yearActual - this.fechaNacimiento.getYear();
        edadDia = diaActual - this.fechaNacimiento.getDayOfYear();
        
        if(diaActual == this.fechaNacimiento.getDayOfMonth() && mesActual == this.fechaNacimiento.getMonthValue()){
            resultado=edadYear;
            cumple = " Feliz cumple ";
            System.out.println(this.getNombre() + cumple);
        }
        else if(mesActual<this.fechaNacimiento.getMonthValue()){
            resultado = edadYear;
        }
        else if(mesActual>this.fechaNacimiento.getMonthValue()){
            resultado = edadYear-1;
        }
       
        
        return resultado;

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Jugador{" + "peso=" + peso + ", estatura=" + estatura + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
