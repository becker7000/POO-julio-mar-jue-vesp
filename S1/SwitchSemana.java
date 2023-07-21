import java.util.Scanner;

public class SwitchSemana {

    public static void main(String[] args) {

        // System.in entandar de entrada de datos
        Scanner entrada = new Scanner(System.in);
        int dia_semana;

        System.out.print("\n\t Escribe un número entre 1 y 7: ");
        dia_semana = Integer.parseInt(entrada.nextLine());

        // switch lambda ( entrada -> salida )
        switch (dia_semana) { // Sólo puede recibir int o char
            case 1 -> System.out.println("\n\t DOMINGO");
            case 2 -> System.out.println("\n\t LUNES");
            case 3 -> System.out.println("\n\t MARTES");
            case 4 -> System.out.println("\n\t MIÉRCOLES");
            case 5 -> System.out.println("\n\t JUEVES");
            case 6 -> System.out.println("\n\t VIERNES");
            case 7 -> System.out.println("\n\t SÁBADO");
            default -> System.out.println("\n\t Opción no contemplada...");
        }

        entrada.close(); // Buena práctica

    }

}

// Atajo: ctrl+d para duplicar
// Atajo: ctrl+f para buscar algo seleccionado
// Atajo: ctrl+r para remplazar una palabra encontrada