import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*/

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, horas;
        double valorHora, salario;

        numeroFuncionario = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = horas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = %.2f\n", salario);

        sc.close();

    }
}
