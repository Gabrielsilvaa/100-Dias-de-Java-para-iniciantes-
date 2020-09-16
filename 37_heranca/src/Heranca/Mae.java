package Heranca;

public class Mae {
    //criamos nosso obj
    private String letra;

    //criamos nosso metodo constutor
    public Mae(){
        this.letra ="A";
    }

    //criamos nossos metodos gets e sets
    public String getLetra() {
        return letra;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }

    //criamos um metodo para juntar nosso atributo com texto
    public String  getTexto(){
        return this.letra + " com ";
    }

}
