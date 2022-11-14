/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista1;

import java.time.LocalDate;
import java.time.Month;
import modelo1.*;
import servicio1.EstudianteServiceImpl;
import servicio1.JugadorServiceImpl;

/**
 *
 * @author ochoa
 */
public class Principal1 {

    public static void main(String[] args) {

        
        System.out.println("-----------------------Estudiantes y Carreras-----------------");
        var pedro = new Estudiante(40,"1001010110", "Pedro");
        var luis = new Estudiante(30,"01020202", "luis");
        var andres = new Estudiante(20,"0302592704", "Andres Ochoa");

        var teleco = new Carrera("ingenieria Telecomunicacion", 2);
        teleco.nuevoEstudiante(pedro);
        teleco.nuevoEstudiante(luis);
        teleco.nuevoEstudiante(andres);
        var elec = new Carrera("ingenieria Electronica", 2);
        elec.nuevoEstudiante(pedro);
        elec.nuevoEstudiante(luis);
        elec.nuevoEstudiante(andres);
        var compu = new Carrera("ingenieria Computacion", 2);
        compu.nuevoEstudiante(pedro);
        compu.nuevoEstudiante(luis);
        compu.nuevoEstudiante(andres);

        System.out.println("teleco = " + teleco.toString());
        System.out.println("Elec = " + elec.toString());
        System.out.println("Compu = " + compu.toString());

        var baseDatosEstudiante = new EstudianteServiceImpl();
        baseDatosEstudiante.crear(luis);
        baseDatosEstudiante.crear(pedro);
        baseDatosEstudiante.crear(andres);
        baseDatosEstudiante.eliminar(30);
        baseDatosEstudiante.modificar(40, pedro);

        System.out.println(baseDatosEstudiante.listar());

        System.out.println("-----------------Jugadores------------------");
        var jugador = new Jugador(20,80, 175, "Ener Valencia", LocalDate.of(2002, 10, 12));
        var jugador1 = new Jugador(40,80, 175, "Lionel Messi", LocalDate.of(1988, 11, 12));
        var jugador2 = new Jugador(30,80, 175, "Crsitiano Ronaldo", LocalDate.of(1978, 7, 4));
        var jugador3 = new Jugador(10,80, 175, "Edison Cavani", LocalDate.of(1983, 5, 25));
        var baseDatosJugador = new JugadorServiceImpl();
        baseDatosJugador.crear(jugador);
        baseDatosJugador.crear(jugador1);
        baseDatosJugador.crear(jugador2);
        baseDatosJugador.crear(jugador3);
        baseDatosJugador.eliminar(20);
        baseDatosJugador.eliminar(40);
        
        System.out.println(baseDatosJugador.listar());
        System.out.println("el jugador " + jugador.getNombre() +" tiene " + jugador.calcularEdad() + " year");
        System.out.println("el jugador " + jugador1.getNombre() +" tiene " + jugador1.calcularEdad() + " year");
        System.out.println("el jugador " + jugador2.getNombre() +" tiene " + jugador2.calcularEdad() + " year");
        System.out.println("el jugador " + jugador3.getNombre() +" tiene " + jugador3.calcularEdad() + " year");
        System.out.println(baseDatosJugador.listar());
        baseDatosJugador.modificar(10, jugador3);
    }
}
