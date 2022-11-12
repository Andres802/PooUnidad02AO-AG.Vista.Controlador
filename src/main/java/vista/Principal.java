/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Dueno;
import modelo.Atencion;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author ochoa
 */
public class Principal {

    public static void main(String[] args) {
        var juan = new Dueno("Andres", "0302592704");

        juan.nuevoTelefono("098767763", 0, "Movil personal", "Bellsouth");
        juan.nuevoTelefono("098767763", 0, "Telefono casa", "Claro");
        juan.nuevoTelefono("098767763", 0, "Telefono trabajo", "Movil");
        System.out.println("Andres = " + juan.toString());

        var atencion = new Atencion("Medico", 2, "Daniel", LocalDate.of(2021, Month.MARCH, 3), 23);
        atencion.nuevaReceta("ibuprofeno", 3, "tomar tres veces al dia", 0);
        atencion.nuevaReceta("paracetamol", 2, "tomar 1 ves al dia", 1);
        atencion.nuevaReceta("buscapinas", 3, "tomar dos veces al dia", 2);
        System.out.println(atencion.toString());
    }

}
