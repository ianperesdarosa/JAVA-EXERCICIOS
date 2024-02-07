public class NotasAluno {

    public static void Main(String[] args) {
        App app = new App(6, 6, 9);

    }
}

class App {
    public App(int n1, int n2, int n3) {
        int res = n1 + n2 + n3;

        if (res >= 18) {
            System.out.println("Aprovado!");
        }
        else {
            System.out.println("Reprovado!");
        }
    }
}