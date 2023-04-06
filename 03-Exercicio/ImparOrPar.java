public class ImparOrPar {
    public static void main() {
        int num = 5 ;
        int process = num % 2;

        if (process == 0) {
            System.out.println(num + " É um número par.");
        } else {
            System.out.println(num + " É um número ímpar.");
        }
    }
}
