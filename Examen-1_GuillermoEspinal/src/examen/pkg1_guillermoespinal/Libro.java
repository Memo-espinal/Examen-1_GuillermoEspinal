
package examen.pkg1_guillermoespinal;

import java.util.Date;


public class Libro {
    private String titulo;
    private String descripcion;
    private int puntaje;
    private int copias;
    private String genero;
    private double valor;
    private int edicion;
    private String autor;
    private Date fecha;

    public Libro() {
    }

    public Libro(String titulo, String descripcion, int puntaje, int copias, String genero, double valor, int edicion, String autor, Date fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.copias = copias;
        this.genero = genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Libro: " +titulo + "\nDescripcion: " + descripcion + "\nPuntaje" + puntaje + "\nCopias: " + copias + "\nGenero: " + genero + "\nValor: " + valor + "\nEdicion: " + edicion + "\nAutor: " + autor + "\nFecha: " + fecha ;
    }
    
    
    
    
}
