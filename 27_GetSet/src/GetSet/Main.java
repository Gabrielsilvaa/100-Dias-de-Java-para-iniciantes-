package GetSet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //criamos uma variavel
        String vegetal;

        //criamos nosso obj
        MetGetSet veg = new MetGetSet();
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite seu vegetal favorito");
        vegetal = entrada.nextLine();

        //passanis o valor para nosso metodo set
        veg.setVegetal(vegetal);
        //printamos o resuldado 
        veg.mostraVegetal();
    }
}
