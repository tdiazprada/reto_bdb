import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del arreglo: ");

        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Numeros del arreglo: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int s= 1;
        int d= s*11;

        System.out.println("Cuadrado de los numeros: ");

        for (int i = 0; i < array.length; i++) {
            int doubleArray = array[i]*array[i];

            if (doubleArray<d){
                System.out.println(doubleArray);
            }else{
            }
        }
    }
}