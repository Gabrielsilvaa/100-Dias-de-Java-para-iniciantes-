package Heranca;

public class Mae {
    //criamos nosso altributo
    private String letra;
    public int numero = 10;

    //criamos nosso metodo constutor
    public Mae(){
        this.letra ="A";
    }
    public Mae(int num1){
        this.numero = num1;
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

    //criamos o metodo operação
    public int getOperacao(){
        //usamos o this para nos referenciar a um atributo/metodo local
        return this.numero + 40;
    }

}
