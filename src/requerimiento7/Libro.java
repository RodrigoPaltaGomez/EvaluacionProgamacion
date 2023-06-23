package requerimiento7;

public class Libro {
    private int codigo;
    private String titulo;
    private String autor;
    private boolean disponibilidad;
    private int cantidad;

    public Libro(int codigo, String titulo, String autor, boolean disponibilidad, int cantidad) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidad = disponibilidad;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
