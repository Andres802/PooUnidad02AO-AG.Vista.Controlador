/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalpoounidad1.ao_ag.trabajoclases;

/**
 *
 * @author ochoa
 */
public class Mascota {
    
    private String nombre;
    private String raza;
    private int edad;
    private Dueno nombreDueno;

    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Dueno getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(Dueno nombreDueno) {
        this.nombreDueno = nombreDueno;
    }
    public String getRazaPais(){

        var retorno = "";
         var raza = "";
        raza = this.getRaza().substring(0,7);

        switch (raza) {
            case "Cockapo":
                retorno = "Reinos nidos";
                break;
            case "Beagles":
                retorno = "Portugal";
                break;
            case "Pusgsss":
                retorno = "Costa Rica";
                break;
            case "Pastors":
                retorno = "Alemania";
                break;

            default:
                retorno = "no definido";

        }
        return retorno;
    }
    
    public String mostrarInfo(){
        
        return " Su mascota se llama " + this.getNombre() + " es de raza " + this.getRaza() + " su origen es de " + this.getRazaPais()
                + ", la edad de la mascota es " + this.getEdad() + " year y su dueno se llama: " + this.nombreDueno.getNombre();
        
    }
    
    
    
}
