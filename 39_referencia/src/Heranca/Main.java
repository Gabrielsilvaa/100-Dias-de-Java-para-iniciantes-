package Heranca;

public class Main {
    public static void main(String[] args) {
        //Criamos nossos objs
        Mae mami = new Mae();
        Filho filhote = new Filho();

        //printamos a nossa msg
        System.out.println(mami.getTexto());
        System.out.println(filhote.getJuncao());
        System.out.println(mami.getOperacao());
        System.out.println(filhote.getOperacao());

    }
}
