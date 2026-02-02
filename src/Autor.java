import java.util.Objects;

public class Autor extends Persona {
   private String estilo;

    public Autor(String nombre, String nacionalidad, String estilo) {
        super(nombre, nacionalidad);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Autor{" +
                super.toString() + "\'," +
                "estilo='" + estilo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Autor autor = (Autor) o;
        return Objects.equals(estilo, autor.estilo) && super.equals(autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), estilo);
    }
}
