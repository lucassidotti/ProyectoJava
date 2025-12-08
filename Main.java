import java.util.*;
public class Main {
  public static void agregarLibro(ArrayList<Libro> biblioteca, Scanner sc){
    System.out.println("Complete los datos del libro");
    System.out.println("Ingrese el titulo del libro...");
    String titulo = sc.nextLine();
    System.out.println("Ingrese el autor...");
    String autor = sc.nextLine();
    System.out.println("Ingrese el año...");
    int edicion = sc.nextInt();
    sc.nextLine();
    biblioteca.add(new Libro(titulo, autor, edicion));
    System.out.println("Libro agregado a la Biblioteca");
  }
  public static void listarLibros(ArrayList<Libro> biblioteca){
    if (biblioteca.isEmpty()) {
      System.out.println("No hay libros disponibles");
    } else {
        System.out.println("Libros disponibles");
        for (Libro l : biblioteca) {
          l.infoLibro();
        }
      }
  }
  public static void registrarUsuario(ArrayList<Usuario> usuarios, Scanner sc){
    System.out.println("Complete los datos del usuario");
    System.out.println("Ingrese el nombre...");
    String nombre = sc.nextLine();
    System.out.println("Ingrese nro de DNI...");
    int dni = sc.nextInt();
    sc.nextLine();
    usuarios.add(new Usuario(nombre, dni));
    System.out.println("Nuevo usuario registrado");
  }
  public static void listarUsuario(AbstractList<Usuario> usuarios){
    if (usuarios.isEmpty()) {
      System.out.println("No hay usuarios registrados");
    }else{
      System.out.println("===Usuarios===");
      for (Usuario u : usuarios) {
        u.datosUser();
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Libro> biblioteca = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    int eleccion;
    do {
      System.out.println("\n===BIBLIOTECA===");
      System.out.println("1. Agregar libros");
      System.out.println("2. Listar libros");
      System.out.println("3. Registrar Usuario");
      System.out.println("4. Listar usuarios");
      System.out.println("5. Salir");
      System.out.print("Ingrese una opción: ");
      eleccion = sc.nextInt();
      sc.nextLine();
      if (eleccion == 1) {
        agregarLibro(biblioteca, sc);
      }
      if (eleccion == 2) {
        listarLibros(biblioteca);
      }
      if (eleccion == 3) {
        registrarUsuario(usuarios, sc);
      }
      if (eleccion == 4) {
        listarUsuario(usuarios);
      }
    } while (eleccion != 5);
    System.out.println("Saliendo...");
    sc.close();
  }

}
