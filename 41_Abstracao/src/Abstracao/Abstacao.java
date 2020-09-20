package Abstracao;

public abstract class Abstacao {
    //criamos nosso
    private String fazersom = "auau";


    public String getFazersom() {
        return fazersom;
    }

    public void setFazersom(String fazersom) {
        this.fazersom = fazersom;
    }

    //criamos um metodo abstrato
    public abstract String getTipoAnimal();
}
