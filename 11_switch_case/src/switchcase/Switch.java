package switchcase;

public class Switch {
    public static void main(String[] args) {

        //Primeiro definimos a variável que vamos passar na condição
        String tomaagua = "abobrinha";

        //passamos a variável para ser verificada
        switch (tomaagua){

            //caso a variável possua o valor SIM ela vai retornar a
            case "sim":
                System.out.println("agua no copo");
            break;

            case "talvez":
                System.out.println("tomar agua");
            break;

            //caso nao tenha o valor de uma case ela retorna essa mensagem
            default:
                System.out.println("voce ja tomou agua hoje?");
        }

    }
}
