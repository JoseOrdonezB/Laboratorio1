
/* Programación Orientada a Objetos
 * Jose Pablo Ordoñez Barrios
 * Laboratorio 1: Clases
 * 4 de agosto de 2023
 */
// importar Scanner.
import java.util.Random;
import java.util.Scanner;

public class Pig {
    public static void main(String[] args) {

        // Instancia de los nuevos objetos.
        Jugador p1, p2;
        p1 = new Jugador();
        p2 = new Jugador();

        Dado dado1, dado2;
        dado1 = new Dado();
        dado2 = new Dado();

        // Inicio ciclo while.
        int turno = 0;
        while (turno == 0) {

            // Inicio de los turnos.
            Scanner jugador = new Scanner(System.in);
            System.out.println("¿De quien es el turno? (1/2)");
            String juego = jugador.next();
            System.out.println("----- Inicio de Turno -----");

            // if para identificar quien lanza el dado.
            // Lanzamiento de dados para el jugador 1.
            if (juego.equals("1")) {
                    Random rand = new Random();
                    Random randi = new Random();
                    dado1.setDado(rand.nextInt(6) + 1);
                    dado2.setDado(randi.nextInt(6) + 1);

                    // If para saber si un dado da 1 para convertir el puntaje en cero.
                if (dado1.getDado() == 1 || dado2.getDado() == 1) {
                    System.out.println("Los valores de los dados son:");
                    System.out.println("El valor del dado es: " + dado1.getDado());
                    System.out.println("El valor del dado es: " + dado2.getDado());
                    System.out.println("El puntaje se ha vuelto 0");
                    p1.setPunteo(0);

                    // Obtención del puntaje normal y asignación al jugador 1.
                } else {
                    System.out.println("Los valores de los dados son:");
                    System.out.println("El valor del dado es: " + dado1.getDado());
                    System.out.println("El valor del dado es: " + dado2.getDado());
                    p1.setPunteo(dado1.getDado() + dado2.getDado());

                }
                // Mensaje para mostrar el punteo del jugador 1.
                System.out.println("El punteo del jugador 1 es: " + p1.getPunteo());
                p1.setTpuntos(p1.getTpuntos() + p1.getTpuntos());

                // Lanzamiento de dados para el jugador 2.
            } if (juego.equals("2")) {
                    Random rand = new Random();
                    Random randi = new Random();
                    dado1.setDado(rand.nextInt(6) + 1);
                    dado2.setDado(randi.nextInt(6) + 1);

                    // If para saber si un dado da 1 para convertir el puntaje en cero.
                if (dado1.getDado() == 1 || dado2.getDado() == 1) {
                    System.out.println("Los valores de los dados son:");
                    System.out.println("El valor del dado es: " + dado1.getDado());
                    System.out.println("El valor del dado es: " + dado2.getDado());
                    System.out.println("El puntaje se ha vuelto 0");
                    p2.setPunteo(0);

                    // Obtención del puntaje normal y asignación al jugador 1.
                } else {
                    System.out.println("Los valores de los dados son:");
                    System.out.println("El valor del dado es: " + dado1.getDado());
                    System.out.println("El valor del dado es: " + dado2.getDado());
                    p2.setPunteo(dado1.getDado() + dado2.getDado());

                }
                // Mensaje para mostrar el punteo del jugador 1.
                System.out.println("El punteo del jugador 2 es: " + p2.getPunteo());
            }
        }

    }
}