/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


import java.util.ArrayList;

/**
 *
 * @author ochoa
 */
public class Dueno {

    private String nombre;
    private String cedula;
    private ArrayList<Telefono> telelofonoList;

    public Dueno(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telelofonoList = new ArrayList<Telefono>();
    }

    public void nuevoTelefono(String n, int e, String tT, String op) {
        var telefono = new Telefono(n, e, tT, op);
        this.telelofonoList.add(telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Telefono> getTelelofonoList() {
        return telelofonoList;
    }

    public void setTelelofonoList(ArrayList<Telefono> telelofonoList) {
        this.telelofonoList = telelofonoList;
    }

    @Override
    public String toString() {
        var retorno = "Dueno{" + "nombre=" + nombre + ", cedula=" + cedula + "\n";

        /*
        for(var telefono:this.telelofonoList)
        retorno +=telefono.toString()+"\n";
         */
        for (var i = 0; i < this.telelofonoList.size(); i++) {
            retorno += this.telelofonoList.get(i) + "\n";

        }
        return retorno;
    }

}
