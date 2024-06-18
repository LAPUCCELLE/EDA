/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaGestionTramite;
import TDA.*;

/**
 *
 * @author User
 */
public class Dependencia {
    private String nombre;
    private Cola<Tramite> ColaTramites;
    private Cola<Expediente> ExpedientesProceso;
    private Cola<Expediente> ExpedientesTerminados;

    public Dependencia(String nombre) {
        this.nombre = nombre;
        this.ColaTramites = new Cola();
        this.ExpedientesProceso = new Cola();
        this.ExpedientesTerminados = new Cola();
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
}
