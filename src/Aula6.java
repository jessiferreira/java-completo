import java.util.Scanner;

public class Aula6 {

/*
        Estrutura Condicional Simples:

        public static void main(String[] args) {

            int x = 5;

            System.out.println("Bom dia!");

            if (x < 0) {
                System.out.println("Boa tarde!");
            }

            System.out.println("Boa noite!");

        }
    }
    ___________________________________________________
        // Estrutura Condicional Composta:

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int hora;

            System.out.println("Quantas horas?");
            hora = sc.nextInt();

            if (hora < 12) {
                System.out.println("Bom dia!");
            } else {
                System.out.println("Boa tarde!");
            }
            sc.close();
        }
    }
*/

    //Encadeamento de Estruturas Condicionais:

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else if (hora < 18) {
            System.out.println("Boa tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }
        sc.close();
    }
}
