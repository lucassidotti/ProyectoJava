public class Libro {
    private String titulo;
    private String autor;
    private int edicion;
    public Libro(String titulo, String autor, int edicion){
        this.titulo=titulo;
        this.autor=autor;
        this.edicion=edicion;
    }
    public void infoLibro(){
        System.out.println("Titulo: "+titulo+" - "+"Autor: "+autor+" - "+"Año: "+edicion);
    }
}
