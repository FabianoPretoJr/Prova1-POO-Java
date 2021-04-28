import java.util.Scanner;

public class Fibonacci {

    private static int[] vetAux = new int[50];
    private static int k;

    public static long fibo(int n) {
        k = 1;
        return recursao(n);
    }

    private static long recursao(int n) {
        if (n < 0) {
            return vetAux[0];
        } else {
            if (k < 3) {
                vetAux[n] = k - 1;
                k++;
            } else {
                vetAux[n] = vetAux[n + 1] + vetAux[n + 2];
            }
            return recursao(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        try{
            int numero;
            System.out.print("Digite um numero para a sequencia de Fibonacci: ");
            numero = leitor.nextInt();

            for (int i = 0; i < numero; i++) {
                System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
            }
        }
        finally{
            leitor.close();
        }
    }
}