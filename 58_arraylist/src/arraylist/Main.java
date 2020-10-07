package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //criamos nosso obj array
        ArrayList <Integer> teste = new ArrayList<>();
        //adicionamos intens no nosso array
        teste.add(1);
        teste.add(1);

        //alteramos o valor do nosso arraylist passando a index
        teste.set(0, 2);

        //removemos o valor que queremos passando a index index
        teste.remove(1);

        System.out.println(teste);



    }
}
