import java.util.Scanner;

public class Main {
    void main(){

        Scanner llegir = new Scanner(System.in);

        int[] numerosentrada = new int[5];
        int indexmodificar = -1;
        int valormodificar = 0;

        for (int i = 0; i < numerosentrada.length; i++) {
            System.out.println("Introdueix el valor inicial de l'índex " + i + "/" + (numerosentrada.length-1) + ":");
            numerosentrada[i] = llegir.nextInt();
        }

        while (indexmodificar < 0 || indexmodificar >= numerosentrada.length) {
            System.out.println("Introdueix l'índex que vols modificar:");
            indexmodificar = llegir.nextInt();
            if (indexmodificar < 0 || indexmodificar >= numerosentrada.length) {
                System.out.println("Índex no vàlid :(");
            }
        }

        System.out.println("Introdueix el nou valor que vols assignar a l'índex " + indexmodificar + ":");
        valormodificar = llegir.nextInt();
        numerosentrada[indexmodificar] = valormodificar;

        for (int i = 0; i < numerosentrada.length; i++) {
            System.out.print("Índex " + i + ": " + numerosentrada[i] + ". ");
        }



    }
}
