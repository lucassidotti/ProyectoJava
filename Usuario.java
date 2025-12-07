public class Usuario {
    private String nombre;
    private int dni;
    public Usuario(String nombre, int dni){
        this.nombre=nombre;
        this.dni=dni;
    }
    public String getnombre(){
        return nombre;
    }
    public int getdni(){
        return dni;
    }
    public void datosUser(){
        System.out.println("Nombre: "+nombre+" - "+"DNI: "+dni);
    } 
}