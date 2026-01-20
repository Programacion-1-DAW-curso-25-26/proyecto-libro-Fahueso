import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main{//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or


public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int opcion =0;
    ArrayList<Libro> biblioteca = new ArrayList<>();
    while (opcion!= 4){
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion){
            case 1:
                anyadirLibro(biblioteca, sc);
                break;
            default:
                System.out.println("opcion incorrecta");
                break;
        }

    }


}

    private static void anyadirLibro(ArrayList<Libro> biblioteca, Scanner sc) {
        String nombre;
        String autor;
        int numPaginas;
        int valoracion;
        int isbn;
        System.out.println("Dime el nombre");
        nombre = sc.nextLine();
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
        Libro nuevo = new Libro(nombre, autor, numPaginas, valoracion, isbn);
        biblioteca.add(nuevo);
    }
}
