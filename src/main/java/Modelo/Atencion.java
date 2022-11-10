/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ochoa
 */
public class Atencion {

    private String tipoAtencion;
    private int horaIngreso;
    private String veterinario;
    private LocalDate fecha;
    private double costo;
    private ArrayList<Receta>recetaList;
    Mascota nombreMascota;

    public Atencion(String tipoAtencion, int horaIngreso, String veterinario, LocalDate fecha, double costo) {
        this.tipoAtencion = tipoAtencion;
        this.horaIngreso = horaIngreso;
        this.veterinario = veterinario;
        this.fecha = fecha;
        this.costo = costo;
        this.recetaList = new ArrayList<Receta>();
    }
    
    public void nuevaReceta(String medica, int cantidad,String indicacion,int posicion){
        
        var receta = new Receta(medica,cantidad,indicacion);
        this.recetaList.add(receta);
        
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    public int getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

   

    public ArrayList<Receta> getRecetaList() {
        return recetaList;
    }

    public void setRecetaList(ArrayList<Receta> recetaList) {
        this.recetaList = recetaList;
    }

    

    public Mascota getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(Mascota nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
   

    @Override
    public String toString() {
        var retorno =  "Atencion{" + "tipoAtencion=" + tipoAtencion + ", horaIngreso=" + horaIngreso + ", veterinario=" + veterinario 
                + ", fecha=" + fecha + ", costo=" + costo + ", CantidadReceta=" +"\n"
                ;
        for(int x = 0; x<this.recetaList.size() ;x++)
        {
             retorno += "recetas " + x + " son" + " \n";
             retorno +=  this.recetaList.get(x) + "\n";
                       
            }
        return retorno;
    }
    
    
    

   
}
