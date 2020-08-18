package operadores;

public class Operadores {
    public static void main(String[] args) {

        Integer n1 = 2;

        //Para nos realizar um encremento em uma variavel usamos o simbulo de ++
        n1++;
        System.out.println(n1);

        //Para nos realizar um dencremento em uma variavel usamos o simbulo de ++
        n1--;
        System.out.println(n1);

        Integer n2 = 4;
        Integer n3 = 4;

        /*
        * == operador de igual
        * != operador de diferença
        * >  operador maior
        * <  operador menor
        * >= operador maior igual
        * <= operador menor igual
        * */

        Boolean igual = n2 == n3;
        Boolean diferente = n2 != n3;
        Boolean maior = n2 > n3;
        Boolean menor = n2 < n3;
        Boolean maiorigual = n2 >= n3;
        Boolean menorigual = n2 <= n3;

        System.out.println(igual + " " + diferente + " " + maior + " " + menor + " " + maiorigual + " " + menorigual);

    }
}
