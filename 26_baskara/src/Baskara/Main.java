package Baskara;

public class Main {
    public static void main(String[] args) {

        //criamos nosso obj
        Baskara cacl = new Baskara();

        //passamos os parametros para realizar o calc
        cacl.letras[0] =  -2;
        cacl.letras[1] = - 2;
        cacl.letras[2] = 3;

        //pritamos o calc
        System.out.println(cacl.baskara(cacl.letras));

    }
}
