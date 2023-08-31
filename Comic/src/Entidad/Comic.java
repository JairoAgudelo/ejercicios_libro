package Entidad;


public class Comic {
    private String titulo;
    private int edicion;
    private String genero;
    private String autor;
    private int numPag;

    public Comic(String titulo, int edicion, String genero, String autor, int numPag) {
        this.titulo = titulo;
        this.edicion = edicion;
        this.genero = genero;
        this.autor = autor;
        this.numPag = numPag;
    }

    public Comic() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    
}
