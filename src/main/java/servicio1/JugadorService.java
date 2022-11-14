/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio1;

import java.util.List;
import modelo1.Jugador;

/**
 *
 * @author ochoa
 */
public interface JugadorService {

    public abstract void crear(Jugador jugador);
    public abstract void modificar(int codigo,Jugador jugadorModificado);
    public abstract void eliminar(int codigo);
    public abstract List<Jugador> listar();
    
}
