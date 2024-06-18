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
public class Expediente {
    private int idExpediente, prioridad;
    private Usuario usuario;
    private String asunto, documentoReferencia;
    private Dependencia dependenciaActual;
    private Pila HistorialDependencias;

    public Expediente(int idExpediente, int prioridad, Usuario usuario, String asunto, String documentoReferencia, Dependencia dependenciaActual) {
        this.idExpediente = idExpediente;
        this.prioridad = prioridad;
        this.usuario = usuario;
        this.asunto = asunto;
        this.documentoReferencia = documentoReferencia;
        this.dependenciaActual = dependenciaActual;
        this.HistorialDependencias = new Pila();
    }
    
    public void agregarDependenciaHistorial(){
        HistorialDependencias.push(dependenciaActual.getNombre());//agregar automaticament por usuario admin
    }

    public int getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(int idExpediente) {
        this.idExpediente = idExpediente;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDocumentoReferencia() {
        return documentoReferencia;
    }

    public void setDocumentoReferencia(String documentoReferencia) {
        this.documentoReferencia = documentoReferencia;
    }  
}
