package juegotabla;

/**
 *
 * @author CSI-PRO
 */
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Emilio Wong
 */
class Game extends JFrame {
    validacionNumero val = new validacionNumero();
    String pregunta = "¿Cuánto es...?";
    int cont = 1;
    static String[] done = {};
    Scanner scan = new Scanner(System.in);
    int puntaje = 0;
    int respuesta;
    int num1;
    int num2;

    Game() {
        for (int i = 0; i < 10; i++) {
            System.out.println(pregunta);
            int num1 = Game.numeroAleatorio();
            System.out.print(num1);
            System.out.print("x");
            int num2 = Game.numeroAleatorio();
            System.out.print(num2);
            System.out.println("");
            String respuesta = scan.nextLine();
            boolean bandera = true;
            
           while(bandera){
               System.out.println("entre al wail");
               if (val.validar(respuesta)) {
                   System.out.println("simon");
                   bandera = false;
               }
           }
           Integer res = Integer.parseInt(respuesta);
            if (res == (num1 * num2)) {
                System.out.println("Correcto");
                puntaje++;
                cont++;
                continue;
            } else {
                System.out.println("Incorrecto");
                cont++;
                continue;
            }
        }
        System.out.println("Fin del juego");
        System.out.println("Obtuviste: " + puntaje + " puntos");
    }

    public static int numeroAleatorio() {
        int random = 0;
        boolean bandera = true;
        while (bandera) {
            random = (int) (Math.random() * 10);
            if (random != 0) {
                bandera = false;
            }
        }

        return random;
    }
    public static int numeroAleatorioMedio() {
        int random = 0;
        boolean bandera = true;
        while (bandera) {
            random = (int) (Math.random() * 50);
            if (random != 0) {
                bandera = false;
            }
        }

        return random;
    }
    
}

