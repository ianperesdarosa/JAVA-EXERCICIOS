public class primoOrNon {
    // Função para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        // Caso especial para números menores que 2
        if (numero < 2) {
            return false;
        }

        // Verifica divisibilidade até a raiz quadrada do número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                // Se for divisível por algum número, não é primo
                return false;
            }
        }

        // Se não foi divisível por nenhum número, é primo
        return true;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int numero = 1;

        if (ehPrimo(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}