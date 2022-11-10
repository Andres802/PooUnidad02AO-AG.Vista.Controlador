/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalpoounidad1.ao_ag.trabajoclases;

import java.time.LocalDate;

/**
 *
 * @author ochoa
 */
public class Atencion {

    String tipoAtencion;
    int horaIngreso;
    private LocalDate fecha;
    Mascota nombreMascota;

    public Atencion(String tipoAtencion, int horaIngreso, Mascota nombreMascota) {
        this.tipoAtencion = tipoAtencion;
        this.horaIngreso = horaIngreso;
        this.nombreMascota = nombreMascota;
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

    public Mascota getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(Mascota nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Atencion(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String mostrarInfo() {

        return "La mascota se llama " + this.nombreMascota.getNombre() + " su atencion sera atendido en " + this.getHoraIngreso()
                + " horas y su tipo de atencion es " + this.getTipoAtencion();

    }

    @Override
    public String toString() {
        return "Atencion{" + "fecha = " + fecha.toString();
    }
}
