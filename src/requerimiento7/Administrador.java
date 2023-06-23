package requerimiento7;
import java.util.Date;
public class Administrador {
    private int id_administrador;
    private String nombre;
    private String apellido;
    private Date fecha_nac;

    public Administrador(int id_administrador, String nombre, String apellido, Date fecha_nac) {
        this.id_administrador = id_administrador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
    
    
}
