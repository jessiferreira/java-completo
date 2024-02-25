import java.util.Locale;
import java.util.Scanner;

public class Exercico6 {

/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:

a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B
*/

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, areaTri, areaCir, areaTrap, areaQua, areaRet;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaTri = A * C / 2.0;
        areaCir = 3.14159 * C * C;
        areaTrap = (A + B) / 2.0 * C;
        areaQua = B * B;
        areaRet = A * B;

        System.out.printf("TRIANGULO: %.3f\n", areaTri);
        System.out.printf("CIRCULO: %.3f\n", areaCir);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrap);
        System.out.printf("QUADRADO: %.3f\n", areaQua);
        System.out.printf("RETANGULO: %.3f\n", areaRet);

        sc.close();

    }
}
