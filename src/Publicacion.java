import java.util.Objects;

public class Publicacion {
    private String titulo;
    private Autor autor; //-> Pasar a clase Autor!!!
    private int numpaginas;
    private int valoracion;

    public Publicacion(String titulo, Autor autor, int numpaginas, int valoracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numpaginas = numpaginas;
        this.valoracion = valoracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", numpaginas=" + numpaginas +
                ", valoracion=" + valoracion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Publicacion that = (Publicacion) o;
        return numpaginas == that.numpaginas && valoracion == that.valoracion && Objects.equals(titulo, that.titulo) && Objects.equals(autor, that.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, numpaginas, valoracion);
    }
}
