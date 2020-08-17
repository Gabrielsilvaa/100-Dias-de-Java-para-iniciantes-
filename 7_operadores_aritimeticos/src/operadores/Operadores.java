package operadores;

public class Operadores {
    public static void main(String[] args) {

        //Variavel para realizar calculos
        Integer n1 = 10;
        Integer n2 = 35;

        //para realizar soma usamos o sinal de +
        Integer soma = n1 + n2;

        //para usar subtração usamos o sinal de -
        Integer sub = n1 - n2;

        //para usar o multiplicação usamos o sinal de *
        Integer mult = n1 * n2;

        //para dividir um numero usamos o sinal de /
        float div = n1 / n2.floatValue();

        System.out.println(soma);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);

        //para ver o restp de uma divisao usamos o sinal %
        double resto = 11 % 2;
        System.out.println(resto);
    }
}
