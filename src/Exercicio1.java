import java.util.Scanner;

public class Exercicio1 {
    /*
    Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    mensagem explicativa, conforme exemplos.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int soma = x + y;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
