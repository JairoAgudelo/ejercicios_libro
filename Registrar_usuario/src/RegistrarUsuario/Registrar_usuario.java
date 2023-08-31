package RegistrarUsuario;

import Servicios.serviciosUsuario;
import java.util.Scanner;


public class Registrar_usuario {

    public static void main(String[] args) {
        Scanner cap=new Scanner(System.in);
        serviciosUsuario su= new serviciosUsuario();
        su.registrarUsuario();
        su.mostrarUsuario();
    }
    
}
