package colas;
import java.util.Scanner;
public class COLAS {
    public static void main(String[] args) {
        Scanner selc = new Scanner(System.in);
        int selc1 = 0;
        do { System.out.println("MENU"
                    + "\t 1.-PILA 1.1 METODO LLENAR AUTOMATICO\n"
                    + "\t 2.-PILA 1.2 AGREGAR Y ORDENAR\n"
                    + "\t 3.-PILA 1.3 UNIR DOS PILAS A Y B\n"
                    + "\t 4.-PILA 1.4 FORMA ALEATORIA SIN REPETIR\n"
                    + "\t 5.-SALIR\n");
            System.out.print("Ingresa una opcion: ");
            switch (selc1 = selc.nextInt()) {
                case 1: PILA_1.main(args);
                    break;
                case 2: pilas1_2.main(args);
                    break;
                case 3: PILAS13.main(args);
                    break;
                case 4: PILAS1_4.main(args);
                    break;
                case 5:
                    System.out.println(":3 fin del programa");
                    break;
                default:
                    System.out.println("valor incorrecto");
            }
        } while (selc1 != 5);
    }
}
