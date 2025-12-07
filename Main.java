import java.util.*;

public class Main {
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
        System.out.println("Complete los datos del libro");
        System.out.println("Ingrese el titulo del libro...");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor...");
        String autor = sc.nextLine();
        System.out.println("Ingrese el año...");
        int edicion = sc.nextInt();
        sc.nextLine();
        biblioteca.add(new Libro(titulo, autor, edicion));
      }
      if (eleccion == 2) {
        System.out.println("Libros disponibles: ");
        for (Libro l : biblioteca) {
          l.infoLibro();
        }
        System.out.println();
      }
      if (eleccion == 3) {
        System.out.println("Complete los datos del usuario");
        System.out.println("Ingrese el nombre...");
        String nombre = sc.nextLine();
        System.out.println("Ingrese nro de DNI...");
        int dni = sc.nextInt();
        sc.nextLine();
        usuarios.add(new Usuario(nombre, dni));
      }
      if (eleccion == 4) {
        System.out.println("===Usuarios===");
        for (Usuario u : usuarios) {
          u.datosUser();
        }
      }
    } while (eleccion != 5);
    System.out.println("Saliendo...");

  }

}
