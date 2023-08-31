package Servicios;

import Entidad.usuario;
import java.util.Scanner;


public class serviciosUsuario {
    Scanner cap=new Scanner(System.in);
    usuario u= new usuario();
    
    public void registrarUsuario(){
        System.out.println("Ingrese el nombre del usuario a registrar");
        u.setNombre(cap.next());
        System.out.println("Ingrese el apellido del usuario");
        u.setApellido(cap.next());
        System.out.println("Ingrese el documento del usuario");
        u.setDNI(cap.nextInt());
    }
    public void mostrarUsuario(){
        System.out.println("El nombre del usuario es "+u.getNombre());
        System.out.println("El apellido del usuario es "+u.getApellido());
        System.out.println("El documento del usuario es "+u.getDNI());
    }
    
}
