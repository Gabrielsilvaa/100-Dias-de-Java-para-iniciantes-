package teste;

public class Main {

    public static void main(String[] args) {
        //criamos nosso obj
        TesteMath div = new TesteMath();

        //passamos os valores para nossos atributos
        div.num1 = 20;
        div.num2 = 2;

        //exibe o calculo matematico
        System.out.println(div.cacl(div.num1, div.num2));

    }

}
