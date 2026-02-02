import java.util.Objects;

public class Libro extends Publicacion {

    private int isbn;

    public Libro(String titulo, Autor autor, int numpaginas, int valoracion, int isbn) {
        super(titulo, autor, numpaginas, valoracion);
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }



    void mostarInfo(){
        System.out.println("Titulo = " + getTitulo());
        System.out.println("Autor = " + getAutor());
        System.out.println("ISBN = " + isbn);
        System.out.println("NumPaginas = " + getNumpaginas());
        System.out.println("Valoración = " + getValoracion());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                super.toString() + " "  +
                ", isbn=" + isbn +
                '}';
    }
    @Override
   public int hashCode() {
        return Objects.hashCode(isbn);
    }
}
