/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaGestionTramite;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Sistema {
    static Scanner sc = new Scanner(System.in);
    static Administrador admin1 = new Administrador("0","0");
    public static void main(String[] args) {
        validarAcceso();
        
        //agregar usuario
        System.out.print("Introduce el nombre del nuevo usuario: ");
        String nombreUsuario = sc.nextLine();
        System.out.print("Introduce el DNI del nuevo usuario: ");
        int dniUsuario = sc.nextInt(); 
        Usuario nuevoUsuario = new Usuario(nombreUsuario, dniUsuario);
        admin1.agregarUsuario(nuevoUsuario);
        System.out.println("Usuarios actuales: ");
        admin1.mostrarUsuarios();
        
        
    }
    
    
    
    
    
    
    public static void validarAcceso(){
        int intentos = 0;
        boolean accesoConcedido = false;

        while (intentos < 3 && !accesoConcedido) { // Permite hasta 3 intentos de inicio de sesión
            System.out.print("Username: ");
            String username = sc.nextLine();

            System.out.print("Password: ");
            String password = sc.nextLine();

            if (admin1.validarAcceso(username, password)) {
                System.out.println("Acceso concedido.");
                accesoConcedido = true;
            } else {
                System.out.println("Acceso denegado. Intente de nuevo.");
                intentos++;
            }
        }

        if (!accesoConcedido) {
            System.out.println("Número máximo de intentos alcanzado. Acceso bloqueado.");
        }
    }
    
    public static void crearUsuario(){
        
    }
}
