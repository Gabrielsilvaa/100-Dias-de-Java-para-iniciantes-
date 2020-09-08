package ModificadorPrivate;

public class Main {

    public static void main(String[] args) {

        ModificadorPrivate teste = new ModificadorPrivate();

        teste.nome2 = "teste";
        //da erro pois esse atributo e do tipo private
        teste.nome1 = "teste";

    }

}
