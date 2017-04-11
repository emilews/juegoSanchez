/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegotabla;

import java.util.Scanner;

/**
 *
 * @author Emilio Wong
 */
class Game {

    String pregunta = "¿Cuánto es...?";
    int cont = 1;
    static String[] done = {};
    Scanner scan = new Scanner(System.in);
    int puntaje = 0;

    Game() {
        System.out.println(pregunta);
        for (int i = 0; i < 10; i++) {

            //System.out.println(cont);
            int num1 = Game.tablaNumeros();
            System.out.print(num1);
            System.out.print("x");
            int num2 = Game.tablaNumeros();
            System.out.print(num2);
            System.out.println("");
            int respuesta = scan.nextInt();
            if (respuesta == (num1 * num2)) {
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
        System.out.println("Obtuviste: "+puntaje+" puntos");
    }

    public static int tablaNumeros() {
        Integer rand = (int) (Math.random() * 10);
        for (int i = 0; i < done.length; i++) {
            if (done[i] != rand.toString()) {

            } else {
                done[done.length - 1] = rand.toString();
            }
        }
        return rand;
    }
}
