
package ifelse;

public class Ifelse {
    public static void main(String[] args) {

        Integer idade = 18;

        //iniciamos nosso bloco de condição aonde vamos verificar se a pessoa tem idade para comprar bebidas ou nao
        //então vamos ver se ele tem idade maior ou igual a 18 caso seja verdadeiro ele poderá comprar bebidas
        if(idade >= 18){
            System.out.println("Pode tirar CNH!");
        }
        //caso seja falso ele nao podera comprar bebidas
        else{
            System.out.println(("Não pode tirar CNH :/ "));
        }

        // (cond.)?cod. : cod.
        System.out.println((idade >= 18)? "Pode tirar CNH!" : "Não pode tirar CNH :/ ");

    }
}
