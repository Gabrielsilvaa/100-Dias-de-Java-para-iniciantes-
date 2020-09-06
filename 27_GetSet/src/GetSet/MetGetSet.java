package GetSet;

public class MetGetSet {

    //criamos nosso atributo privado
    private String vegetal;

    //criamos nosso set a onde iremos atribuir o valor na nossa variavel
    public void setVegetal(String vetalFavorito){
        vegetal = vetalFavorito;
    }

    //retornamos nossa variavel
    public String getVegetal(){
        return vegetal;
    }

    //printamos nossa variavel
    public void mostraVegetal(){
        System.out.println("Seu vegetal favorito é " + getVegetal());
    }

}
