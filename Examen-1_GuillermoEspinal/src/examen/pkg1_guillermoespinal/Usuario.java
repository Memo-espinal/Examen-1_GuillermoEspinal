
package examen.pkg1_guillermoespinal;

import java.util.ArrayList;
import java.util.Date;


public class Usuario {
    private String usuario;
    private String contra;
    private Date fecha;
    private int numero;
    private String correo;
    private String genero;
    ArrayList<Libro> libros = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String usuario, String contra, Date fecha, int numero, String correo, String genero) {
        this.usuario = usuario;
        this.contra = contra;
        this.fecha = fecha;
        this.numero = numero;
        this.correo = correo;
        this.genero = genero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    //para solo un libro
    public void setLibro(Libro libro){
        this.libros.add(libro);
    }
    public Libro getLibro (int i){
        return libros.get(i);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contra=" + contra + ", fecha=" + fecha + ", numero=" + numero + ", correo=" + correo + ", genero=" + genero + ", libros=" + libros + '}';
    }
    
    
    
    
}
