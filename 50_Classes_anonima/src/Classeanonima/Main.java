package Classeanonima;

public class Main {
    public static void main(String[] args) {

        //chamamos nossas classes
        Empregado teste = new Empregado();
        Funcionario teste2 = new Funcionario();

        //imprimimos os valores
        teste.mandachuva();
        teste2.print();

        //chamamos nosso metodo a onde atribuimos uma interface
        comida(new Teste(){
            //codificamos nossa interface
            public void biscoito(){
                System.out.println("biscoito");
            };
        });
    }

    //chamamos nosso interface atravez de um metodo
    public static void comida(Teste t){
        t.biscoito();
    }
}
