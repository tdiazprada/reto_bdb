import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del arreglo: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int s = 1;

        String digitExcluded= Integer.toString(s);

        System.out.println("Los valores introducidos en el arreglo son:");

        for (int i = array.length - 1; i >= 0; i--) {
            String valorStr = Integer.toString(array[i]);

            String valueWithoutDigit = valorStr.replace(digitExcluded, "");


            if (!valueWithoutDigit.isEmpty()) {
                System.out.println(valueWithoutDigit);
            }
        }
    }
}