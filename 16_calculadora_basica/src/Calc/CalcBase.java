package Calc;

import java.util.Scanner;

public class CalcBase {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("numero 1");
        int num1 = entrada.nextInt();
        System.out.println("numero 2");
        int num2 = entrada.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println(soma);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
    }
}
