import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantas monedas tienes: ");
        int size = scanner.nextInt();

        int[] coinArray = new int[size];

        System.out.println("Cual es el valor de estas monedas: ");

        for (int i = 0; i < coinArray.length; i++) {
            coinArray[i] = scanner.nextInt();
        }

        int coinAmount=0;
        int maxChainge=0;

        for (int i=0; i<coinArray.length; i++){
            coinAmount+= (coinArray[i]);
            maxChainge = coinAmount +1;
        }
        System.out.println("Cambio : " +maxChainge);
    }
}