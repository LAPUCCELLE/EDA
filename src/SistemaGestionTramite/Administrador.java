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
public class Administrador {
    private String nombreUsuario, contraseña;
    private Lista<Usuario> usuarios;
    private Lista<Dependencia> dependencias;

    public Administrador(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.usuarios = new Lista<>();
        this.dependencias = new Lista<>();
    }
    
    public boolean validarAcceso(String username, String password) {
        return nombreUsuario.equals(username) && contraseña.equals(password);
    }
    
    public void agregarUsuario(Usuario usuario){
        usuarios.agregar(usuario);
    }
    
    public void mostrarUsuarios(){
        usuarios.mostrar();
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Lista<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Lista<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Lista<Dependencia> getDependencias() {
        return dependencias;
    }

    public void setDependencias(Lista<Dependencia> dependencias) {
        this.dependencias = dependencias;
    }

    public void mostrarAdmin(){
        System.out.println("username: "+ this.nombreUsuario);
        System.out.println("contraseña: " + this.contraseña);
    }
}
