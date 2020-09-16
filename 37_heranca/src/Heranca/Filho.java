package Heranca;
//adicionamos o extends para falar que vamos ter herança
public class Filho extends Mae {
    //criamos um novo atriburo
    private String Letra2;

    //criamos nosso metodo construtor
    public Filho(){
        this.Letra2 = "B";
    }
    //criamos nosso metodos gets e sets
    public String getLetra2() {
        return Letra2;
    }
    public void setLetra2(String letra2) {
        Letra2 = letra2;
    }
    //criamos um metodo juncao que usa o metodo getTexto da nossa classe mae
    public String getJuncao(){
        return getTexto() + " " + getLetra2();
    }
}
