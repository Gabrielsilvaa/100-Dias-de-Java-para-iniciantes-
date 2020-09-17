package Overload;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //exemplo de metodo construtor com overload
        Overload fix = new Overload(10,30);
        System.out.println(fix.n1 + " " + fix.n2);

        //criamos nosso metodo construtor
        Overload calc = new Overload();
        Scanner entrada = new Scanner(System.in);
        calc.num1 = entrada.nextDouble();
        calc.num2 = entrada.nextDouble();
        //usamos nosso metodo sobrecarregado
        System.out.println(calc.operacao(fix.num1, fix.num2));


    }
}
