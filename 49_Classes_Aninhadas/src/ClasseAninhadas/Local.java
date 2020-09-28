package ClasseAninhadas;

public class Local {
    //criamos um metodo
    public void viewText(){

        //criamos uma classe dentro de um metodo
        class Aninhada{

            //criamos um metodo
            public void doces(){
                System.out.println("Quero doce");
            }
        }
        //chamamos nossa classe local
        Aninhada doces = new Aninhada();

        //chamamos nosso metodo
        doces.doces();
    }

    public static void main(String[] args) {
        //chamamos e printamos a mensagem
        Local teste = new Local();
        teste.viewText();
    }
}
