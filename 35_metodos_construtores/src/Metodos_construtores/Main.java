package Metodos_construtores;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //criamos um obj como teste
        MetodoConstrutor teste = new MetodoConstrutor();
        //printamos ele
        System.out.println(teste.num);

        //criamos um obj do tipo Scanner para entrada de dados
        Scanner entrada = new Scanner(System.in);
        //passamos valores para o n1
        int n1 = entrada.nextInt();

        //criamos o obj num1 e passamo o parametro que foi informado no metodo constutor
        MetodoConstrutor num1 = new MetodoConstrutor(n1);

        //pritamos ele 
        System.out.println(num1.num);
    }
}
