package dowhile;

public class Dowhile {
    public static void main(String[] args) {

        //variavel contadora
        Integer cont = 0;

        //do bloco de codigo que sera executado ao menos uma vez
        do {
            System.out.println(cont);
            cont++;
        }
        //while que ira fazer a condição

        while (cont < 0);
        System.out.println(cont);
    }
}
