package Abstracao;

public class Animal extends Abstacao {

    public String tipoAnimal = "Cachorro";

    //estaciamos nosso metodo abstrato 

    @Override
    public String getTipoAnimal() {
        if("auau".equals(getFazersom())){
            return  this.tipoAnimal;
        }else{
            return "desconhecido";
        }
    }
}
