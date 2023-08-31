package Servicios;

import Entidad.Comic;
import java.util.Scanner;


public class ServiciosComic {
    Scanner cap=new Scanner(System.in).useDelimiter("\n");
    Comic co= new Comic();
    
    public void cargarComic(){
        System.out.println("------CREACION COMIC-------");
        System.out.println("Ingrese el titulo del comic");
        co.setTitulo(cap.next());
        System.out.println("Ingrese el numero de la edicion");
        co.setEdicion(cap.nextInt());
        System.out.println("Ingrese el genero del comic");
        co.setGenero(cap.next());
        System.out.println("Ingrese el autor del comic");
        co.setAutor(cap.next());
        System.out.println("Ingrese el número de paginas del comic");
        co.setNumPag(cap.nextInt());
    }
    public void mostrarComic(){
        System.out.println("");
        System.out.println("");
        System.out.println("-------DESCRIPCION COMIC-------");
        System.out.println("El título del comic es: " + co.getTitulo());
        System.out.println("El numero de la edicion del comic es: " + co.getEdicion());
        System.out.println("El genero del comic es: " + co.getGenero());
        System.out.println("El autor del comic es: " + co.getAutor());
        System.out.println("El número de páginas del comic es: " + co.getNumPag());
    }
}
