/*Crear una clase llamada Comic que contenga los siguientes atributos: Título, Edición, 
Género, Autor, Número de páginas, y un constructor con todos los atributos pasados 
por parámetro y un constructor vacío. Crear un método para cargar un comic pidiendo los 
datos al usuario y luego informar mediante otro método el número de Título, Edición, 
Género, Autor, Número de páginas.*/

package comic;

import Servicios.ServiciosComic;
import java.util.Scanner;


public class MainComic {

    
    public static void main(String[] args) {
        Scanner cap=new Scanner(System.in).useDelimiter("\n");
        ServiciosComic svc= new ServiciosComic();
        svc.cargarComic();
        svc.mostrarComic();
    }
    
}
