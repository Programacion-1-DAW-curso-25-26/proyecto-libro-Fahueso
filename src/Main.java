import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main{//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or


public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char opcion = ' ';
    ArrayList<Libro> biblioteca = new ArrayList<>();
    do{ 
        imprimir_menu();
        opcion = sc.nextLine().toLowerCase().charAt(0);
         switch (opcion){
            case 'a':
                anyadirLibro(biblioteca, sc);
                break;
            case 'b':
                 mostrarTodos(biblioteca);
                 break;
            case 'c':
                 buscarPorISBN(biblioteca,sc);
                 break;
            case 'd':
                 eliminarPorISBN(biblioteca,sc);
                 break; 
            case 'e':
                 vaciarLista(biblioteca,sc);
                 break; 
            default:
                System.out.println("opcion incorrecta");
                break;
         }
    }while (opcion!= 'e');


}

    private static void eliminarPorISBN(ArrayList<Libro> biblioteca, Scanner sc) {
        System.out.println("Dime el ISBN buscado");
        int isbnBuscado = sc.nextInt();
        sc.nextLine();
        //borrar con iterator
        Iterator<Libro> it = biblioteca.iterator();
        while(it.hasNext()) {
            Libro libroActual = it.next();
            if(libroActual.getIsbn()==isbnBuscado){
                it.remove();
            }
        }
        //opcion de borrar con el método equals
//        Libro libroBorrar = new Libro("","",0,0,isbnBuscado);
//        biblioteca.remove(libroBorrar);
    }

    private static void buscarPorISBN(ArrayList<Libro> biblioteca, Scanner sc) {
        System.out.println("Dime el ISBN buscado");
        int isbnBuscado = sc.nextInt();
        sc.nextLine();
        //opcion 1. Haciendo un recorrido
        for(Libro libroEncontrado : biblioteca){
            if (libroEncontrado.getIsbn()==isbnBuscado){
                System.out.println("El libro existe ");
            }
        }
//        //opcion2 (avanzada buscado por equals)
//        Libro libroBuscar = new Libro("","",0,0,isbnBuscado);
//        if(biblioteca.contains(libroBuscar)){
//            System.out.println("El libro existe");
//        }

    }

    private static void vaciarLista(ArrayList<Libro> biblioteca, Scanner sc) {
        int tamanyo = biblioteca.size();
        biblioteca.clear();
        System.out.println("Borrados " + tamanyo + " libros");
    }

    private static void mostrarTodos(ArrayList<Libro> biblioteca) {
        //con for
//        for (int i=0;i<biblioteca.size();i++){
//            System.out.println(biblioteca.get(i));
//        }
        //for-each
        for (Libro libroActual: biblioteca){
            System.out.println(libroActual);
        }
        //Iterator
//        Iterator<Libro> it = biblioteca.iterator();
//        while(it.hasNext()) {
//            Libro libroActual = it.next();
//            System.out.println(libroActual);
//        }


    }

    private static void imprimir_menu() {
        System.out.println("""
                --- MENÚ LIBRERÍA ---
                a. Añadir Libro
                b. Mostrar Libros
                c. Buscar por ISBN
                d. Borrar por ISBN
                e. Salir
                Seleccione opción:
                """);
    }

    private static void anyadirLibro(ArrayList<Libro> biblioteca, Scanner sc) {
        String titulo;
        String autor;
        int numPaginas;
        int valoracion;
        int isbn;

        System.out.println("Dime el nombre");
        titulo = sc.nextLine();
        System.out.println("Dime el autor");
        autor = sc.nextLine();
        System.out.println("Dime el número de páginas");
        numPaginas = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime la valoración");
        valoracion = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime el ISBN");
        isbn = sc.nextInt();
        sc.nextLine();
        Libro nuevo = new Libro(titulo, autor, numPaginas, valoracion, isbn);
        biblioteca.add(nuevo);

    }
}
