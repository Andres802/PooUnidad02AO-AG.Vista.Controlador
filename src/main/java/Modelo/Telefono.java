/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ochoa
 */
public class Telefono {
    
    private String numero;
    private int extencion;
    private String tipoTelefono;
    private String operador;

    public Telefono(String numero, int extencion, String tipoTelefono, String operador) {
        this.numero = numero;
        this.extencion = extencion;
        this.tipoTelefono = tipoTelefono;
        this.operador = operador;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getExtencion() {
        return extencion;
    }

    public void setExtencion(int extencion) {
        this.extencion = extencion;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        return "Telefono{" + "numero=" + numero + ", extencion=" + extencion + ", tipoTelefono=" + tipoTelefono + ", operador=" + operador + '}';
    }
    
    
}
