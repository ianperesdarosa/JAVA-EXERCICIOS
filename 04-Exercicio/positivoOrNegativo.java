import java.util.Scanner;


public class positivoOrNegativo {
    public static void main(String[] ars) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite um numero: ");
            int db = input.nextInt();

            if (db > 0) {
                System.out.print(input + "Numero positivo!");
            } 

            else {
                System.out.print(input + "Numero negativo!");
            }
        }
    }
}
