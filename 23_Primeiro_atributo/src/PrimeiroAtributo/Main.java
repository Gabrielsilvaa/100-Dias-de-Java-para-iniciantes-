package PrimeiroAtributo;

public class Main {
    public static void main(String[] args) {

        //criamos nosso obj
        Program doces = new Program();

        //passamos os dados para nossos atribuos
        doces.doces = "Chocolate";
        doces.sabor = "chocolate ao leite";
        doces.tipo = "Chocolate";
        doces.peso = 40.0;

        //imprimimos nossos atributos
        System.out.println(doces.doces);
        System.out.println(doces.sabor);
        System.out.println(doces.tipo);
    }
}
