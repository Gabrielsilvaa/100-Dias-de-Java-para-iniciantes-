package declaravariavel;

public class DeclaraVariavel {

    public static void main(String[] args) {

        //Primeiro Exemplo

        //vamos começar com variaveis com valores pre-definidos
        String algumnome = "Gabriel";
        int algumaidade = 11;
        final String nasc = "15/06/2010";

        //ultilziamos o + para realizar concatenação com variaveis
        System.out.println(algumnome + " tem " + algumaidade + " anos e nasceu " +  nasc);

        //Segundo exemplo

        //vamos começar com variaveis de valores não definidos
        String nome;
        int idade;
        final String datanasc = "15/06/2010";

        //Agora vamos atribuir valores para as variveis
        nome = "gabriel";
        idade = 11;

        //ultilziamos o + para realizar concatenação com variaveis
        System.out.println(nome + " tem " + idade + " anos e nasceu " +  datanasc);

    }

}
