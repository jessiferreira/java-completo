import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int num1 = sc.nextInt();
        double valorUni1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int num2 = sc.nextInt();
        double valorUni2 = sc.nextDouble();

        double calcValor = num1 * valorUni1 + num2 * valorUni2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", calcValor);

        sc.close();

    }
}
