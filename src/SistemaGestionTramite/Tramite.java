/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaGestionTramite;
import TDA.*;
import java.time.LocalDateTime;

/**
 *
 * @author User
 */
public class Tramite {
    private LocalDateTime fechaHoraInicio,fechaHoraFin;
    private String documentos;
    private Lista<Expediente> expedientes;

    public Tramite(LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin, String documentos, Lista<Expediente> expedientes) {
        this.fechaHoraInicio = LocalDateTime.now();
        this.fechaHoraFin = null;
        this.documentos = documentos;
        this.expedientes = new Lista();
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public String getDocumentos() {
        return documentos;
    }

    public void setDocumentos(String documentos) {
        this.documentos = documentos;
    }

    public Lista<Expediente> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(Lista<Expediente> expedientes) {
        this.expedientes = expedientes;
    }
    
    
    
    
}
