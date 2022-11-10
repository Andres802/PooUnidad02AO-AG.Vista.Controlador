/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package animalpoounidad1.ao_ag.trabajoclases;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author ochoa
 */
public class Proyect1 {

    public static void main(String[] args) {
        
        System.out.println("-------------------- PRIMER CLIENTE --------------------");
        var mascota = new Mascota("Pelusa","Pastors",5);
        var persona = new Dueno("Andres", "Azogues",35);
        var atencion = new Atencion("Medico",4,mascota);
        mascota.setNombreDueno(persona);
        
        
        System.out.println(""+persona.mostrarInfo());
        System.out.println("" + mascota.mostrarInfo());
        System.out.println("Su origen de la mascota es de: " + mascota.getRazaPais());
        System.out.println(""+ atencion.mostrarInfo());
        
        System.out.println("-------------------- SEGUNDO CLIENTE --------------------");
        var mascota1 = new Mascota("Rocko","Pusgsss",3);
        var persona1 = new Dueno("Alvaro", "Cuenca",56);
        var atencion1 = new Atencion("Peluqueria",2,mascota1);
        mascota1.setNombreDueno(persona1);
        
        
        System.out.println(""+persona1.mostrarInfo());
        System.out.println("" + mascota1.mostrarInfo());
        System.out.println("Su origen de la mascota es de: " + mascota1.getRazaPais());
        System.out.println(""+ atencion1.mostrarInfo());
        
        System.out.println("-------------------- TERCER CLIENTE --------------------");
        var mascota2 = new Mascota("Dawrins","Beagles",8);
        var persona2 = new Dueno("Alvaro", "Quito",29);
        var atencion2 = new Atencion("Vacunacion",1,mascota2);
        mascota2.setNombreDueno(persona2);
        
        
        System.out.println(""+persona2.mostrarInfo());
        System.out.println("" + mascota2.mostrarInfo());
        System.out.println("Su origen de la mascota es de: " + mascota2.getRazaPais());
        System.out.println(""+ atencion2.mostrarInfo());
        
        System.out.println("**-------------------------------------------**");
        var fechaAtencion = new Atencion(LocalDate.of(2022, Month.OCTOBER, 7));
        System.out.println("" + fechaAtencion.toString());
    }
}
