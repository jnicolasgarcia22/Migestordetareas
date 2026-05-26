import java.util.ArrayList;
import java.util.Scanner;

class Tarea {

    String descripcion;
    boolean completada;

    public Tarea(String descripcion, boolean completada) {

        this.descripcion = descripcion;
        this.completada = completada;
    }
}

public class MiGestorTareas {
    
    String VerTareas;
    String AgregarTarea;
    String TareasCompletadas;
    String contarTareas;

public MiGestorTareas(String verTareas, String agregarTarea, String tareasCompletadas) {

    VerTareas = "Ver Tareas";
    AgregarTarea = "Agregar Tarea";
    TareasCompletadas = "Tareas Completadas";
    contarTareas = "Contar Tareas";

}


public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    ArrayList<Tarea> tareas = new ArrayList<>();

    boolean salir = false;

    while (!salir) {

        System.out.println("Seleccione una opción:");
        System.out.println("1. Ver Tareas");
        System.out.println("2. Agregar Tarea");
        System.out.println("3. Tareas Completadas");
        System.out.println("4. Contar Tareas");
        System.out.println("5. Salir");

        int opcion = input.nextInt();
        input.nextLine(); 

        switch (opcion) {

            case 1:

                System.out.println("Tareas:");

                for (Tarea tarea : tareas) {

                    if (tarea.completada) {

                        System.out.println("[X] " + tarea.descripcion);

                    } else {

                    System.out.println("[ ] " + tarea.descripcion);

                    }
            }

                break;

            case 2:

                System.out.println("Ingrese la tarea a agregar:");

                String nuevaTarea = input.nextLine();

                tareas.add(new Tarea(nuevaTarea, false));

                System.out.println("Tarea agregada.");

                break;

            case 3:

    System.out.println("Ingrese la posición de la tarea completada:");

    String entrada = input.nextLine();

    String[] partes = entrada.split(" ");

    int posicionTarea = Integer.parseInt(partes[0]);

    try {

        Tarea tareaCompletada = tareas.get(posicionTarea - 1);

        tareaCompletada.completada = true;

        System.out.println("Tarea marcada como completada.");

    } catch (IndexOutOfBoundsException e) {

        System.out.println("Número de tarea no válido.");
    }

    break;

            case 4:

                System.out.println("Número de tareas: " + tareas.size());

                break;

            case 5:

                salir = true;

                break;

            default:

                System.out.println("Opción no válida.");
        }

    }

       input.close();

    }

    }







