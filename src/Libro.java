public class Libro {
    private String titulo;
    private String autor;
    private int numpaginas;
    private int valoracion;

    public Libro(String titulo, String autor, int numpaginas, int valoracion) {
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
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

    void mostarInfo(){
        System.out.println(titulo + autor + numpaginas + valoracion);
    }
}
